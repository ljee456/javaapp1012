package javaapp1012;

public class whileTest {

	public static void main(String[] args) {
		//image1.png , image3.png , image5.png를 출력할 수 있도록 반복문을 작성
		//3번 출력을 해야하고 공통된 부분 image.png이고
		//패턴을 갖는 부분은 1, 3, 5
		
		int i = 1;
		
		while(i < 6) {
			System.out.println("image" + (i) + ".png");
			i = i + 2;
		}

	}

}
