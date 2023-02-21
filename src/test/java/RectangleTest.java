import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectangleTest {
    private int a;
    private int b;
    private Rectangle rectangle;

    @BeforeEach
    void setUp(){
        a = 1;
        b = 2;
        rectangle = new Rectangle("#EB984E", true, a, b);
        System.out.println(rectangle);
    }

    @Test
    void setSizeValuesTest(){
        rectangle.setSizeValues("width", 25);
        rectangle.setSizeValues("length", 344);
        assertEquals(25, rectangle.getSizeValues("width"));
        assertEquals(344, rectangle.getSizeValues("length"));
    }

    @Test
    void getAreaTest(){
        assertEquals(a*b, rectangle.getArea());
        a = 5;
        b = 10;
        rectangle.setSizeValues("length", a);
        rectangle.setSizeValues("width", b);
        assertEquals(a*b, rectangle.getArea());
        a = 10;
        b = 20;
        rectangle.setSizeValues("length", a);
        rectangle.setSizeValues("width", b);
        assertEquals(a*b, rectangle.getArea());
    }

    @Test
    void getPerimeterTest(){
        assertEquals(2*a+2*b, rectangle.getPerimeter());
        a = 5;
        b = 10;
        rectangle.setSizeValues("length", a);
        rectangle.setSizeValues("width", b);
        assertEquals(2*a+2*b, rectangle.getPerimeter());
        a = 10;
        b = 20;
        rectangle.setSizeValues("length", a);
        rectangle.setSizeValues("width", b);
        assertEquals(2*a+2*b, rectangle.getPerimeter());
    }

    @Test
    void illegalArgumentExceptionTest(){
        assertThrows(IllegalArgumentException.class, () -> rectangle.setSizeValues("width", 0));
        assertThrows(IllegalArgumentException.class, () -> rectangle.setSizeValues("width", -1));
        assertThrows(IllegalArgumentException.class, () -> rectangle.setSizeValues("length", 0));
        assertThrows(IllegalArgumentException.class, () -> rectangle.setSizeValues("length", -1));
        assertThrows(IllegalArgumentException.class, () -> new Rectangle("red", false, 0, 4.5));
        assertThrows(IllegalArgumentException.class, () -> new Rectangle("red", false, 3, -1.5));
    }









}
