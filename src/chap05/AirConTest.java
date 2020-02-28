package chap05;

public class AirConTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AirCon airCon = new AirCon();
		airCon.color = "white";
		airCon.temp = 10;
		airCon.price = 10000;		 
		airCon.tempUp();
		System.out.printf("%s %s %s%n",airCon.color, airCon.temp, airCon.price);
		
		AirCon airCon2 = new AirCon();
		System.out.println(airCon2.color);
		System.out.println(airCon2.price);
		
		airCon2 = airCon; // !!!!!!!!!!!!!!!!같은 주소를 공유하게 한다.!!!!!!!!!!!!
		System.out.println(airCon2.color);
		System.out.println(airCon2.price);
		
		airCon2.tempUp();
		System.out.println(airCon.temp);
		
	}

}
