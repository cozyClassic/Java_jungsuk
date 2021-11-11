public class ch6_23 {

	public static void main(String[] args) {
		Data d 	= new Data();
		d.x 	= 10;
		System.out.println("main() : X = " + d.x);
		
		change(d); // 참조형 매개변수 d.x => d
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	}
	
	static void change(Data d) {
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}

}

class Data{
	int x;
}