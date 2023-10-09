package nested;

public class CarTest {

    public static void main(String[] args) {
        Car.Door door = new Car.Door();
        Car.Door[] doors = {door};

        Car car = new Car();
        car.setDoors(doors);
    }
}
