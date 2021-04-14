import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.geekbrains.java.level3.Task1;

public class Task1Test {
    private Task1 task1;

    @BeforeEach
    public void init() {
        task1 = new Task1();
    }

    @Test
    public void metTest1() {
        Assertions.assertAll(
                () -> {
                    Assertions.assertArrayEquals(new int[]{5, 6, 7}, task1.met(new int[]{1, 2, 3, 4, 5, 6, 7}));
                },
                () -> {
                    Assertions.assertArrayEquals(new int[]{3, 5, 1}, task1.met(new int[]{1, 4, 4, 4, 3, 5, 1}));
                },
                () -> {
                    Assertions.assertArrayEquals(new int[]{}, task1.met(new int[]{4, 4, 4, 4, 3, 4, 4}));
                }
        );
    }

    @Test
    public void metTest2() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            task1.met(new int[]{1, 2, 3, 5, 6});
        });
    }

}
