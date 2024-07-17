package july16;

import java.util.*;

public class SetExamples {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(70);
        list.add(90);
        list.add(60);
        list.add(20);
        list.add(80);
        list.add(90);
        list.add(100);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("List: "+ list);

        Set<Integer> set1 = new HashSet<>(list);
        System.out.println("HashSet: "+set1);

        Set<Integer> set2 = new TreeSet<>(list);
        System.out.println("TreeSet: "+set2);

        Set<Integer> set3 = new LinkedHashSet<>(list);
        System.out.println("LinkedHashSet: "+set3);

    }
}
