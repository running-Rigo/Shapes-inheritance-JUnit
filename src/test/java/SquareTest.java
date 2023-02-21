import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SquareTest {
    private int a;
    private Square square;

    @BeforeEach
    void setUp(){
        a = 1;
        square = new Square ("#EB984E", true, a);
        System.out.println(square);
    }

    @Test
    void setSizeValuesTest(){
        square.setSizeValues("length", 37);
        assertEquals(37, square.getSizeValues("length"));
        assertEquals(37, square.getSizeValues("width"));
        square.setSizeValues("width", 203);
        assertEquals(203, square.getSizeValues("length"));
        assertEquals(203, square.getSizeValues("width"));
    }

    @Test
    void getAreaTest(){
        assertEquals(a*a, square.getArea());
        a = 5;
        square.setSizeValues("length", a);
        assertEquals(a*a, square.getArea());
        a = 10;
        square.setSizeValues("length", a);
        assertEquals(a*a, square.getArea());
    }

    @Test
    void getPerimeterTest(){
        assertEquals(4*a, square.getPerimeter());
        a = 5;
        square.setSizeValues("length", a);
        assertEquals(4*a, square.getPerimeter());
        a = 10;
        square.setSizeValues("length", a);
        assertEquals(4*a, square.getPerimeter());
    }

    @Test
    void illegalArgumentExceptionTest(){
        assertThrows(IllegalArgumentException.class, () -> square.setSizeValues("length", 0));
        assertThrows(IllegalArgumentException.class, () -> square.setSizeValues("width", -1));
        assertThrows(IllegalArgumentException.class, () -> new Square("red", false, 0));
        assertThrows(IllegalArgumentException.class, () -> new Square("red", false, -1));
    }


}
