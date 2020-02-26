package chap04;

public class ArrayTest06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cities[] = {"서울","대구","춘천","울산","광주","천안"}; 
		String nations[] = new String[]{"대한민국","미국","영국","일본","프랑스"};
		String newArray[] =  new String[cities.length+nations.length];
		//		for(int i=0;i<cities.length;i++) {
		//			newArray[i] = cities[i];
		//		}
		//		for(int i=0;i<nations.length;i++) {
		//			newArray[cities.length+i] = nations[i];
		//		} // newArray[]에 cities[],nations[] 두 배열의 값을 반복문으로 입력
		System.arraycopy(cities, 0, newArray, 0, cities.length);
		System.arraycopy(nations, 0, newArray, cities.length, nations.length);
		for(String str:newArray) {
			System.out.println(str);
			
		}
	}

}
