package guiStudy;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
 
public class BackGround_Opaque extends JFrame {
    JScrollPane scrollPane;
    ImageIcon icon;
 
    public BackGround_Opaque() {
        icon = new ImageIcon("C:/test/Koala.jpg");
       
        //배경 Panel 생성후 컨텐츠페인으로 지정      
        JPanel background = new JPanel() {
            public void paintComponent(Graphics g) {
                // Approach 1: Dispaly image at at full size
                g.drawImage(icon.getImage(), 0, 0, null);
                // Approach 2: Scale image to size of component
                // Dimension d = getSize();
                // g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                // Approach 3: Fix the image position in the scroll pane
                // Point p = scrollPane.getViewport().getViewPosition();
                // g.drawImage(icon.getImage(), p.x, p.y, null);
                setOpaque(true); //그림을 표시하게 설정,투명하게 조절
                super.paintComponent(g);
            }
        };
       
       
       
        JButton button = new JButton("버튼");
        background.add(button);
        scrollPane = new JScrollPane(background);
        setContentPane(scrollPane);
    }
 
    public static void main(String[] args) {
    	BackGround_Opaque frame = new BackGround_Opaque();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}