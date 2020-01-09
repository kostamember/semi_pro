package guiStudy;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame extends JFrame {
	public MyFrame() {
		setSize(500, 400);
		setTitle("로그인");
		// 기본설정 BoarderLayout에서 FlowLayout으로 변경
		setLayout(new FlowLayout());
		JButton button = new JButton("로그인");
		// button을 생성한 후, add(button)을 꼭 해 줘야 프레임 안에 들어간다.
		//
		this.add(button);
		setVisible(true);
	}
}




public class MyFrameTest {

	public static void main(String[] args) {
		MyFrame f = new MyFrame();
		
		
		
		

	}

}
