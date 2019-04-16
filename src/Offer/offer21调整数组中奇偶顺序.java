package Offer;

class offer21调整数组中奇偶顺序 {

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7};
        reOrderArray(a);
        for (int i:a
             ) {
            System.out.println(i+" ");

        }


    }

    public static void reOrderArray(int[] array) {
        if (array == null || array.length == 0)
            return;


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] % 2 == 0 && array[j +1] % 2 == 1) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

        }
    }


}