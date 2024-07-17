package july16;

import java.util.*;

public class NamesList {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        boolean namein = true;
        while (namein)
        {
            System.out.println("Enter the name");
            String name = scan.next();
            list.add(name);

            for(int i=1;i<list.size();i++)
            {
                System.out.println("Enter the name");
                name = scan.next();
                if(name.equals("done"))
                {
                    Set<String> set = new TreeSet<>(list);
                    System.out.println(set);
                    namein=false;
                    break;
                }
                list.add(i,name);

            }
        }



    }
}
