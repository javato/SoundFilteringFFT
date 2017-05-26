import static java.lang.Math.*;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jvt-WinLaptop
 */

public class FastFourierTransform {
    ArrayList<Complex> input = new ArrayList<Complex>();
    public FastFourierTransform(){
        
    }
 
    public static int bitReverse(int n, int bits) {
        int reversedN = n;
        int count = bits - 1;
 
        n >>= 1;
        while (n > 0) {
            reversedN = (reversedN << 1) | (n & 1);
            count--;
            n >>= 1;
        }
 
        return ((reversedN << count) & ((1 << bits) - 1));
    }
 
    public ArrayList<Complex> fft1() {
        ArrayList<Complex> output = new ArrayList<Complex>(this.input);
        System.out.println("size input: " + this.input.size());
        /*for (int i = 0; i < this.input.size(); i++) {
            output.set(i, this.input.get(i));
        }*/
        //output = this.input;
 
        int bits = (int) (log(output.size()) / log(2));
        System.out.println("BITS: " + bits);
        for (int j = 1; j < output.size() / 2; j++) {
 
            int swapPos = bitReverse(j, bits);
            Complex temp = output.get(j);
            output.set(j, output.get(swapPos));
            output.set(swapPos, temp);
        }
 
        for (int N = 2; N <= output.size(); N <<= 1) {
            for (int i = 0; i < output.size(); i += N) {
                for (int k = 0; k < N / 2; k++) {
                    //System.out.println("PROCESSING");
                    int evenIndex = i + k;
                    int oddIndex = i + k + (N / 2);
                    Complex even = output.get(evenIndex);
                    Complex odd = output.get(oddIndex);
 
                    double term = (-2 * PI * k) / (double) N;
                    Complex exp = (new Complex(cos(term), sin(term)).mult(odd));
 
                    output.set(evenIndex, even.add(exp));
                    output.set(oddIndex, even.sub(exp));
                }
            }
        }
        //System.out.println("FINISHHHHHHHHH");
        return output;
    }
    
    // compute the FFT of x[], assuming its length is a power of 2
    public ArrayList<Complex> fft2() 
    {
        int N = this.input.size();
        System.out.println("ffttttttttttttt:  " + N);
        // base case
        if (N == 1){
            System.out.println("IF N = 1");
            return new ArrayList<Complex>(this.input.subList(0, 1));
        }


        // radix 2 Cooley-Tukey FFT
        if (N % 2 != 0) 
        {
            throw new RuntimeException("N is not a power of 2");
        }

        // fft of even terms
        ArrayList<Complex> even = new ArrayList<Complex>();
        for (int k = 0; k < N / 2; k++) 
        {
            even.add(this.input.get(2 * k));
        }

        FastFourierTransform fftEven = new FastFourierTransform();
        fftEven.putArrayList(even);
        ArrayList<Complex> q = new ArrayList<Complex>(fftEven.fft());

        // fft of odd terms
        ArrayList<Complex> odd = new ArrayList<Complex>(even); // reuse the array
        for (int k = 0; k < N / 2; k++) 
        {
            odd.add(this.input.get(2 * k + 1));
        }
        FastFourierTransform fftOdd = new FastFourierTransform();
        fftOdd.putArrayList(odd);
        ArrayList<Complex> r = new ArrayList<Complex>(fftOdd.fft());

        // combine
        ArrayList<Complex> y = new ArrayList<Complex>();
        for (int k = 0; k < N / 2; k++) 
        {
            double kth = -2 * k * Math.PI / N;
            Complex wk = new Complex(Math.cos(kth), Math.sin(kth));
            y.add(q.get(k).add(wk.mult(r.get(k))));
            //y.set(k + N / 2, q.get(k).add(wk.mult(r.get(k))));
            //y.set(k + N / 2, q.get(k).add(wk.mult(r.get(k))));

            //y[k] = q[k].add(wk.mult(r[k]));
            //y[k + N / 2] = q[k].add(wk.mult(r[k]));
        }

        for (int k = 0; k < N / 2; k++) 
        {
            double kth = -2 * k * Math.PI / N;
            Complex wk = new Complex(Math.cos(kth), Math.sin(kth));
            y.set(k + N / 2, q.get(k).sub(wk.mult(r.get(k))));
        }
        return y;
    }
     
