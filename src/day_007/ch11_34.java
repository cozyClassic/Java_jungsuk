package day_007;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;


public class ch11_34 {
    public static void main(String[] args){
        //HashTest.test();
        ListSetDiff.test();

    }
}

class ListSetDiff {
    public static void test() {
        Set set   = new HashSet();
        List list = new ArrayList();

        for (int i=0; i<5; i++){
            System.out.println("SET ADD ::: " + set.add(1));
            System.out.println("LIST ADD ::: " + list.add(1));
        }
        System.out.println("set" + set.toString());  // set[1]
        System.out.println("list" + list); // list[1, 1, 1, 1, 1]
    }
}


class HashTest {
    public static void test() {
        Object[] objArr = {1, 2, 3, 4, "5","6","7","8"};
        List list       = Arrays.asList(objArr);
        Set set         = new HashSet();

        for (int i =0; i<10; i++){
            set.add(i);
        }
        System.out.println(set); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        set.retainAll(list);
        System.out.println(set); // [1, 2, 3, 4]
        // reatianAll -> 교집합

        set.clear();

        for (int i =0; i<10; i++){
            set.add(i);
        }

        System.out.println(set); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        set.removeAll(list);
        System.out.println(set); // [0, 5, 6, 7, 8, 9]
        // removeAll -> 차집합
    }
}
