import org.example.classes.CalculateArea;
import org.example.classes.TypeShape;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculateShapes {

        @Test
        @DisplayName("Check id the calculateShape method")
        void calculateAreaTest_OK() {

            assertEquals(10, CalculateArea.calculateArea(TypeShape.RECTANGLE, 5, 2));
            assertEquals(25, CalculateArea.calculateArea(TypeShape.SQUARE, 5));
            assertEquals(Math.PI, CalculateArea.calculateArea(TypeShape.CIRCLE, 1));
        }
}

