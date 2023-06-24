import java.util.Scanner;

public class MoonComputerTests {
    public void testBasicInputOutput() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(line);
        scanner.close();
    }

    public void testMath() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = a + b;
        int sub = a - b;
        int multiply = a * b;
        int divide = a / b;

        System.out.println(sum + " " + sub + " " + multiply + " " + divide);

        scanner.close();
    }
    public void testLogicalOperators(){
        Scanner scanner = new Scanner(System.in);

        boolean a = scanner.nextBoolean();
        boolean b = scanner.nextBoolean();
        boolean c = scanner.nextBoolean();

        boolean resultAnd = a && b && c;
        boolean resultOr = a || b || c;

        System.out.println(resultAnd + " " + resultOr);
        scanner.close();
    }

    //Test output on true, true, false standard input
    public static void main(String[] args) {
        new MoonComputerTests().testLogicalOperators();
    }
}
