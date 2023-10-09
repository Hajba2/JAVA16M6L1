package construcor;

public class Developer extends Human {

    {
        System.out.println("1 init dev");
    }

    {
        System.out.println("2 init dev");
    }

    static {
        System.out.println("1 static init dev");
    }

    static {
        System.out.println("2 static init dev");
    }

    public Developer() {
        System.out.println("in default constructor dev");
    }

    public Developer(String name) {
        super(name);
        //super.age = 0;
        System.out.println("constructor dev");
    }

    @Override
    public void sayHello() {
        System.out.println("hello from developer");
    }
}
