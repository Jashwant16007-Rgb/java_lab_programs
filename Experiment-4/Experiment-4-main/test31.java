
class Person {

    String name;
    String dateOfBirth;

    Person(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dateOfBirth);
    }
}


// Teacher inherits Person
class Teacher extends Person {

    double salary;
    String subject;

    Teacher(String name, String dateOfBirth, double salary, String subject) {
        super(name, dateOfBirth);
        this.salary = salary;
        this.subject = subject;
    }

    void displayTeacher() {
        displayPerson();
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
    }
}


// Student inherits Person
class Student extends Person {

    int studentId;

    Student(String name, String dateOfBirth, int studentId) {
        super(name, dateOfBirth);
        this.studentId = studentId;
    }

    void displayStudent() {
        displayPerson();
        System.out.println("Student ID: " + studentId);
    }
}


// CollegeStudent inherits Student
class CollegeStudent extends Student {

    String collegeName;
    String year;

    CollegeStudent(String name, String dateOfBirth, int studentId,
                   String collegeName, String year) {

        super(name, dateOfBirth, studentId);
        this.collegeName = collegeName;
        this.year = year;
    }

    void displayCollegeStudent() {
        displayStudent();
        System.out.println("College Name: " + collegeName);
        System.out.println("Year: " + year);
    }
}


public class test31 {

    public static void main(String[] args) {

        // Person object
        Person p = new Person("Rahul", "10-05-2005");
        System.out.println("Person Details");
        p.displayPerson();

        System.out.println();

        // Teacher object
        Teacher t = new Teacher(
            "Mr. Sharma",
            "15-08-1985",
            50000,
            "Java"
        );

        System.out.println("Teacher Details");
        t.displayTeacher();

        System.out.println();

        // Student object
        Student s = new Student(
            "Amit",
            "12-03-2006",
            101
        );

        System.out.println("Student Details");
        s.displayStudent();

        System.out.println();

        // CollegeStudent object
        CollegeStudent cs = new CollegeStudent(
            "Abhishek",
            "20-07-2007",
            102,
            "GIET University",
            "Second"
        );

        System.out.println("College Student Details");
        cs.displayCollegeStudent();
    }
}

