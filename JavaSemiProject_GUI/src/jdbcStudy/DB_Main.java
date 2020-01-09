package jdbcStudy;

import java.util.ArrayList;
import java.util.List;

public class DB_Main {

	public static void main(String[] args) {
		// DB에 있는 USERID와 USERPWD를 출력해준다.
		
		
		MemberDAO mDao = MemberDAO.getInstance();
		
		List<MemberVO> list = new ArrayList<>();
		MemberVO mVos;
		list = mDao.selectAllMember();
		
		for(int i=0; i<list.size(); i++) {
			mVos = new MemberVO();
			mVos = list.get(i);
			System.out.println(mVos.getUserid()+", "+mVos.getUserpwd());
		}
		
		
		
		
	}

}
