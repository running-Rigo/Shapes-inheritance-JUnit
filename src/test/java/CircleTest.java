import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CircleTest {
    private Circle circle;
    private double radius;
    private final double pi = Math.PI;

    @BeforeEach
    void setUp(){
        radius = 1;
        circle = new Circle ("#EB984E", true, radius);
        System.out.println(circle);
    }

    @Test
    void setSizeValuesTest(){
        circle.setSizeValues("radius", 30);
        assertEquals(30, circle.getSizeValues("radius"));
    }

    @Test
    void getAreaTest(){
        assertEquals(pi*radius*radius, circle.getArea());
        radius = 5;
        circle.setSizeValues("radius", radius);
        assertEquals(pi*radius*radius, circle.getArea());
        radius = 10;
        circle.setSizeValues("radius", radius);
        assertEquals(pi*radius*radius, circle.getArea());
    }

    @Test
    void getPerimeterTest(){
        assertEquals(2*pi*radius, circle.getPerimeter());
        radius = 5;
        circle.setSizeValues("radius", radius);
        assertEquals(2*pi*radius, circle.getPerimeter());
        radius = 10;
        circle.setSizeValues("radius", radius);
        assertEquals(2*pi*radius, circle.getPerimeter());
    }

    @Test
    void illegalArgumentExceptionTest(){
        assertThrows(IllegalArgumentException.class, () -> circle.setSizeValues("radius", 0));
        assertThrows(IllegalArgumentException.class, () -> circle.setSizeValues("radius", -1));
        assertThrows(IllegalArgumentException.class, () -> new Circle("red", false, 0));
        assertThrows(IllegalArgumentException.class, () -> new Circle("red", false, -1));
    }
}
