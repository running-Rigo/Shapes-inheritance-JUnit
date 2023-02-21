public class Circle extends Shape {
    private final double pi = Math.PI;
    private double radius;


    public Circle(String color, boolean isFilled, double radius) throws IllegalArgumentException{
        super(color, isFilled);
        if( radius <= 0 ){
            throw new IllegalArgumentException();
        }
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws IllegalArgumentException {
        if( radius <= 0 ){
            throw new IllegalArgumentException();
        }
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", isFilled=" + isFilled +
                '}';
    }

    @Override
    public double getArea() {
        return radius*radius*pi;
    }

    @Override
    public double getPerimeter(){
        return 2*radius*pi;
    }

    @Override
    public double getSizeValues(String valueName){
        if( !valueName.equals("radius")){
            throw new IllegalArgumentException();
        }
        return getRadius();
    }

    @Override
    public void setSizeValues(String valueName, double value) throws IllegalArgumentException{
        if (!valueName.equals("radius")) {
            throw new IllegalArgumentException();
        }
        setRadius(value);
    }
}
