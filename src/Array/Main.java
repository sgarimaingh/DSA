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

        //MajorityElement
        System.out.println("\n Majority element:");
        MajorityElement me = new MajorityElement();
        System.out.print(me.getMajorityElement());

    }
}