import java.util.Scanner;

public class OOPBASIC {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        Person wolfgang = new Person();
        String text;
//        System.out.println("Vornamen");
//        wolfgang.setForename(input.nextLine());
//        System.out.println("Nachnamen");
//        wolfgang.setName(input.nextLine());
//        System.out.println("Alter");
//        wolfgang.setAge(input.nextInt());

        Employee abc = new Employee("ABC","DEF", 100, 100.00);
        abc.method1();
        text = abc.method2();
        Visitor def = new Visitor("DEF","GHI", 25,5,1);
        def.method1();
        text = def.method2();

    }
}