interface NumberPrinter {
    abstract public void printNumber(int x);
}

class Child implements NumberPrinter {
    public void printNumber(int x) {
        System.out.println("The integer x : " + x);
    }
}

class test96 {
    public static void main(String args[]) {
        Child ob = new Child();
        ob.printNumber(10);
    }
}