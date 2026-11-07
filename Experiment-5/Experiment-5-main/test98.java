interface Shape {
    public void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("The shape of a circle");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("The shape of a rectangle");
    }
}

class test98 {
    public static void main(String args[]) {
        Shape ob;
        ob = new Circle();
        ob.draw();
        
        ob = new Rectangle();
        ob.draw();
    }
}