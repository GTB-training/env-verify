package gtb.env.verify;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AppTest {

    @Test
    void appHasAGreeting() {
        App classUnderTest = new App();
        assertTrue(Integer.parseInt(classUnderTest.getProperty("java.version").split("\\.")[0]) >= 11);
    }
}
