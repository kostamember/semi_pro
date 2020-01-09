package guiStudy;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class loginView extends JFrame implements ActionListener{
	BufferedImage img = null;
	
	
	public loginView() {
		setTitle("배경화면 테스트");
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setSize(1000, 1000);
		layeredPane.setLayout(null);
		
		try {
			String back_image1 = "C:\\Users\\sist\\Desktop\\image\\test.png";
			String back_image2 = "C:/test/Koala.jpg";
			img = ImageIO.read(new File(back_image2));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "이미지 불러오기 실패");
			System.exit(0);
		}
		
		myPanel panel = new myPanel();
		panel.setSize(1000, 1000);
		layeredPane.add(panel);
		
		setLayout(null);
		
		add(layeredPane);
		
//		setUndecorated(false);
//		setBackground(new Color(0,0,0,122));

		
		
		//setBounds(720,220,480,640);
		setBounds(1000,1000,1000,1000);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	
	
	
	
	class myPanel extends JPanel {
		public void paint(Graphics g) {
	
			g.drawImage(img, 0, 0, null);
			
		
		}
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
	public static void main(String[] args) {
		new loginView();
	}

}
