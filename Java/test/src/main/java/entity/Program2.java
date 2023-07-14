package entity;

public class Program2 {
    public static void main(String[] args) {
        float result = divide(10,0);
        System.out.println(result);
    }

    public static float divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide 0");
        } finally {
            System.out.println("Divide completed");

        }
        return 0;
    }
}
