import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.geekbrains.java.level3.Task2;

public class Task2Test {
    private Task2 task2;

    @BeforeEach
    public void init() {
        task2 = new Task2();
    }

    @Test
    public void metTest() {
        Assertions.assertAll(
                () -> {
                    Assertions.assertEquals(false, task2.met(new int[]{1,4,1,4,1,4,1}));
                },
                () -> {
                    Assertions.assertEquals(true, task2.met(new int[]{1,4,1,4,1,4,1,4}));
                },
                () -> {
                    Assertions.assertEquals(true, task2.met(new int[]{1,1,1,4,4,4}));
                },
                () -> {
                    Assertions.assertEquals(false, task2.met(new int[]{1,4,1,4,1,4,3}));
                }
        );
    }
}
