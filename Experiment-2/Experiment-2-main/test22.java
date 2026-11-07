class test22 {
            public static void main(String args[]) {
                  int arr[]={1,9,2,4,7,10,19,6,3,5};


                  int n=arr.length;
                  int temp;
                  
                  for(int i=0;i<n-1;i++) {
                           for(int j=i+1;j<n;j++) {
                                if(arr[i]>arr[j]) {
                                     temp=arr[i];
                                      arr[i]=arr[j];
                                      arr[j]=temp;
                                }
                           }
                    }
                      


              System.out.println("Two smallest numbers:"+arr[0] + "and" +arr[1]);
              System.out.println("Two largest numbers:"+arr[n-2] + "and" +arr[n-1]);

        }
}
















                       

