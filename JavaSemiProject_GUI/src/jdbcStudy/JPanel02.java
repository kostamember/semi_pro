package jdbcStudy;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import jdbcStudy.JPanel02.MyActionListener;

class JPanel02 extends JPanel{        // 2번째 패널
    private JTextField userid;
    private JPasswordField userpwd;
    private JPanelTest win;
    
    public JPanel02(JPanelTest win) {
        setLayout(null);
        this.win = win;
        // <td> 아이디 <td>
        JLabel lblLbl = new JLabel("아이디:");
        lblLbl.setBounds(31, 40, 67, 15);
        add(lblLbl);
        
        // jsp의 <input type="text" name="userid">
        userid = new JTextField();
        userid.setBounds(123, 40, 116, 21);
        add(userid);
        userid.setColumns(10);
        
        JLabel lblLbl_1 = new JLabel("암호:");
        lblLbl_1.setBounds(31, 84, 67, 15);
        add(lblLbl_1);
        
        userpwd = new JPasswordField();
        userpwd.setBounds(123, 84, 116, 21);
        add(userpwd);
       
        String id = userid.getText();
        String pwd = userpwd.getName();
        MemberDAO mDao = MemberDAO.getInstance();
		int result = mDao.loginProcess(id, pwd);
        
        if(result == 1) { 
        // 이 버튼이 눌리면, 창이 바뀐다. main 창으로 간다. 
        JButton btn = new JButton("버튼");
        btn.setSize(70,20);
        btn.setLocation(10,10);
        add(btn);
        btn.addActionListener(new MyActionListener());
        } else if(result == 0) {
        	JOptionPane.showMessageDialog(null, "비밀번호가 틀립니다.");
		} else if(result == -1) {
			JOptionPane.showMessageDialog(null, "존재하지 않는 아이디입니다.");
		}
        
        
    }
    class MyActionListener implements ActionListener {         // 버튼 키 눌리면 패널 1번 호출
        @Override
        public void actionPerformed(ActionEvent e) {
            win.change("panel01");
        }
    }
}