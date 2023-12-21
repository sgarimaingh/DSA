package Array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //twoSum
        System.out.println("\nTwo Sum results: ");
        TwoSum t = new TwoSum();
        int [] res = t.getAns();
        System.out.print(res[0] + " " + res[1]);

        //threeSum
        System.out.println("\nThree Sum results: ");
        ThreeSum threeSum = new ThreeSum();
        threeSum.get3Sum();

        //SmallestNo
        System.out.println("\nSmallest No ");
        System.out.println("Enter N:");
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        SmallestNo sm = new SmallestNo(N);
        sm.getSmallestNo();

        //Majority Element
        System.out.println("\n Majority element:");
        MajorityElement me = new MajorityElement();
        System.out.print(me.getMajorityElement());

        //Rotateby90
        System.out.println("\n\n Rotate by 90:");
        RotateBy90 r = new RotateBy90();
        r.rotateBy90();

        //Spiral Matrix
        System.out.println("\n\n Spiral Matrix:");
        SpiralMatrix sp = new SpiralMatrix();
        sp.spiralMatrix();

        //four sum
        System.out.println("\nFour Sum results: ");
        FourSum fourSum = new FourSum();
        fourSum.getFourSum();

        //Spiral Matrix 2
        System.out.println("\n\n Spiral Matrix:");
        SpiralMatrixII sp2 = new SpiralMatrixII();
        sp2.getSpiralMatrix();

        // Student with highest average score
        System.out.println("\n\n Student name: ");
        StudentWithHighestAvgScore sa = new StudentWithHighestAvgScore();
        sa.getStudent();


        // maximum trapped rain water
        TrappingRainWater tr = new TrappingRainWater();
        System.out.println("\n\n Maximum trapped rain water: " +  tr.getWater());


    }
}