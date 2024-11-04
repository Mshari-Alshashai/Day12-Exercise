public class Main {
    public static void main(String[] args) {

        Shape s1 = new Shape("Black",true);
        Circle c1 = new Circle("Green",false,5);
        Rectangle r1 = new Rectangle("Red",true,6,4);
        Square sq1 = new Square("Blue",true,5);


        System.out.println(s1.toString());
        System.out.println("----------------------------------------------");
        System.out.println(c1.toString());
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println("----------------------------------------------");
        System.out.println(r1.toString());
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        System.out.println("----------------------------------------------");
        System.out.println(sq1.toString());
        System.out.println(sq1.getArea());
        System.out.println(sq1.getPerimeter());
        System.out.println("----------------------------------------------");

    }
}