public class Circle {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateArea(){
        return Math.PI*Math.pow(getRadius(),getRadius());
    }

    public double calculatePerimeter() {
        return 2*Math.PI*getRadius();
    }

}
