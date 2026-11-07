class test20 {
            public static void main(String args[]) {
                  int arr[]={1,9,2,4,7,10,19,6,3,5};

                  int max=arr[0];
		  int min=arr[0];

                  for(int i=1;i<arr.length;i++) {
                        if(arr[i]>max) {
                                max=arr[i];
                         }
                         else {
                             if(arr[i]<min) {
                                min=arr[i];
                         }
                     }
                   }

                    System.out.println("Maximum="+max);
                    System.out.println("Minimum="+min);
     }
}
