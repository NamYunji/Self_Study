package _0106.object.student_;
/**
 * - Student 클래스
 속성 : 다음과 같은 3가지 private 필드
   학번(정수형)
   이름(문자열)
   성적(실수형)
  
 기능 : 다음과 같은 7가지 public 메소드
   학번 getter/setter
   이름 getter/setter
   성적 getter/setter
   합격여부 조회 - 기준성적을 매개변수로 받아 성적이 그 이상이면 true, 아니면 false 리턴

 */
public class Student_ {
	private int stdtNum;
	private String name;
	private double score;
	public int getStdtNum() {
		return stdtNum;
	}
	public void setStdtNum(int stdtNum) {
		this.stdtNum = stdtNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
//	합격여부 조회 - 기준성적을 매개변수로 받아 성적이 그 이상이면 true, 아니면 false 리턴
	public boolean pNp(double standard) {

		if (getScore() >= standard) {
			return true;
		}
		else
			return false;
		
	}
	
	

}
