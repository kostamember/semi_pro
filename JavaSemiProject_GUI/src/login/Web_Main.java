package login;

import java.awt.*; //Layout
//BorderLayout(5군데 배치), FlowLayout(일자배열)
//GridLayout(같은 크기)
//CardLayout
import java.awt.event.*; //Listener(위임자)
/*
*   사용자가 행위(마우스, 키보드)
*   == 1. JVM이 신호를 받는다.
*   == 2. 정보를 JFrame에 전송
*   == 3. JFrame이 처리
*
*/
import javax.swing.*;//윈도우와 관련된 모든 클래스

public class Web_Main extends JFrame implements ActionListener {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	
	CardLayout card = new CardLayout();
	Login_web Login = new Login_web();
	Menu_Form mf = new Menu_Form();
	JMenuItem startItem, stopItem, exitItem;

	public Web_Main() {
		JMenuBar bar = new JMenuBar();
		JMenu menu = new JMenu("게임");

		startItem = new JMenuItem("시작");
		stopItem = new JMenuItem("정지");
		exitItem = new JMenuItem("종료");

		menu.add(startItem);
		menu.add(stopItem);
		menu.addSeparator(); // 기능별로 나눠주는 라인선
		menu.add(exitItem);

		bar.add(menu);

		setJMenuBar(bar);

		setLayout(card);
		add("LOGIN", Login);
		add("MF", mf);
		setSize(640, 480); // window 크기 결정
		setVisible(true); // window를 보여준다.
		setDefaultCloseOperation(EXIT_ON_CLOSE);
//x버튼 클릭시 메모리 해제
//window ==> dispose();System.exit(0);
		//Login.tf
		
		Login.b1.addActionListener(this);
//이벤트 등록
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() != Login.b1) {
			card.show(getContentPane(), "MF");
			// JRootPane연결 : 관리자(투명창)
		}
	}
	
	public static void main(String[] args) {

		new Web_Main();
	}

}