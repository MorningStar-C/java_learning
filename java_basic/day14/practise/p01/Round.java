package day14.practise.p01;

public class Round implements Area{
    private double r;
    private final double PI = 3.14;

    
    public Round() {
    }

    public Round(double r) {
        this.r = r;
    }
    
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getPI() {
        return PI;
    }

    @Override
    public double l() {
        return 2. * this.PI * this.r;
    }

    @Override
    public double s() {
        return this.PI * this.r * this.r;
    }
    
}
