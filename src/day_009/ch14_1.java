package day_009;

public class ch14_1 {
    public static void main(String[] args){
        //Object obj = (a,b) -> a > b ? a : b ; // 에러 발생1
        // Operator '>' cannot be applied to '<lambda parameter>', '<lambda parameter>'
        Object obj = new Object() {
            int max(int a, int b) {
                return a >b ? a:b ;
            }
        }; // 오브젝트의 선언/할당이기 때문에 끝에 ; 필요함.

        // int value = obj.max(3,5); // 에러 발생 2
        // Cannot resolve method 'max' in 'Object'
        // Object의 인스턴스 obj에는 max를 호출할 리모콘이 없음.

        // 위와 같은 에러 1, 2를 극복하기 위해서는 함수형 인터페이스를 사용해야 한다.
    }
}
