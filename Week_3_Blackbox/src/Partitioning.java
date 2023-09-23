import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Partitioning {
    @Test
    public void test1() {
        String result = Main.evaluateStudentPerformance(-1.0f, -1.0f, true);
        assertEquals("Không hợp lệ", result);
    }

    @Test
    public void test2() {
        String result = Main.evaluateStudentPerformance(1.0f, 1.0f, false);
        assertEquals("Loại Kém", result);
    }

    @Test
    public void test3() {
        String result = Main.evaluateStudentPerformance(4.0f, 2.5f, true);
        assertEquals("Loại Yếu", result);
    }

    @Test
    public void test4() {
        String result = Main.evaluateStudentPerformance(5.5f, 4.5f, true);
        assertEquals("Loại Trung bình", result);
    }

    @Test
    public void test5() {
        String result = Main.evaluateStudentPerformance(7.0f, 5.0f, false);
        assertEquals("Loại Yếu", result);
    }

    @Test
    public void test6() {
        String result = Main.evaluateStudentPerformance(8.0f, 6.5f, true);
        assertEquals("Loại Giỏi", result);
    }

    @Test
    public void test7() {
        String result = Main.evaluateStudentPerformance(11.0f, 11.0f, false);
        assertEquals("Không hợp lệ", result);
    }

    public void runTest() {
        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
        test7();
    }
}

