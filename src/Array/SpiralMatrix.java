package Array;

public class SpiralMatrix {

    private int[][] mat = {{1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}};

    public void spiralMatrix(){
        int m = mat.length;
        int n =mat[0].length;
        int cmin = 0, cmax = n-1;
        int rmin = 0, rmax = m-1;

        int count =0;
        while(count<m*n){
            // top boundary
            for(int col = cmin; col<=cmax && count<m*n;col++){
                System.out.print(mat[rmin][col] + ",");
                count++;
            }
            rmin++;

            // right boundary
            for(int row = rmin; row<=rmax && count<m*n;row++){
                System.out.print(mat[row][cmax] + ",");
                count++;
            }
            cmax--;
            // bottom boundary
            for(int col =cmax; col>=cmin && count<m*n;col--){
                System.out.print(mat[rmax][col] + ",");
                count++;
            }
            rmax--;
            // left boundary
            for(int row = rmax; row>=rmin && count<m*n;row--){
                System.out.print(mat[row][cmin] + ",");
                count++;
            }
            cmin++;
        }
    }
}
