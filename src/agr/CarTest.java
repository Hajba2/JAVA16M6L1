package agr;

public class CarTest {

    public static void main(String[] args) {
        Transmission transmission = new Transmission();
        Engine engine = new Engine();

        new Car(engine, transmission);

    }


}
