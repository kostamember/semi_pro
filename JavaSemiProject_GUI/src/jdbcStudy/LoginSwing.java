package jdbcStudy;

import javax.swing.JOptionPane;

public class LoginSwing {

	public static void main(String[] args) {
		
		

		String userid = JOptionPane.showInputDialog("아이디 입력 ");

		String userpwd = JOptionPane.showInputDialog("비밀번호 입력 ");
		
		MemberDAO mDao = MemberDAO.getInstance();
		int result = mDao.loginProcess(userid, userpwd);
		
		try {
			if(result != 1) {
				throw new Exception();
			}
			JOptionPane.showMessageDialog(null, "로그인에 성공했습니다.");
		} catch(Exception e) {
			
			if(result == 0) {
				JOptionPane.showMessageDialog(null, "비밀번호가 틀립니다.");
			} else if(result == -1) {
				JOptionPane.showMessageDialog(null, "존재하지 않는 아이디입니다.");
			}
			
		} 
		

	}

}
