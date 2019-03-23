package algorithms;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

class Filps{
    public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);
        Counter heads = new Counter("heads");
        Counter tails = new Counter("tail");
        for(int t =0; t < T; t++)
            if(StdRandom.bernoulli(0.5))
                heads.increment();
            else tails.increment();

            StdOut.println(heads);
            StdOut.println(tails);
            int d = heads.tally()-tails.tally();
            StdOut.println("delta:"+Math.abs(d));


    }

    public static class Counter {

        private final String name;
        private int count;

        public Counter(String name) {
            this.name = name;
        }

        public void increment(){count++;}

        public int tally(){return count;}

        public String toString(){
            return count + " " + name;
        }
    }


}


