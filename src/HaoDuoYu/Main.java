package HaoDuoYu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[1001];

        while (scanner.hasNextInt()) {
            int s = scanner.nextInt();
            int t = scanner.nextInt();
            int n = scanner.nextInt();
            int size;

            for (int i = 0; i < n; ++i) {
                size = scanner.nextInt();
                for (int k = Math.max(s, 2 * size); k <= Math.min(t, 10 * size) ; k++) {
                    arr[k] = 1;
                }
                for (int k = Math.max(s, (int) Math.ceil((double) size / 10)); k <= Math.min(t, Math.floorDiv(size, 2)); k++) {
                    arr[k] = 1;
                }
            }

            int cnt = 0;
            for (int k = s; k <= t; ++k){
                cnt += (1 - arr[k]);
            }
            System.out.println(cnt);
        }

        scanner.close();
    }
}