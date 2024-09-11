public class Visitor extends Person implements Demo_Interface{
    int tickettype;
    int kind;

    public Visitor(String name, String forename, int age, int tickettype, int kind) {
        super(name, forename, age);
        this.tickettype = tickettype;
        this.kind = kind;
    }

    @Override
    public void method1() {
        System.out.println("Herzlich Willkommen");
        System.out.println("Alles klar?");
    }

    @Override
    public String method2() {
        return "null";
    }
}
