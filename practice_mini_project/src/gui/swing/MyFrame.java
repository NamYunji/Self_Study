package gui.swing;

import javax.swing.JFrame;
import javax.swing.JLabel;

//JFrame객체를 상속받는 스윙프레임 클래스 작성
//&import 'JFrame'클래스
public class MyFrame extends JFrame{
	
	public static void main(String[] args) {
		new MyFrame();
	}
	//frame 생성
	public MyFrame() {
		
		//JFrame 객체 생성
//		JFrame jfr = new JFrame();
		//JFrame 제목 지정
		setTitle("swing GUI");
		//JFrame 크기 설정
		setSize(500, 300);
		//JFrame 위치 설정 (직접설정)
		setLocation(200, 200);
		//JFrame 위치 설정 (가운데 배치)
		setLocationRelativeTo(null);
		//setLocation, setSize를 한번에 처리
		setBounds(200, 200, 500, 300);
		//resizing 방지
		setResizable(false);

		
		//종료동작 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//자식 컴포넌트 추가
		add(new JLabel("component"));
			
		//JFrame 활성화 (맨마지막에 작성)
		setVisible(true);
		
		
		
	}


	

}
