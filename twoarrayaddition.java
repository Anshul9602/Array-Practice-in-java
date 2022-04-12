public class twoarrayaddition {
    public static void main(String[] args) {
        int[][] mat1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] mat2 = {{7, 8, 9}, {12, 13, 14}};
        int result[][] = {{0, 0, 0}, {0, 0, 0}};
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j]  + " ");
            }
            System.out.println("   ");
        }
         System.out.println("  ");
        // rever
        int arr[]= {10,1,3,13,15};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;
        System.out.print("revers number is :");
        for (int i=0;i<n; i++){
            // swap a[i] and a[l-1-i]
            // creation an temp store prevaious value
            temp =arr[i];
            arr[i] =arr[l-1-i];
            arr[l-1-i] = temp;
        }
        for (int element: arr){
            System.out.print(element +" ");
        }
    }

    
}
