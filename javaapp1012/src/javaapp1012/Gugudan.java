package javaapp1012;

public class Gugudan {

	public static void main(String[] args) {
		// 2단 만들기
		for(int i =1; i<=9; i=i+1) {
			System.out.printf("2 * %d =%3d\n",i,2*i);
		}
		//반복문의 중첩을 이용한 구구단 출력
		for(int j =2; j<=9; j++) {
			for(int i =1; i<=9; i=i+1) {
				System.out.printf("%d* %d =%3d",j,i,j*i);
			}
			System.out.printf("\n");
		}
		
	}

}