    //Calculate the Fast Fourier Transform
    public ArrayList<Complex> fft(){
        ArrayList<Complex> x = new ArrayList<Complex>(this.input);
        int n = this.input.size();
        
        // check if the lenght of the input is a power of 2
        if (Integer.highestOneBit(n) != n) {
            throw new RuntimeException("n is not a power of 2");
        }

        // bit reverse
        int shift = 1 + Integer.numberOfLeadingZeros(n);
        for (int k = 0; k < n; k++) {
            int j = Integer.reverse(k) >>> shift;
            if (j > k) {
                Complex temp = x.get(j);
                x.set(j, x.get(k));
                x.set(k, temp);
            }
        }
        
        // Algorithm processing
        for (int i = 2; i <= n; i = i + i) {
            //System.out.println("first forrrrr: ");
            for (int j = 0; j < i/2; j++) {
                double formula = -2 * j * Math.PI / i;
                Complex w = new Complex(Math.cos(formula), Math.sin(formula));
                for (int k = 0; k < n/i; k++) {
                    Complex complex = w.mult(x.get(k*i + j + i/2));
                    x.set(k * i + j + i/2, x.get(k*i + j).sub(complex)); 
                    x.set(k * i + j, x.get(k*i + j).add(complex));
                }
            }
        }
        return x;
    }
    
    public ArrayList<Double> ifft(){
        ArrayList<Double> output = new ArrayList<Double>();
        ArrayList<Complex> conj = new ArrayList<Complex>();
        ArrayList<Complex> fftConj; 
        ArrayList<Complex> ConjfftConj = new ArrayList<Complex>();
        ArrayList<Complex> DivConjfftConj = new ArrayList<Complex>();
        
        // [1] - Conjugating...
        System.out.println("[1] ---CONJUGADO---");
        //conj = this.getArrayList();
        for (int i = 0; i < this.input.size(); i++) {
            //this.input.set(i, this.input.get(i).conj());
            conj.add(this.input.get(i).conj());
        }
        //this.putArrayList(conj);
        //System.out.println(conj);
        
        // [2] - Processing FFT...
        System.out.println("[2] ---FFT---");
        FastFourierTransform fft2 = new FastFourierTransform();
        fft2.putArrayList(conj);
        fftConj = new ArrayList<Complex>(fft2.fft());
        
        //debug
        /*
        for (int i = 0; i < fftConj.size(); i++) {
            System.out.println(fftConj.get(i).re);
        }*/
        
        
        // [3] - Conjugating...
        System.out.println("[3] ---CONJUGADO---");
        for (int i = 0; i < this.input.size(); i++) {
            //fftConj.set(i, fftConj.get(i).conj());
            ConjfftConj.add(fftConj.get(i).conj());
        }
        //System.out.println(ConjfftConj.toString());
        
        // [4] - Dividing...
        System.out.println("[4] ---DIVIDIENDO---");
        for (int i = 0; i < this.input.size(); i++) {
            DivConjfftConj.add(fftConj.get(i).divReal(this.input.size()));
        }
        //System.out.println(DivConjfftConj.toString());
        
        // RETURN
        for (int i = 0; i < this.input.size(); i++) {
            output.add(DivConjfftConj.get(i).getReal());
        }
        return output;
    }
    
    public void putArrayList(ArrayList<Complex> input){
        //this.input = input;
        for (int i = 0; i < input.size(); i++) {
            this.input.add(input.get(i));
        }
    }
    
    public ArrayList<Complex> getArrayList(){
        return this.input;
    }
}
  

