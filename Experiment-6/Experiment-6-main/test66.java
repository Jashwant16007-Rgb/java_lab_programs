import java.util.Scanner;

class test66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();
        
        String s1 = s.substring(s.length() - n);
        String result = "";
        
        for (int i = 0; i < n; i++) {
            result = result + s1;
        }
        
        System.out.println("Result: " + result);
        sc.close();
    }
}