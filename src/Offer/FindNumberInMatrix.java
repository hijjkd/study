package Offer;

public class FindNumberInMatrix {

    public static void main(String[] args) {
        int[][] array = new int[][]{{}};

        System.out.println(Find(9, array));

    }


    public static boolean Find(int target, int[][] array) {
        int m, n;
        if (array !=null &&array.length != 0 && array[0].length != 0) {
             m = array.length;
             n = array[0].length;
        } else
            return false;

        int i = 0;
        int j = n - 1;
        while (i < m && j >= 0) {
            if (target > array[i][j])
                i++;
            else if (target < array[i][j])
                j--;
            else return true;
        }

        return false;
    }

}
