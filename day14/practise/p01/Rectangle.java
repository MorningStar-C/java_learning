package day14.practise.p01;

public class Rectangle implements Area{
    private double width;
    private double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double l() {
        return 2. * this.width * this.length;
    }

    @Override
    public double s() {
        return this.width * this.length;
    }

    

    

    
}
