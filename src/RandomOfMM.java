import java.util.*;

public class RandomOfMM {
    public static void main(String[] args) {
        Scanner in = new  Scanner(System.in);

        while (in.hasNext()){
            int n = in.nextInt();
            Set set = new HashSet();
            List<Integer> list = new LinkedList<Integer>();
            for(int i=0;i<n;i++){
                int add = in.nextInt();
                if(set.add(add))
                list.add(add);
            }

            Collections.sort(list);

            for (Integer i:list
                 ) {
                System.out.println(i);

            }
        }
    }
}
