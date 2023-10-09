package human;

public class Human {

    private String name;
    private int age;

    public Human() {

    }

    public void sayHello() {
        Head head = new Head();
        head.sayHello();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    class Head {

        String helloFormat = "Hello my name is: %s and I am %s years old";

        public void sayHello() {
            System.out.println(String.format(helloFormat, name, age));
        }
    }
}