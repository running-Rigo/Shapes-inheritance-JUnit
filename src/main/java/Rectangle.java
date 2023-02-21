public class Rectangle extends Shape{
    public double width;
    public double length;

    public Rectangle(String color, boolean isFilled, double width, double length) throws IllegalArgumentException {
        super(color, isFilled);
        if( width <= 0 || length <= 0){
            throw new IllegalArgumentException();
        }

        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean isFilled, double sideLength) throws IllegalArgumentException{
        super(color, isFilled);
        if(sideLength <= 0){
            throw new IllegalArgumentException();
        }
        this.width = sideLength;
        this.length = sideLength;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) throws IllegalArgumentException {
        if (width <= 0){
            throw new IllegalArgumentException();
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) throws IllegalArgumentException {
        if ( length <= 0){
            throw new IllegalArgumentException();
        }
        this.length = length;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getPerimeter() {
        return 2*length+ 2*width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", isFilled=" + isFilled +
                '}';
    }

    @Override
    public double getSizeValues(String valueName) throws IllegalArgumentException{

        if(valueName.equals("length")){
            return this.getLength();
        }
        else if(valueName.equals("width")){
            return this.getWidth();
        }
        else{
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void setSizeValues(String valueName, double value) throws IllegalArgumentException{
        if( valueName.equals("width")){
            this.setWidth(value);
        }
        else if( valueName.equals("length")){
            this.setLength(value);
        }
        else{
            throw new IllegalArgumentException();
        }
    }


}
