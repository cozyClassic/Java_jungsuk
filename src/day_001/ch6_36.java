
public class ch6_36 {

	public static void main(String[] args) {
		Car2 c1 = new Car2();
		Car2 c2 = new Car2("blue");
		
		System.out.println("c1의 colr = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
		System.out.println("c2의 colr = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);

		add10 a1 = new add10(2,6);
		add10 a2 = new add10(6);
		
		System.out.println("a1의 a = " + a1.a + ", a1의b = " +a1.b);
		System.out.println("a2의 a = " + a2.a + ", a2의b = " +a2.b);

	}

}

class Car2 {
	String color;
	String gearType;
	int door;
	
	Car2(String c, String gearType, int door){
		this.color 		= c;
		color = c;
		this.gearType 	= gearType;
		this.door 		= door;
	}
	
	Car2(){
		this("white", "auto", 4);
	}
	
	Car2(String color){
		this(color, "auto", 4);
	}
	
}

class add10{
	int a;
	int b;
	String c = long.class.toString();
			
	
	add10(int a, int b){
		this.a = a;
		this.b = b;			
	}
	
	add10(int a){
		this.a = a;
		this.b = this.a+10;  // 방금 할당한 인스턴스변수 a를 불러와서 사용하기.
	}
}