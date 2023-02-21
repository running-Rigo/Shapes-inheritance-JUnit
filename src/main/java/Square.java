public class Square extends Rectangle{

    public Square(String color, boolean isFilled, double sideLength) throws IllegalArgumentException {
        super(color, isFilled, sideLength);

    }

    public void setSideLength(double sideLength){
        setWidth(sideLength);
        setLength(sideLength);
    }


    @Override
    public void setSizeValues(String valueName, double value) throws IllegalArgumentException{
        if( !(valueName.equals("sidelength") || valueName.equals("length") || valueName.equals("width"))){
            throw new IllegalArgumentException();
        }
        this.setWidth(value);
        this.setLength(value);
    }

    @Override
    public void setLength(double length) throws IllegalArgumentException{
        if ( length <= 0){
            throw new IllegalArgumentException();
        }
        this.width = length; //Wenn Länge geändert wird, wird die  Breite automatisch gleichgesetzt;
        this.length = length;
    }

    @Override
    public void setWidth(double width) throws IllegalArgumentException{
        if ( width <= 0){
            throw new IllegalArgumentException();
        }
        this.length = length;
        this.width = length; //Wenn Breite geändert wird, wird die Länge automatisch gleichgesetzt;
    }


}
