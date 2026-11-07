interface Greeting {
    abstract public void sayHello();
    
    default public void sayBye() {
        System.out.println("bye bye");
    }
}

class Child implements Greeting {
    public void sayHello() {
        System.out.println("Hello hello");
    }
}

class test97 {
    public static void main(String args[]) {
        Child ob = new Child();
        ob.sayHello();
        ob.sayBye();
    }
}