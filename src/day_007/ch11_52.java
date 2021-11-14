package day_007;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Arrays;



public class ch11_52 {
    public static void main(String[] args){
        List list = new ArrayList();
        System.out.println(list);

        Collections.addAll(list, 1,2,3,4,5); // 데이터 전체 추가하기.
        System.out.println(list);


        Collections.rotate(list, 1); // 회전
        System.out.println(list);

        Collections.swap(list,0,2); // 0번 2번교환
        System.out.println(list);

        Collections.shuffle(list); // 무작위로 섞기
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder()); // 역순으로 정렬하기
        System.out.println(list);

        int idx =Collections.binarySearch(list,3);
        System.out.println("index of 3 = " + idx);

        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        System.out.println("min = " + Collections.max(list, Collections.reverseOrder())); // max 기준을 거꾸로.

        Collections.fill(list,9);
        System.out.println(list);

        List newList = Collections.nCopies(list.size(), 2); // list와 같은 size크기의 리스트를 만들고 2를 채운다.
        System.out.println(newList);

        System.out.println(Collections.disjoint(list,newList)); // disjoint - 공통요소가 없으면 true

        Collections.replaceAll(list, 9,1); // 9를 모두 1로 바꾸기.
        System.out.println(list);

        Enumeration e = Collections.enumeration(list); // Iterator와 비슷하지만 스레드에 안전한 기능.
        ArrayList list2 = Collections.list(e);
        System.out.println(list2);

    }
}