public class Person {
    private String name;
    private String forename;
    private int age;
    private char sex;

    // Constructor
    public Person(String name, String forename, int age) {
        this.name = name;
        this.forename = forename;
        this.age = age;
    }

    public Person() {
            }

    //Getter und Setter
    public String getName() {
        return name.toUpperCase();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ", " + forename + ", " + age;
    }
}
