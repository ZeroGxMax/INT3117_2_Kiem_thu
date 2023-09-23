import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecisionTable {
    @Test
    public void test1() {
        String result = Main.evaluateStudentPerformance(-1.0f, -1.0f, true);
        assertEquals("Không hợp lệ", result);
    }

    @Test
    public void test2() {
        String result = Main.evaluateStudentPerformance(0.0f, -1.0f, true);
        assertEquals("Không hợp lệ", result);
    }

    @Test
    public void test3() {
        String result = Main.evaluateStudentPerformance(0.0f, 0.0f, true);
        assertEquals("Loại Kém", result);
    }

    @Test
    public void test4() {
        String result = Main.evaluateStudentPerformance(3.5f, -1.0f, true);
        assertEquals("Không hợp lệ", result);
    }

    @Test
    public void test5() {
        String result = Main.evaluateStudentPerformance(3.5f, 0.0f, true);
        assertEquals("Loại Kém", result);
    }

    @Test
    public void test6() {
        String result = Main.evaluateStudentPerformance(3.5f, 2.0f, true);
        assertEquals("Loại Yếu", result);
    }

    @Test
    public void test7() {
        String result = Main.evaluateStudentPerformance(3.5f, 11.0f, true);
        assertEquals("Không hợp lệ", result);
    }

    @Test
    public void test8() {
        String result = Main.evaluateStudentPerformance(5.0f, -1.0f, true);
        assertEquals("Không hợp lệ", result);
    }

    @Test
    public void test9() {
        String result = Main.evaluateStudentPerformance(5.0f, 0.0f, true);
        assertEquals("Loại Kém", result);
    }

    @Test
    public void test10() {
        String result = Main.evaluateStudentPerformance(5.0f, 2.0f, true);
        assertEquals("Loại Yếu", result);
    }

    @Test
    public void test11() {
        String result = Main.evaluateStudentPerformance(5.0f, 3.5f, true);
        assertEquals("Loại Trung bình", result);
    }

    @Test
    public void test12() {
        String result = Main.evaluateStudentPerformance(5.0f, 3.5f, false);
        assertEquals("Loại Yếu", result);
    }

    @Test
    public void test13() {
        String result = Main.evaluateStudentPerformance(5.0f, 11.0f, true);
        assertEquals("Không hợp lệ", result);
    }

    @Test
    public void test14() {
        String result = Main.evaluateStudentPerformance(6.5f, -1.0f, true);
        assertEquals("Không hợp lệ", result);
    }

    @Test
    public void test15() {
        String result = Main.evaluateStudentPerformance(6.5f, 0.0f, true);
        assertEquals("Loại Kém", result);
    }

    @Test
    public void test16() {
        String result = Main.evaluateStudentPerformance(6.5f, 2.0f, true);
        assertEquals("Loại Yếu", result);
    }

    @Test
    public void test17() {
        String result = Main.evaluateStudentPerformance(6.5f, 3.5f, true);
        assertEquals("Loại Trung bình", result);
    }

    @Test
    public void test18() {
        String result = Main.evaluateStudentPerformance(6.5f, 3.5f, false);
        assertEquals("Loại Yếu", result);
    }

    @Test
    public void test19() {
        String result = Main.evaluateStudentPerformance(6.5f, 5.0f, true);
        assertEquals("Loại Khá", result);
    }

    @Test
    public void test20() {
        String result = Main.evaluateStudentPerformance(6.5f, 5.0f, false);
        assertEquals("Loại Yếu", result);
    }

    @Test
    public void test21() {
        String result = Main.evaluateStudentPerformance(6.5f, 11.0f, true);
        assertEquals("Không hợp lệ", result);
    }

    @Test
    public void test22() {
        String result = Main.evaluateStudentPerformance(8.0f, -1.0f, true);
        assertEquals("Không hợp lệ", result);
    }

    @Test
    public void test23() {
        String result = Main.evaluateStudentPerformance(8.0f, 0.0f, true);
        assertEquals("Loại Kém", result);
    }

    @Test
    public void test24() {
        String result = Main.evaluateStudentPerformance(8.0f, 2.0f, true);
        assertEquals("Loại Yếu", result);
    }

    @Test
    public void test25() {
        String result = Main.evaluateStudentPerformance(8.0f, 3.5f, true);
        assertEquals("Loại Trung bình", result);
    }

    @Test
    public void test26() {
        String result = Main.evaluateStudentPerformance(8.0f, 3.5f, false);
        assertEquals("Loại Yếu", result);
    }

    @Test
    public void test27() {
        String result = Main.evaluateStudentPerformance(8.0f, 5.0f, true);
        assertEquals("Loại Khá", result);
    }

    @Test
    public void test28() {
        String result = Main.evaluateStudentPerformance(8.0f, 5.0f, false);
        assertEquals("Loại Yếu", result);
    }

    @Test
    public void test29() {
        String result = Main.evaluateStudentPerformance(8.0f, 6.5f, true);
        assertEquals("Loại Giỏi", result);
    }

    @Test
    public void test30() {
        String result = Main.evaluateStudentPerformance(8.0f, 6.5f, false);
        assertEquals("Loại Yếu", result);
    }

    @Test
    public void test31() {
        String result = Main.evaluateStudentPerformance(8.0f, 11.0f, true);
        assertEquals("Không hợp lệ", result);
    }

    @Test
    public void test32() {
        String result = Main.evaluateStudentPerformance(11.0f, 5.0f, true);
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
        test8();
        test9();
        test10();
        test11();
        test12();
        test13();
        test14();
        test15();
        test16();
        test17();
        test18();
        test19();
        test20();
        test21();
        test22();
        test23();
        test24();
        test25();
        test26();
        test27();
        test28();
        test29();
        test30();
        test31();
        test32();
    }
}
