package loginMVC;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

//import com.mvc.controller.LoginController;


public class LoginView extends JFrame {

    private static final long serialVersionUID = 3566038652320101414L;
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton btnLogin;
   // private JButton btnJoin;
    private JLabel lblErrorMessage;

    public LoginView() {
        setTitle("Login");
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 250);
        Container contentPane = this.getContentPane();
        contentPane.setLayout(null);

        JLabel lblUsername = new JLabel("Username:");
        lblUsername.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblUsername.setHorizontalAlignment(SwingConstants.RIGHT);
        lblUsername.setBounds(10, 11, 120, 25);
        contentPane.add(lblUsername);

        txtUsername = new JTextField();
        txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txtUsername.setBounds(140, 11, 200, 25);
        contentPane.add(txtUsername);

        JLabel lblPassword = new JLabel("Password:");
        lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
        lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblPassword.setBounds(10, 52, 120, 25);
        contentPane.add(lblPassword);

        txtPassword = new JPasswordField();
        txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txtPassword.setBounds(140, 52, 200, 25);
        contentPane.add(txtPassword);

        // 로그인 버튼
        LoginController controller = new LoginController(this);
        btnLogin = new JButton("Login");
        btnLogin.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                controller.checkCredentials(txtUsername.getText(), new String(txtPassword.getPassword()));
            }
        });
        btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnLogin.setBounds(251, 93, 89, 25);
        contentPane.add(btnLogin);
        
       // 회원가입 버튼  
        JButton btnJoin = new JButton("Join");
        btnJoin.addActionListener(new JoinListener());
        
        /*btnJoin = new JButton("Join");
        btnJoin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				controller.joinMember();
				
			}
		});
		*/
        btnJoin.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnJoin.setBounds(100, 100, 100, 100);
        contentPane.add(btnJoin);
        
        

        lblErrorMessage = new JLabel("");
        lblErrorMessage.setHorizontalAlignment(SwingConstants.RIGHT);
        lblErrorMessage.setForeground(Color.RED);
        lblErrorMessage.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblErrorMessage.setBounds(10, 151, 330, 25);
        contentPane.add(lblErrorMessage);
    }
    
    class JoinListener implements ActionListener {
    	
    	
		@Override
		public void actionPerformed(ActionEvent e) {
			
			
		}
    
    }
    

    public void setErrorMessage(String errorMessage) {
        lblErrorMessage.setText(errorMessage);
    }

    public static void main(String args[]){
        LoginView view = new LoginView();
        view.setVisible(true);
    }
}