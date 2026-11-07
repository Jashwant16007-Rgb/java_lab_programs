import java.util.Scanner;

class test63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1;
        System.out.println("Enter the string: ");
        s1 = sc.nextLine();
        
        int n = s1.length();
        String s2 = s1.substring(0, 2);
        String result = "";
        
        for (int i = 0; i < n; i++) {
            result = result + s2;
        }
        
        System.out.println("The new string: " + result);
        sc.close();
    }
}