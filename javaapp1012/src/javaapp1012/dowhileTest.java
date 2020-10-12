package javaapp1012;

public class dowhileTest {

	public static void main(String[] args) {
		//1. 1~100까지 더하기 do ~ while로 해결
		int i = 1;
		int sum = 0;
		
		do {
			sum = sum + i;
			i = i+1;
		}while(i<101);
		System.out.println("sum:" + sum);
		
		//2. 1~100까지 홀수의 합을 do ~ while로 해결
		//1씩 증가하는 형태로 해결
		i = 1;
		sum = 0;
		
		do {
			sum = sum + (2*i - 1);
			i = i+1;
		}while(i < 51);
		System.out.println("sum:" + sum);
		
		//2씩 증가하는 형태로 해결
		i = 1;
		sum = 0;
		
		do {
			sum = sum + i;
			i = i+2;
		}while(i < 101);
		System.out.println("sum:" + sum);
	}

}
