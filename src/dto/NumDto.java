package dto;

/*
 * 수 데이터 클래스
 */
public class NumDto {
	private int num1, num2, result, result2, con, ex, gd;
	
	// 메소드
	// 값을 셋팅
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	// 값을 가져오자
	public int getNum1() {
		return this.num1;
	}
	public int getNum2() {
		return this.num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getResult() {
		return this.result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public int getResult2() {
		return this.result2;
	}
	public void setResult2(int result2) {
		this.result2 = result2;
	}
	public int getConuti() {
		return this.con;
	}
	public void setConuti(int con) {
		this.con = con;
	}
	public int getEx() {
		return this.ex;
	}
	public void setEx(int ex) {
		this.ex = ex;
	}
	public int grade1() {
		return this.gd;
	}
	public void grade1(int gd) {
		this.gd = gd;
	}
}