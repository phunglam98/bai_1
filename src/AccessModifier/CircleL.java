package AccessModifier;

public class CircleL {
    private double radius = 1.0;
    private String color = "red";
    CircleL() {}
    CircleL(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(double radius) {
        return Math.pow(radius, 2) * 3.14;
    }
}
class Test {
    public static void main(String[] args) {
        CircleL circle1 = new CircleL(6.3);
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getArea(6.3));
    }
}
