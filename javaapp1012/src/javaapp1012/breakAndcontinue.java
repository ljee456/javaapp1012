package javaapp1012;

public class breakAndcontinue {

	public static void main(String[] args) {
		//break는  반복문을 중단하는 역할
		for(int i=1; i<=10; i=i+1) {
			//i의 값이 3의 배수가 되면 반복문을 종료
			if(i % 3 == 0) {
				break;
			}
			System.out.println("hello java" + i);
		}
		
		//continue는 반복문안에서 아래 문장은 수행하지 않고
		for(int i=1; i<=10; i=i+1) {
			//i의 값이 3의 배수가 되면 다음 반복문으로 넘어간다(1 2 4 5 7 8 10을 출력)
			//3의 배수는 뺴고 출력된다
			if(i % 3 == 0) {
				continue;
			}
			System.out.println("hello java" + i);
		}
		
	}
}

