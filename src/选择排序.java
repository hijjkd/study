public class 选择排序 {
    public static void main(String[] args) {
        int[] a = new int[]{3, 5, 4, 1};
        selectSort(a);
        for (int num : a
                ) {
            System.out.println(num + " ");
        }
    }

    private static void selectSort(int[] a){
        int minIndex;
        int temp;

        for(int i=0;i<a.length-1;i++) {
            minIndex=i;//无序区的最小数据数组下标
            for(int j=i+1;j<a.length;j++) {
                //在无序区中找到最小数据并保存其数组下标
                if(a[j]<a[minIndex]) {
                    minIndex=j;
                }
            }
            //将最小元素放到本次循环的前端
            temp=a[i];
            a[i]=a[minIndex];
            a[minIndex]=temp;
        }
    }
}
