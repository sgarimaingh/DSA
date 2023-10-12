package Binary_Search;

public class Main {
    public static void main(String[] args) {

        //first and last index of X
        System.out.println("\nTfirst and last index of X: ");
        FirstAndLastIndex fl = new FirstAndLastIndex();
        fl.getFirstAndLastIndex();

        //search in rotated and sorted array
        System.out.println("\nsearch in rotated and sorted array: ");
        SearchInSortedRotatedArray s = new SearchInSortedRotatedArray();
        s.getIndex();

        //search in sorted 2d matrix
        System.out.println("\nsearch in sorted 2d matrix: ");
        SearchInSorted2dMatrix sm = new SearchInSorted2dMatrix();
        System.out.print(sm.getTarget());


    }
}