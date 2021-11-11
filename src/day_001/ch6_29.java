
public class ch6_29 {

	public static void main(String[] args) {
		String test = "abcd";
		test.sub

	}
	
	void instance_m() {}
	static void static_m() {}
	
	void instance_m2() {
		instance_m();
		static_m();
	}
	
	static void static_m2() {
		instance_m(); // cannot make a static reference to the non-static method 
		static_m();
	}

}

