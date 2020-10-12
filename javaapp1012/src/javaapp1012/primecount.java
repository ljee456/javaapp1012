package javaapp1012;

public class primecount {

	public static void main(String[] args) {
		//2~1000까지 소수의 개수 구하기
		//소수는 2부터 자신의 절반이 되는 숫자까지 나누어서
		//나누어 떨어지지 않으면 소수
		
		//1.개수를 구할 변수를 생성
		int cnt = 0;
		
		//2.2부터 1000까지 1씩 증가하면서 수행
		//i는 소수인지 판단할 숫자
		//j는 소수 판별을 위해서 나누는 숫자
		for(int i=2; i<=1000; i=i+1) {
			//나누어 떨어졌는지 확인하기 위한 변수
			boolean flag = false;
			//2부터 자신의 절반이 되는 숫자까지
			for(int j=2; j<=i/2; j=j+1) {
				//나누어 떨어지는지 확인
				if( i % j ==0) {
					//나누어 떨어지면 변수의 값을 변경
					flag = true;
					break;
				}
			}
			//나누어 떨어졌는지 판별하기
			//true로 변경되지 않았다면 나누어 떨어진 적이 없음
			if(flag == false) {
				//개수를 1증가시킴
				cnt = cnt + 1;
			}
		}
		//개수를 출력
		System.out.printf("소수 개수: %d개\n",cnt);
		
	}

}
