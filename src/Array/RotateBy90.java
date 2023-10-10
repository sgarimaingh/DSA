package Array;

public class RotateBy90 {
    private int[][] mat = {{1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16}};


    private void print(int[][] mat){
        for(int[] arr: mat){
            for(int x: arr){
                System.out.print(x + " ");
            }
            System.out.println("\n");
        }
    }

    public void rotateBy90(){
        int n = mat[0].length;
        int m = mat.length;

        //1. transpose of matrix
        for(int i =0;i<m;i++){
            for(int j=i+1;j<n;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        // 2. swap column elements;
        int left =0, right = n-1;
        while(left<right){
            for(int i=0;i<m;i++){
                int temp = mat[i][left];
                mat[i][left] = mat[i][right];
                mat[i][right] = temp;
            }
            left++;
            right--;
        }
        print(mat);
    }

}
