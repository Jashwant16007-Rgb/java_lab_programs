import java.util.Scanner;

class test62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string s1: ");
        String s1 = sc.nextLine();
        
        System.out.println("Enter a string s2: ");
        String s2 = sc.nextLine();
        
        String s3 = s1 + s2;
        System.out.println("Original string: " + s3);
        System.out.println("String in lowercase: " + s3.toLowerCase());
        
        sc.close();
    }
}