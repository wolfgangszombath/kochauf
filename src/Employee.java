public class Employee extends Person implements Demo_Interface{
    double salary;

    public Employee(String name, String forename, int age, double salary) {
        super(name, forename, age);
        this.salary = salary;
    }

    @Override
    public void method1() {
        System.out.println("Blödsinn");
    }


    @Override
    public String method2() {
        return "Blödsinn";
    }
}
