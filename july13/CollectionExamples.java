package july13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionExamples {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(223);
        list.add(453);
        list.add(254);
        list.add(5423);
        list.add(34);
        list.add(23);
        list.add(34);
        list.add(54);
        list.add(54);
        list.add(34);
        list.add(54312);

        Set<Integer> set = new HashSet<>(list);
        System.out.println(set);
    }
}
