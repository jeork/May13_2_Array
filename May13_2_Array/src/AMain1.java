import java.util.Iterator;

// 변수
//	변수 1 : 데이터 1

// 배열(Array) [ ]
//	변수 1 : 데이터 n
// 배열 : 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
//	배열속 각각의 데이터를 '요소'라고 부름
//	이 요소마다 붙여진 일련번호가 있는데 각 요소를 구별하는데 사용
//	-> 인덱스(Index) : 0부터 시작

// 배열 생성
//	자료형[] 변수명;  - 배열 선언
// 	변수명 = new 자료형[배열의 크기]; - 배열 초기화
// 	=>자료형[] 변수명 = new 자료형[배열의 크기];

public class AMain1 {
	public static void main(String[] args) {

		int[] eng = new int[3]; // 배열 초기화1
		eng[0] = 100;
		eng[1] = 70;
		eng[2] = 50;
		//eng[3] = 10; // 배열의 지정된 범위가 아니면 에러!

		for (int i = 0; i < eng.length; i++) {
			// .length : 이 배열의 요소 갯수
			System.out.println(eng[i]);

		}
		System.out.println("==================");
		int[] math = new int[] { 10, 30, 60 }; // 배열 초기화2
		for (int i = 0; i < math.length; i++) {
			System.out.println(math[i]);
		}
		System.out.println("==================");

		int[] kor = { 20, 40, 70 }; // 배열 초기화3(약식을 못쓰는 경우도 있음)

		for (int i = 0; i < kor.length; i++) {
			System.out.println(kor[i]);
		}

	}
}
