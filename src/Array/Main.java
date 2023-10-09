package Array;

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

    }
}