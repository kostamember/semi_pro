package guiStudy;

import javax.swing.JFrame;

// 상속을 받아서 JFrmae1과 완전히 같은 결과를 낸다

class Frame2 extends JFrame {

	public Frame2() {
		setTitle("상단에 표시되는 글자(상속이용)");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}