import java.util.Scanner;

class RemoveFirstLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s1 = sc.nextLine();
        
        String result = s1.substring(1, s1.length() - 1);
        System.out.println("Result: " + result);
        
        sc.close();
    }
}