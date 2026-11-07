import java.util.Scanner;

class test64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        
        if (str.length() % 2 == 0) {
            String result = str.substring(0, str.length() / 2);
            System.out.println("First half: " + result);
        } else {
            System.out.println("null");
        }
        
        sc.close();
    }
}