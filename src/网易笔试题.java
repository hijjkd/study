/**
 * 输出结果
 * 10 0
 * 20
 *
 * 考察类的初始化，慢慢画图
 */
    class ValHold{
        public int i =10;
    }


    class ObParm{
        public static void main(String[] args) {
            ObParm  o= new ObParm();
            o.amethod();
        }

        public void amethod(){
            int i=99;
            ValHold v= new ValHold();
            v.i=30;
            another(v,i);
            System.out.println(v.i);
        }

        private void another(ValHold v, int i) {
            i=0;
            v.i=20;
            ValHold vh = new ValHold();
            v=vh;
            System.out.println(v.i+" "+i);
        }
    }

