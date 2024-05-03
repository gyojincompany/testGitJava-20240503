package testProject_20240503;

public class ForTest {

	public static void main(String[] args) {
		// 1~10까지 출력하는 for문을 작성해보자
		
		// 파이썬 : for i in range(1,11):
		// 파이썬 :   print(i)
		
		
		for(int i=1;i<=100;i++) { //초;조;증->초기값;조건식;증감식
			System.out.println(i);
		}
		
		for(int i=100;i>=1;i--) {
			System.out.println(i);
		}
		
		for(int i=1;i<=100;i=i+2) { //초;조;증->초기값;조건식;증감식
			System.out.println(i);
		}
		
		//0~1000 사이의 정수 중 짝수만 출력하는 for문을 작성하시오
		for(int i=0;i<=1000;i=i+2) { //초;조;증->초기값;조건식;증감식
			System.out.println(i);
		}
		
		System.out.println("--------------------------------------");
		
		int sum = 0;
		//1~100까지의 합을 출력하는 for문을 작성하시오. 5050 // sum=sum+i 
		for(int i=1;i<=100;i++) {
			sum = sum + i;			
		}
		
		System.out.println(sum);
	}

}
