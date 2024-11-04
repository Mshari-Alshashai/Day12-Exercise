public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle() {}

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width>=0)this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (width>=0) this.length = length;
    }

    public double getArea(){
        return (width*length);
    }

    public double getPerimeter(){
        return ((2*length)+(2*width));
    }

    @Override
    public String toString() {
        return "A Rectangle with width= "+getWidth()+" and length= "+getLength()+" Which is a subclass of \n"+ super.toString();
    }
}
