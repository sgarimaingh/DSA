package Array;

import java.util.Arrays;

public class FourSum {

    private int[] A = {2,4,3,6,7,1};

    private int B = 15;

    public void getFourSum() {
        int n = A.length;
        Arrays.sort(A);
        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && A[i] == A[i - 1]) continue;

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && A[j] == A[j - 1]) continue;
                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    int sum = A[i] + A[j] + A[left] + A[right];
                    if (sum == B) {
                        System.out.println(A[i] + " " + A[j] + " " + A[left] + " " + A[right]);
                        while (left < right && A[left] == A[left + 1]) left++;
                        while (left < right && A[right] == A[right - 1]) right--;
                        left++;
                        right--;
                    } else if (sum < B) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

}

}
