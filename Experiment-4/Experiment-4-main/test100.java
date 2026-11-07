class Animal {

    public void eat() {
        System.out.println("Animal eat");
    }

    public void sleep() {
        System.out.println("Animal sleep");
    }
}

class Bird extends Animal {

    public void eat() {
        System.out.println("Bird eat");
    }

    public void sleep() {
        System.out.println("Bird sleep");
    }

    public void fly() {
        System.out.println("Bird fly");
    }
}

public class test100 {

    public static void main(String args[]) {

        Animal ob1 = new Animal();
        Bird ob2 = new Bird();

        ob1.eat();
        ob1.sleep();

        ob2.eat();
        ob2.sleep();
        ob2.fly();
    }
}