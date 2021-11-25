package clac;

import dto.NumDto;
import dto.OpDto;
import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicLookAndFeel;

import java.util.ArrayList;

public class Calc3 {
	private int num1, num2, result, result2, inPut, a = 0, b = 0, gd1, gd2;
	private String Exop[] = { "+", "-", "*", "/" };
	NumDto nDto = new NumDto();
	OpDto oDto = new OpDto();
	
	
	//문제 수 지정 메소드
	public void numberEx() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문항 갯수는? : ");
		nDto.setEx(sc.nextInt());
		
	}//noEx
	
	//logic 탈출 메소드
	public boolean logicEx() {
		while(a < nDto.getEx()){
			a++;
			return true;
		}
		return false;
	}//logicEx

	// 무작위 숫자 선택 메소드
	public void examNum() {
		Random rd = new Random();
		nDto.setNum1(rd.nextInt(100) + 1);
		nDto.setNum2(rd.nextInt(100) + 1);
	}// examNum

	// 무작위 연산자 선택 메소드
	public void examOp() {
		Random rd = new Random();
		oDto.setOp(Exop[rd.nextInt(3)+1]);

	}// examOp

	// 문제 출력 메소드
	public void examPt() {
		System.out.print(nDto.getNum1());
		System.out.print(oDto.getOp());
		System.out.print(nDto.getNum2());
		System.out.print(" = ");
	}// examPt

	// 사용자의 정답 값 입력 메소드
	public void inPutAns() {
		Scanner sc = new Scanner(System.in);
		nDto.setResult(sc.nextInt());
	}// inPutAns

	// 컴퓨터 연산 결과 메소드
	public void comResult() {
		if(oDto.getOp().equals("+")) {
			nDto.setResult2(nDto.getNum1() + nDto.getNum2());			 
		}else if(oDto.getOp().equals("-")) {
			nDto.setResult2(nDto.getNum1() - nDto.getNum2());
		}else if(oDto.getOp().equals("*")) {
			nDto.setResult2(nDto.getNum1() * nDto.getNum2());
		}else {
			nDto.setResult2(Math.round(nDto.getNum1() / nDto.getNum2()));		//소숫점 첫째 차리에서 반올림
		}//else
	}//comResult

	// 컴퓨터 연산 결과와 사용자 정답 입력 값을 비교 하는 메소드
	public void checkResult() {
		if (nDto.getResult() == nDto.getResult2()) {
			System.out.println("정답 입니다.");
			b++;
			nDto.setConuti(b);
			
		} else {
			System.out.println("오답 입니다.");
			nDto.setConuti(b);
		}//else
	}//checkResult
	
	// 정답률 체크 메소드
	public void grade() {
		gd1 = nDto.getConuti();
		gd2 = nDto.getEx();
		if (((gd1 / gd2)*100)>=90) {
			System.out.print((gd1 / gd2)*100 +"점 - ");
			System.out.println("A 등급 입니다.");
		}else if(((gd1 / gd2)*100)>=80 && ((gd1 / gd2)*100)<90) {
			System.out.print((gd1 / gd2)*100 +"점 - ");
			System.out.println("B 등급 입니다.");
		}else if(((gd1 / gd2)*100)>=70 && ((gd1 / gd2)*100)<80) {
			System.out.print((gd1 / gd2)*100 +"점 - ");
			System.out.println("C 등급 입니다.");
		}else {
			System.out.print((gd1 / gd2)*100 +"점 - ");
			System.out.println("피곤 하신가요?");
		}//else
	}//grade
}//Class
