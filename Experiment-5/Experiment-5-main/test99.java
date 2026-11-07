interface Animal {
    public void makeSound();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class test99 {
    public static void main(String args[]) {
        Dog ob = new Dog();
        ob.makeSound();
    }
}