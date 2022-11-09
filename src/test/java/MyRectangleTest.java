import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import org.junit.jupiter.api.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MyRectangleTest {

    private MyRectangle defaultRectangle;
    private MyRectangle builtRectangle;
    private static MyRectangle[] testRectangles;

    @BeforeAll
    static void init () {
        testRectangles = new MyRectangle[] {new MyRectangle(75, 63, 90, 35),
                new MyRectangle(90, 90, 100, 100), new MyRectangle(415, 555, 76, 144),
                new MyRectangle(225, 255, 232, 255)};
    }

    @BeforeEach
    void eachInit () {
        defaultRectangle = new MyRectangle();
    }

    @DisplayName("Area for custom rectangle")
    @Test
    void area_customValues100Width75Height_return7500 () {
        builtRectangle = new MyRectangle(30, 50, 100, 75);
        int area = builtRectangle.area();
        assertEquals(7500, area);
    }

    @DisplayName("Area for default rectangle")
    @Test
    void area_defaultRectangle_return0 () {
        int area = defaultRectangle.area();
        assertEquals(0, area);
    }

    private static Stream<Arguments> provideRectanglesForIsInside_allValid() {
        return Stream.of(
                Arguments.of(testRectangles[0], 94, 81),
                Arguments.of(testRectangles[1], 164, 103),
                Arguments.of(testRectangles[2], 420, 600),
                Arguments.of(testRectangles[3], 299, 333)
        );
    }

    @DisplayName("isInside test for custom rectangles all valid points")
    @ParameterizedTest
    @MethodSource("provideRectanglesForIsInside_allValid")
    void isInside_customerRectangles_allValid_returnTrue (MyRectangle rect, int x, int y) {
        boolean isInside = rect.isInside(x, y);
        assertTrue(isInside);
    }

    private static Stream<Arguments> provideRectanglesForIsInside_allOnBorders() {
        return Stream.of(
                Arguments.of(testRectangles[0], 165, 81),
                Arguments.of(testRectangles[1], 164, 190),
                Arguments.of(testRectangles[2], 491, 699),
                Arguments.of(testRectangles[3], 456, 510)
        );
    }

    @DisplayName("isInside test for custom rectangles all valid points on borders")
    @ParameterizedTest
    @MethodSource("provideRectanglesForIsInside_allOnBorders")
    void isInside_customerRectangles_allValidOnBorder_returnTrue (MyRectangle rect, int x, int y) {
        boolean isInside = rect.isInside(x, y);
        assertTrue(isInside);
    }

    private static Stream<Arguments> provideRectanglesForIsInside_allInvalid() {
        return Stream.of(
                Arguments.of(testRectangles[0], 166, 81),
                Arguments.of(testRectangles[1], 190, 80),
                Arguments.of(testRectangles[2], 414, 600),
                Arguments.of(testRectangles[3], 456, 200)
        );
    }

    @DisplayName("isInside test for custom rectangles all invalid points")
    @ParameterizedTest
    @MethodSource("provideRectanglesForIsInside_allInvalid")
    void isInside_customerRectangles_allInvalidPoints_returnFalse (MyRectangle rect, int x, int y) {
        boolean isInside = rect.isInside(x, y);
        assertFalse(isInside);
    }

    @DisplayName("To String custom rectangle")
    @Test
    void toString_customRectangle () {
        builtRectangle = new MyRectangle(57, 62, 60, 100);
        String display = builtRectangle.toString();
        assertEquals("Width: 60 Height: 100 X: 57 Y: 62", display);
    }

    @DisplayName("toString default rectangle")
    @Test
    void toString_defaultRectangle () {
        String display = defaultRectangle.toString();
        assertEquals("Width: 0 Height: 0 X: 0 Y: 0", display);
    }

    @DisplayName("Setting the size of rectangle via setter")
    @Test
    void setSize_builtRectangle () {
        builtRectangle = new MyRectangle(57, 62, 60, 100);
        builtRectangle.setSize(111, 91);
        String display = builtRectangle.toString();
        assertEquals("Width: 111 Height: 91 X: 57 Y: 62", display);
    }

    @DisplayName("Setting the position of rectangle via setter")
    @Test
    void setPosition_builtRectangle () {
        builtRectangle = new MyRectangle(57, 62, 60, 100);
        builtRectangle.setPosition(90, 33);
        String display = builtRectangle.toString();
        assertEquals("Width: 60 Height: 100 X: 90 Y: 33", display);
    }

    @AfterEach
    void tearDown () {
        defaultRectangle = null;
    }

}
