package callBackDemo.demo2;

import java.util.ArrayList;
import java.util.List;

public class demo {
   protected static ArrayList<Integer> mList;
private static ConfirmListener mConfirmListener;



    public static void main(String[] args) {

      click();

    }


    public static void click(){
        if (mConfirmListener != null) {
            mConfirmListener.onConfirmGoods((ArrayList<Integer>) mList);

        }
    }
    public void setConfirmListener(ConfirmListener confirmListener) {
        mConfirmListener = confirmListener;
    }
    public interface ConfirmListener {
        void onConfirmGoods(ArrayList<Integer> rVos);
    }

    public static demo demo1(){
       return new demo();
    }
}
