package calcgame;
import clac.Calc3;
import dto.NumDto;
import dto.OpDto;
public class MainClass {

	public static void main(String[] args) {
		// 문제 갯수를 scan 받아서
		// 그 문제 수만큼 임의 수와 연산자를
		// 받아 문제를 만듦
		// 나누기시 소숫점이 발생하면 첫째 자리에서
		// 반올림을 한다.
		// 총 문제 수에서 정답률을 매겨서
		// 등급을 알려줌
		
		Calc3 exNum = new Calc3();			//문제 수 지정, 로직 탈출, 무작위 숫자 선택 등등
											//의 메소드를 호출
		
		// 문제 숫자를 받는 메소드
		exNum.numberEx();

		// exNum.numberEx() 에서 받은 값 만큼
		// 반복문을 진행
		// 횟수가 넘어가면 exNum.logicEx에서
		// false을 리턴 반복문 종료
		while(exNum.logicEx()) {
			exNum.examNum();
			exNum.examOp();
			exNum.examPt();
			exNum.inPutAns();
			exNum.comResult();
			exNum.checkResult();
		}
		
		// 등급 알려주는 메소드
		exNum.grade();
	
	}//main
}//Class