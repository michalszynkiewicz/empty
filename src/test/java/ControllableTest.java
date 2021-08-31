import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class ControllableTest {

    @Test
    public void shouldDoWhateverWeWant() {
        String fail = System.getProperty("fail");
        if (Boolean.TRUE.toString().equalsIgnoreCase(fail)) {
            fail("Forced failure");
        } else {
            System.out.println("Test succeeded");
        }
    }
}
