package jdbcStudy;

import java.util.Scanner;

public class Join {

	public static void main(String[] args) {
		MemberVO mVo = new MemberVO();
		MemberDAO mDao = MemberDAO.getInstance();
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("회원가입 페이지");
		
		System.out.print("이름 : ");
		mVo.setName(kb.next());
		System.out.print("아이디 : ");
		mVo.setUserid(kb.next());
		System.out.print("비밀번호: ");
		mVo.setUserpwd(kb.next());
		System.out.print("주소 : ");
		mVo.setAddress(kb.next());
		System.out.print("이메일 : ");
		mVo.setEmail(kb.next());
		
		int result = mDao.insertMember(mVo);
		
		if(result != -1) {
			System.out.println("회원가입에 성공했습니다.");
		} else {
			System.out.println("회원가입에 실패했습니다.");
		}
		
		kb.close();
		
	}

}
