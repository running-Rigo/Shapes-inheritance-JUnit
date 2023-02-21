public abstract class Shape {

    public String color;
    public boolean isFilled;

    public Shape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract double getSizeValues(String valueName) throws IllegalArgumentException;

    public abstract void setSizeValues(String valueName, double value) throws IllegalArgumentException;
}
