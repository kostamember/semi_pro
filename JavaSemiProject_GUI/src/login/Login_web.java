package login;

import java.awt.*;

import javax.swing.*;
public class Login_web extends JPanel{
 
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel la1,la2;
	JTextField tf;
	JPasswordField pf;
	JButton b1,b2;
	Image img;
 
 public Login_web()
 {
   //img=Toolkit.getDefaultToolkit().getImage("C:/test/Koala.jpg");
   img=Toolkit.getDefaultToolkit().getImage("C:/test/back_ground_image2.png");
   la1=new JLabel("ID");
   la2=new JLabel("PW");
   
   tf=new JTextField();
   pf=new JPasswordField();
   
   b1=new JButton("Login");
   b2=new JButton("Cancel");
   //배치
   setLayout(null); //null값을 주게 되면 Programmer가 직접배치함.
     la1.setBounds(10,15,50,20);
     tf.setBounds(65, 15, 120, 20);
    
     la2.setBounds(10,40,50,20);
     pf.setBounds(65, 40, 120,20);
   
   JPanel panel=new JPanel();
   
   panel.setOpaque(true); //투명모드 전환
   /*
    *  JRadioButoon,JPanel : 불투명모드
    */
   panel.add(b1);
   panel.add(b2);
   
   panel.setBounds(10, 65, 175, 35);
   
   //추가
   add(la1);
   add(tf);
   add(la2);
   add(pf);
   
   add(panel);
   
   
   
 }

 @Override
 protected void paintComponent(Graphics g) {
	 g.drawImage(img,  0,0,getWidth(),getHeight(),this);
 }

 

}