package guiStudy;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

public class JButtonTest extends JFrame{

	public JButtonTest( ) {
		// 상단 이름 
		super("버튼 테스트");
		// 버튼을 넣기 위한 패널 생성
		JPanel buttonPanel1 = new JPanel();
		// 이름이 "Button"인 버튼 생성
		JButton btn = new JButton("Button");
		// 버튼 넣기
		buttonPanel1.add(btn);
		
		
		// 버튼안에 이미지 넣기
		ImageIcon icon1 = new ImageIcon(".\\src\\image\\test.png");
		ImageIcon icon2 = new ImageIcon(".\\src\\image\\test2.png");
		JToggleButton tgbutton1 = new JToggleButton(icon1);
		JToggleButton tgbutton2 = new JToggleButton(icon2);
		buttonPanel1.add(tgbutton1);
		buttonPanel1.add(tgbutton2);
		
        // '취미'레이블
        JLabel lblHobby = new JLabel("취미");
        // 체크박스
        JCheckBox check1 = new JCheckBox("운동");
        JCheckBox check2 = new JCheckBox("독서");
        JCheckBox check3 = new JCheckBox("영화감상");
        buttonPanel1.add(lblHobby);
        buttonPanel1.add(check1);
        buttonPanel1.add(check2);
        buttonPanel1.add(check3);
        
        // '성별'레이블
        JLabel lblMale = new JLabel("성별");
        // 
        JRadioButton rb1 = new JRadioButton("남자");
        JRadioButton rb2 = new JRadioButton("여자");
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        buttonPanel1.add(lblMale);
        buttonPanel1.add(rb1);
        buttonPanel1.add(rb2);
        
        add(buttonPanel1);
		
		
	    setLocation(150,200);
        setSize(500,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	
	public static void main(String[] args) {
		new JButtonTest();

	}

}
