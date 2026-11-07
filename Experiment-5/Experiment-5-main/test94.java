interface Vehicle {
    public void start();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car rides");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike rides");
    }
}

class test94 {
    public static void main(String args[]) {
        Car ob1 = new Car();
        ob1.start();

        Bike ob2 = new Bike();
        ob2.start();
    }
}