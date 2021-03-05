import java.util.Comparator;
import java.util.TreeMap;

public class shu {
    static void  PreToMid(int pre[], int mid[], int preLow, int preHigh, int midLow, int midHigh)
    {
        if (preHigh >= preLow)
        {
            mid[(midHigh + midLow) / 2] = pre[preLow];
            int tmp = (preHigh - preLow) / 2;
            PreToMid(pre, mid, preLow + 1, preLow + tmp, midLow, midLow + tmp - 1);
            PreToMid(pre, mid, preLow + tmp + 1, preHigh, midLow + tmp + 1, midHigh);
        }
    }

    public static void main(String[] args) {
        int Pre[] = {1, 2, 4, 8, 9, 5, 10, 11, 3, 6, 12, 13, 7, 14, 15};
        int PreChangeToMid[] = {0};
        PreToMid(Pre, PreChangeToMid, 0, 14, 0, 14);
        for (int i = 0; i < 15; i++)
        {
            System.out.println(PreChangeToMid[i]);
        }
        TreeMap mp = new TreeMap<>(Comparator.reverseOrder());
        mp.put(2,5);
        mp.put(3,1);

    }

}
