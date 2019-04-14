public class 插入排序 {
    public static void main(String[] args) {
        int[] a = new int[]{3, 5, 4,8,9,8,7,4,56,3,2,1,4,5,66,98,7,1};
        insert(a);
        for (int num :a
                ) {
            System.out.println(num + " ");
        }
    }

    /**思路：每步将一个待排序的记录，按其顺序码大小插入到前面已经排序的字序列的合适位置（从后向前找到合适位置后），直到全部插入排序完为止。
     * 每一个数和它前面的数依次进行比较，因为前面的数的顺序是已经排好的
     * @param arr 输入的数组
     */
    private static void insert(int[] arr) {
        for (int i = 1; i < arr.length; i++) {//从下标为1开始，依次往前插入
            for(int j=i;j>0;j--){//选择i这个数一次和前边的进行比较，找到插入位置
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }else{
                    break;
                }
            }
        }

    }
}

