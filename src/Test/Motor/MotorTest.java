package Test.Motor;

import org.junit.jupiter.api.Test;

import static javafx.beans.binding.Bindings.when;
import static org.junit.jupiter.api.Assertions.*;

class MotorTest {

    @Test
    void getPotencia() {
        Motor m = new Motor(150);

        assertEquals(110,m.getPotencia(),1);
    }
}