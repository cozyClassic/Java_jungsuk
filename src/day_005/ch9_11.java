package day_005;

public class ch9_11 {
    public static void main(String args[]) {
        //Compare.test();
        //Concat.test();
        //Contain.test();
        //Replace.test();
        //Split.test();
        Trim.test();
    }
}

class Compare {
    public static void test(){
        String s = "ABC";
        String b = "DEF";
        int compare = s.compareTo(b);
        System.out.println(compare); // -3

        System.out.println("a".compareTo("A")); // 32
        System.out.println("z".compareTo("A")); // 32
        // 1. 첫글자만 비교한다. 2. 아스키코드값의 차이를 나타낸다.
    }
}

class Concat {
    public static void test(){
        String s  = "Hello";

        String s2 = s.concat(" World");
        System.out.println(s2); // Hello World

        s2 = s2.concat("!!!");
        System.out.println(s2); // Hello World!!!
    }
}

class Contain {
    public static void test(){
        String s = "abcde";
        String s2 = "ab123";

        System.out.println(s.contains("a"));    // true. 문자 받음
        System.out.println(s.contains("abcd")); // true. 문자열 받음
        System.out.println(s.contains("z"));    // false

        System.out.println(s2.contains("1"));
        // System.out.println(s2.contains(1));  // 숫자는 인자로 못받음.
    }
}

class Replace {
    public static void test() {
        String a = "aaa";
        String b = "bbb";
        String re= a.replace("a","b");  // "aaa" -> "bbb"
        System.out.println(re);         // bbb
        // 아하! 자바의 replace 모든 문자를 바꾸는구나! (파이썬은 맨 처음만 바꿈)
        re       = a.replace("a","bbb");
        System.out.println(re); // bbbbbbbbb
        re       = a.replace("a","aaa");
        System.out.println(re); // aaaaaaaaa. 바꿔야 할 문자가 늘어난다고 해서, 무한반복을 하지는 않는다.
    }
}

class Split { // 드디어 기다리고 기다리던 split 메소드를 써보는구나
    public static void test() {
        String animals = "dog, cat, deer";
        String[] arr = animals.split(",");    // 띄어쓰기는 고려해주지 않는다. 공백 있으면 포함해서 문자열 만들어버림.
        // System.out.println(arr); //[Ljava.lang.String;@1e9e725a%  이상한게 반환된다.
        // System.out.println(arr.toString()); // [Ljava.lang.String;@19dc67c2%
        System.out.println(String.join("",arr)); // dog cat deer
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]); // "dog", " cat", " deer"
        }
    }
}

class Trim {
    public static void test() {
        String test = "    Heeloooo woo rllld !   ";

        System.out.println("start" + test + "end");
        // start    Heeloooo woo rllld !   end

        System.out.println("start" + test.trim() + "end");
        // startHeeloooo woo rllld !end
    }
}