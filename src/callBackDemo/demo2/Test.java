package callBackDemo.demo2;

import java.util.ArrayList;

public class Test {
    protected demo.ConfirmListener confirmListener;
    void test(){
        demo demo11 = demo.demo1();
        demo11.setConfirmListener(new demo.ConfirmListener() {
            @Override
            public void onConfirmGoods(ArrayList<Integer> rVos) {
                System.out.println(rVos.add(2));
            }
        });
    }

}
