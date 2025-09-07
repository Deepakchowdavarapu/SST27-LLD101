
public class Demo05 {
    public static void main(String[] args) {
        Quadrilateral r = new Rectangle();
        r.setWidth(5);
        r.setHeight(10);
        System.out.println("Area of Rectangle: " + r.area());

        Quadrilateral s = new Square();
        s.setWidth(5);
        s.setHeight(10); 
        System.out.println("Area of Square: " + s.area());
    }
}
