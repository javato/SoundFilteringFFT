import static java.lang.Math.*;
import java.util.ArrayList;

/**
 *
 * @author Javier Roldan
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
 
    
    //Calculate the Fast Fourier Transform
    public ArrayList<Complex> fft(){
        ArrayList<Complex> x = new ArrayList<Complex>(this.input);
        int n = this.input.size();
        
        // Check if the size of the input is a power of 2
        if (Integer.highestOneBit(n) != n) {
            System.out.println("The size of the input is not a power of 2");
        }

        // Bit reverse
        int shift = 1 + Integer.numberOfLeadingZeros(n);
        for (int i = 0; i < n; i++) {
            int j = Integer.reverse(i) >>> shift;
            if (j > i) {
                Complex temp = x.get(j);
                x.set(j, x.get(i));
                x.set(i, temp);
            }
        }
        
        // Algorithm processing
        for (int i = 2; i <= n; i = i + i) {
            //System.out.println("first for: ");
            for (int j = 0; j < i / 2; j++) {
                double formula = -2 * j * Math.PI / i;
                Complex w = new Complex(Math.cos(formula), Math.sin(formula));
                for (int k = 0; k < n / i; k++) {
                    Complex complex = w.mult(x.get(k * i + j + i / 2));
                    x.set(k * i + j + i / 2, x.get(k * i + j).sub(complex)); 
                    x.set(k * i + j, x.get(k * i + j).add(complex));
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
  

