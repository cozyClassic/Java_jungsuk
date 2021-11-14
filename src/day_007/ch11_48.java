package day_007;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ch11_48 {
    public static void main (String[] args) {
        HashMap hm = new HashMap();

        for (int i=0; i<10; i++){
            hm.put(Integer.valueOf(i), new String(Integer.toString(i+10)));
        }

        System.out.println(hm.toString());

        hm.put(0,20);
        System.out.println(hm.toString());

        hm.replace(0, new ArrayList (Arrays.asList(1,2,3,4,5)));
        // ArrayList<Interger> list = new ArrayList<Integer>(Arrays.asList(1,2,3));
        // ArrayList<Interger> list = new ArrayList<Integer>(Arrays.asList(1,2,3));

        System.out.println(hm.toString());

    }
}
