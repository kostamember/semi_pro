package jdbcStudy;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String userid = kb.next();
		System.out.print("비밀번호 : ");
		String userpwd = kb.next();
		
		MemberDAO mDao = MemberDAO.getInstance();
		int result = mDao.loginProcess(userid, userpwd);
		
		if(result == 1) {
			System.out.println("로그인에 성공했습니다.");
		} else if(result == 0){
			System.out.println("비밀번호가 틀립니다.");
		} else if(result == -1) {
			System.out.println("존재하지 않는 아이디입니다.");
		}
		
		
		kb.close();
		

	}

}
