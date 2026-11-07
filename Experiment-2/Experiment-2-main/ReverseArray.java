class ReverseArray {
    public static void main(String[] args) {

        if (args.length != 4) {
            System.out.println("Please pass exactly 4 integers.");
            return;
        }

        int[][] arr = new int[2][2];

        // Store command line arguments
        arr[0][0] = Integer.parseInt(args[0]);
        arr[0][1] = Integer.parseInt(args[1]);
        arr[1][0] = Integer.parseInt(args[2]);
        arr[1][1] = Integer.parseInt(args[3]);

        System.out.println("Original Array:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Reverse the elements
        int temp = arr[0][0];
        arr[0][0] = arr[1][1];
        arr[1][1] = temp;

        temp = arr[0][1];
        arr[0][1] = arr[1][0];
        arr[1][0] = temp;

        System.out.println("Reversed Array:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}