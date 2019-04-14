public class 冒泡排序 {
    public static void main(String[] args) {
        int[] a = new int[]{3, 5, 4, 1};
        bubbleSort(a);
        for (int num : a
                ) {
            System.out.println(num + " ");
        }

    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {  //-1为了防止溢出
                if (arr[j] > arr[j + 1]) {  //把大的数放在后面
                    //swap(arr[j], arr[j+1]);
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
    }

    //此方法不对，应该传入数组，和j
    private static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
