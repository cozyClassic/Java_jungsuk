package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class testForStringConvert {
    public static void main (String[] args){
        //intToStr.test();
        //strToInt.test();
        //strToArr.test();
        //arrToStr.test();
        //arrToList.test();
        //listToArr.test();
        //strToSb.test();
        //sbToStr.test();
    }
}

class intToStr {
    static void test(){
        int i1 = 1234;
        int i2 = 5678;

        System.out.println(i1+i2); // 6912

        // 방법 1. Integer.toString(숫자)
        System.out.println(Integer.toString(i1)+Integer.toString(i2)); // 12345678

        // 방법 2. String.valueOf(숫자)
        System.out.println(String.valueOf(i1)+String.valueOf(i2)); // 12345678

        // 방법 3. "" + 숫자
        System.out.println(i1 + i2 + "");  // 6912
        System.out.println("" + i1 + i2 ); // 12345678
    }
}

class strToInt {
    static void test(){
        String s1 = "1234";
        String s2 = "5678";

        System.out.println(s1+s2); // 12345678

        // 방법 1. Integer.parseInt(문자열)
        System.out.println(Integer.parseInt(s1)+ Integer.parseInt(s2)); // 6912

        // 방법 2. Integer.valueOf(문자열)
        System.out.println(Integer.valueOf(s1) + Integer.valueOf(s2)); // 6912
    }
}

class strToArr {
    static void test(){
        String s1 = "1234";
        String s2 = "5678";

        System.out.println(Arrays.toString(s1.split(""))); // [1,2,3,4]
    }
}

class arrToStr {
    static void test(){
        String[] arr1 = {"1","2","3","4"};

        // for 사용하기
        StringBuffer s1 = new StringBuffer();
        for (String i : arr1){
            s1.append(i);
        }
        System.out.println(s1); //1234

    }
}

class arrToList {
    static void test() {
        String[] arr1 = {"1","2","3","4"};

        List list1 = Arrays.asList(arr1);
        System.out.println(list1); // [1,2,3,4]

    }
}

class listToArr {
    static void test() {
        List<String> list1 = new ArrayList();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");


        String[] arr1 = list1.toArray(new String[list1.size()]);
        System.out.println(arr1);                  // [Ljava.lang.String;@7f1302d6
        System.out.println(Arrays.toString(arr1)); // [1,2,3,4]
    }
}

class strToSb {
    static void test() {
        String s1 = "1234";
        StringBuffer sb1 = new StringBuffer(s1);

        System.out.println(sb1);            // 1234
        System.out.println(sb1.append(5));  // 12345
    }
}

class sbToStr {
    static void test() {
        StringBuffer sb1 = new StringBuffer("1234");
        String s1 = sb1.toString();

        System.out.println(s1); //1234
    }
}