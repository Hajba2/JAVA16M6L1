package nested;

class Car {

    private String make;
    private Door[] doors;

    public void setDoors(Door[] doors) {
        this.doors = doors;
    }

    static class Door {
        int height;
        int length;

        public void doSmth() {
            //System.out.println("make = " + make);
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }
    }
}