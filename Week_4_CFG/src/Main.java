// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    public static String evaluateStudentPerformance(float average, float min, boolean qualified) {
        if (average > 10.0 || average < 0.0 || min > 10.0 || min < 0.0) {
            return "Không hợp lệ";
        } else if (average >= 8.0 && min >= 6.5 && qualified) {
            return "Loại Giỏi";
        } else if (average >= 6.5 && min >= 5.0 && qualified) {
            return "Loại Khá";
        } else if (average >= 5.0 && min >= 3.5 && qualified) {
            return "Loại Trung bình";
        } else if (average >= 3.5 && min >= 2.0) {
            return "Loại Yếu";
        } else {
            return "Loại Kém";
        }
    }

    public static void main(String[] args) {
        float average = 7.5f;  // Replace with the actual average score
        float min = 4.0f;   // Replace with the actual lowest subject score
        boolean qualified = true;  // Replace with the actual value

        ControlFlow controlFlow = new ControlFlow();
        controlFlow.runTest();
    }
}