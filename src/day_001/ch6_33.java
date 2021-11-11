
public class ch6_33 {
	public static void main(String[] args) {
		Car c = new Car();
		c.color = "white";
		c.gearType = "auto";
		c.door = 4;
		
		Car c2 = new Car("black","auto",4);
	}	
}

class Car {
	String color;
	String gearType;
	int door;
	
	Car(){}
	Car(String c, String g, int d){
		color = c;
		gearType = g;
		door = d;
	}
}