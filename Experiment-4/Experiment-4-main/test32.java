
class Fruit {

    String name;
    String taste;
    String size;

    Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    void eat() {
        System.out.println(name + " has a " + taste + " taste.");
    }
}


class Apple extends Fruit {

    Apple(String name, String taste, String size) {
        super(name, taste, size);
    }

    @Override
    void eat() {
        System.out.println("Apple has a sweet and slightly sour taste.");
    }
}


class Orange extends Fruit {

    Orange(String name, String taste, String size) {
        super(name, taste, size);
    }

    @Override
    void eat() {
        System.out.println("Orange has a sweet and tangy taste.");
    }
}


public class test32 {

    public static void main(String[] args) {

        Fruit f = new Fruit("Fruit", "Sweet", "Medium");
        f.eat();

        Apple a = new Apple("Apple", "Sweet", "Medium");
        a.eat();

        Orange o = new Orange("Orange", "Tangy", "Medium");
        o.eat();
    }
}

