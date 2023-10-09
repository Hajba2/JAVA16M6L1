package construcor;

public class Human {

    private String name; //4
    private int age; //4

    {
        System.out.println("1 init human");
    }

    {
        System.out.println("2 init human");
    }

    static {
        System.out.println("1 static init human");
    }

    static {
        System.out.println("2 static init human");
    }

    public Human() {
        System.out.println("in default constructor human");
        //this("default name", 19);
//        this.name = "default name";
//        this.age = 19;
    }

    public Human(String name) {
        this(name, 19);
        System.out.println("in string constructor human");
    }

    public Human(int age) {
        this("default name", age);
        System.out.println("in int constructor human");
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("in string int constructor human");
    }

    private void init() {
        //some logic
    }

    public void sayHello() {
        System.out.println("hello from human");
    }
}
