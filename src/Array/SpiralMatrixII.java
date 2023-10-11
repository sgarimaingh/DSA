package Array;

public class SpiralMatrixII {
    private int a = 6;

    private void print(int[][] res){
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println("\n");
        }

    }

    public void getSpiralMatrix() {

        int[][] res = new int[a][a];
        int count = 1;
        int rmin = 0, rmax = a - 1, cmin = 0, cmax = a - 1;
        while(rmin<=rmax && cmin<=cmax) {
            for (int col = cmin; col <= cmax; col++) {
                res[rmin][col] = count++;
            }
            rmin++;
            for (int row = rmin; row <= rmax; row++) {
                res[row][cmax] = count++;
            }
            cmax--;
            for (int col = cmax; col >= cmin; col--) {
                res[rmax][col] = count++;
            }
            rmax--;
            for (int row = rmax; row >= rmin; row--) {
                res[row][cmin] = count++;
            }
            cmin++;
        }

        print(res);
    }
}
