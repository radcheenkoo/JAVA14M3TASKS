import java.util.Scanner;

public class PassportFormCreator {
    public void createForms () {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String surname = scanner.nextLine();
        int age = scanner.nextInt();


        age = age * 10;

        System.out.println(name + " " + surname + " " + age);
        System.out.println(name.toUpperCase() + "\n" + surname.toUpperCase() + "\n" + age);
        scanner.close();
    }
}
