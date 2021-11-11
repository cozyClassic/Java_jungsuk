
public class ch6_practive {

	public static void main(String[] args) {
		Student s = new Student("홍길동", 1, 1, 100, 60, 76);
		
		String str = s.info();
		System.out.println(str);
		
		Student s2 = new Student();
		s2.name = "길동이";
		s2.ban 	= 1;
		s2.no	= 2;
		s2.kor 	= 100;
		s2.eng  = 76;
		s2.math = 60;
		
		System.out.println("이름 : " + s.name);
		System.out.println("총점 : " + s.getTotal());
		System.out.println("평균 : " + s.getAverage());
	}

}

class Student {
	String name;
	int ban ;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban  = ban;
		this.no   = no;
		this.kor  = kor;
		this.eng  = eng;
		this.math = math;
	}
	
	Student(){}
	
	String info(){
		// double avg_score = sum_score/3;		// 평균점수가 int형으로 나오는현상이 발생함.
		//double avg_score2 = Math.round((double)getTotal()*10/3)/10.0; // 소수점을 한칸 위로 끌어 올려서 반올림 한 후, 다시 10.0(실수)로 나누기.
		String result = this.name  + "," + this.ban + "," + this.no + "," + this.kor + "," + this.eng + "," + this.math + "," + getTotal() + "," + getAverage();
		return result;
	}
	
	int getTotal(){
		return this.kor + this.eng + this.math; 
	}
	
	double getAverage() {
		return Math.round((double)getTotal()*10/3)/10.0;
	}
}

class MyTv {
	boolean isPowerOn;
	
	void turnOnOff() {
		isPowerOn = !isPowerOn;
	}
}