package day_002;

public class ch7_24 {
    public static void main(String args[]) {

        FireEngine f = new FireEngine();

        Car c = (Car)f;  // FireEngine -> Car 로의 형변환. OK!

        FireEngine f2 = (FireEngine) c; // Car -> FireEngine으로의 형변환. OK!

        //Ambulance a = (Ambulance) f; // incompatible types: FireEngine cannot be converted to Ambulance

        // Ambulance a2 = (Ambulance) c; // ClassCastException: class day_002.FireEngine cannot be cast to class day_002.Ambulance


    }
}

class Car {};
class FireEngine extends Car {};
class Ambulance extends  Car {};
