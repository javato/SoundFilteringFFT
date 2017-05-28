/**
 *
 * @author Javier Roldan
 */

public class Complex {
    public final double re;
    public final double im;
 
    public Complex() {
        this(0, 0);
    }
 
    public Complex(double r, double i){
        re = r;
        im = i;
    }
 
    public Complex add(Complex b){
        return new Complex(this.re + b.re, this.im + b.im);
    }
 
    public Complex sub(Complex b){
        return new Complex(this.re - b.re, this.im - b.im);
    }
 
    public Complex mult(Complex b){
        return new Complex(this.re * b.re - this.im * b.im,
                this.re * b.im + this.im * b.re);
    }
    
    public Complex conj(){
        return new Complex(this.re, -this.im);
    }
    
    public Complex divReal(int n){
        return new Complex(this.re / ((double)n), this.im);
    }
    
    /*public Complex getZero(){
        return new Complex(0.0, 0.0);
    }*/
    
    public double getReal(){
        return this.re;
    }
    
    public double abs() {
        return Math.hypot(this.re, this.im);
    }
 
    @Override
    public String toString() {
        return String.format("(" + this.re + ", " + this.im + "i)");
        
    }
}