interface Printer {
    public void print();
}

interface Scanner {
    public void scan();
}

class Child implements Printer, Scanner {
    public void print() {
        System.out.println("printing document");
    }

    public void scan() {
        System.out.println("scanning document");
    }
}

class test95 {
    public static void main(String args[]) {
        Child ob = new Child();
        ob.print();
        ob.scan();
    }
}