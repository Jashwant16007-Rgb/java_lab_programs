import java.util.Scanner;

class test21 {
    public static void main(String args[]) {

        int arr[] = {1, 9, 2, 4, 7, 10, 19, 6, 3, 5};

        Scanner ob = new Scanner(System.in);

        System.out.println("Enter the value to search:");
        int val = ob.nextInt();

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == val) {
                System.out.println("The given element is present at index = " + i);
                found = true;
                break;
            }
        }

        if (found == false) {
            System.out.println("The given element is not present");
        }

ob.close();
    }
}