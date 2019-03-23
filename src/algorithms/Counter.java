package algorithms;

public class Counter {

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
