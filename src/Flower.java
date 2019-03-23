import java.util.Scanner;

public class Flower {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()){
            flower(in.nextInt(),in.nextInt());
        }
    }

    public static void flower(int m,int n){
        int length = n-m;
        int[] results = new int[length];
        int flag = 0;
        for(int i=m; i <=n;i++){
            if(checkIsFlower(i)){
                flag =1;
                System.out.print(i+" ");
            }
        }
        if(flag == 0)
            System.out.print("NO");

    }


    public static boolean checkIsFlower(int num) {
        int i=num%10;
        int j=num/10%10;
        int k=num/100%10;
        if(num==i*i*i+j*j*j+k*k*k){
            return true;
        }
        else
            return false;
    }
}

