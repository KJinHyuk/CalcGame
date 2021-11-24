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
		
		Calc3 exNum = new Calc3();
		
		//문제 숫자를 받는 메소드
		exNum.numberEx();

		while(exNum.logicEx()) {
			exNum.examNum();
			exNum.examOp();
			exNum.examPt();
			exNum.inPutAns();
			exNum.comResult();
			exNum.checkResult();
		}
		
		exNum.grade();
	
	}//main
}//Class