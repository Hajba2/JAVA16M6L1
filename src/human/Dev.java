package human;

public class Dev extends Human {

    Head head;

    @Override
    public void sayHello() {
        if (head == null) {
            head = new Head();
        }
        head.sayHello();
    }
}
