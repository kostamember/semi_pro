package guiStudy;

import javax.swing.JFrame;

public class Code01 {

	public static void main(String[] args) {
		JFrame f = new JFrame("로그인 페이지");
		// 창의 크기를 설정함
		f.setSize(500, 400);
		// x버튼을 누르면, 프레임은 닫히지만 프로그램은 종료되지 않는다.
		// 프로그램도 종료하기 위해서 setDefaultCloseOperation을 쓴다
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
		f.setVisible(true);

	}

}
