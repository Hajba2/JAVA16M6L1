package anonim;

public class HUmanTest {

    public static void main(String[] args) {
        Human h1 = new Human();
        h1.setName("Inna");
        h1.printName();

        //h1 = new Human();

        Human h2 = new Human() {
            public void printName() {
                System.out.println("hello, my name is" + getName());
                //System.out.println(h1);
            }

            public void printName2() {
                System.out.println("hello2, my name is" + getName());
            }
        };
        h2.setName("Ivan");
        h2.printName();
        h1.printName();
    }

}
