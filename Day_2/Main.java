package Day_2;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); // 0
        list.add(5); // 1
        list.add(88); // 2
        // list.remove(2);
        System.out.println(list.get(2));
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (int x : list) {
            System.out.println(x);
        }
        System.out.println(list.contains(5));
        System.out.println(list.contains(50));
    }
}
