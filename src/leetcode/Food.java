package leetcode;

import java.util.Comparator;
import java.util.TreeSet;

public class Food implements Comparable {
    public Long id;
    public String name;
    public long tag;

    public Food(Long id, String name,Long tag) {
        this.id = id;
        this.name = name;
        this.tag = tag;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public long getTag() {
        return tag;
    }

    public void setTag(long tag) {
        this.tag = tag;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "persion [id="+id+",name="+name+"]";
    }



    @Override
    public int compareTo(Object o) {
        return -1;
    }
}
