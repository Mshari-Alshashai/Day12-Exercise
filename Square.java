public class Square extends Rectangle{

    public Square() {}

    public Square(String color, boolean filled, double side) {
        super(color,filled,side,side);
    }

    public Square(double side) {
        side= getWidth();
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }

    @Override
    public String toString() {
        return "A Square with side= "+getSide()+" Which is a subclass of \n"+super.toString();
    }
}
