class Employee extends person {

    double salary;
    String doj;
    String pan;

    Employee() {
        salary = 10100;
        doj = "16/11/2004";
        pan = "APPPY208X";
    }

    public double getSalary() {
        return salary;
    }

    public String getDoj() {
        return doj;
    }

    public String getPan() {
        return pan;
    }
}