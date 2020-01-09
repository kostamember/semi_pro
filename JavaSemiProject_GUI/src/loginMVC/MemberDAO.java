package loginMVC;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
	private MemberDAO() {
		
	}
	private static MemberDAO instance = new MemberDAO();
	
	public static MemberDAO getInstance() {
		return instance;
	}
	
	public List<MemberVO> selectAllMember() {
		String sql = "select * from member";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		MemberVO mVo;
		List<MemberVO> list = new ArrayList<MemberVO>();
		
		try {
			
			conn = DBManager2.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				mVo = new MemberVO();
				mVo.setUserid(rs.getString("userid"));
				mVo.setUserpwd(rs.getString("userpwd"));
				list.add(mVo);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManager2.close(conn, stmt, rs);
		}
		
		return list;
		
	}

	public int loginProcess(String userid, String userpwd) {
		String sql = "select * from member where userid=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int result = -1;
		
		try {
			conn = DBManager2.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				if(rs.getString("userpwd") != null && rs.getString("userpwd").equals(userpwd)) {
					result = 1;
				} else {
					result = 0;
				}				
			} else {
				result = -1;
			}

		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManager2.close(conn, pstmt, rs);
		}
		
		return result;
	}

	public int insertMember(MemberVO mVo) {
		String sql = "insert into member values(?,?,?,?,?)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = -1;
		try {
			conn = DBManager2.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mVo.getName());
			pstmt.setString(2, mVo.getUserid());
			pstmt.setString(3, mVo.getUserpwd());
			pstmt.setString(4, mVo.getAddress());
			pstmt.setString(5, mVo.getEmail());
			result = pstmt.executeUpdate();
	
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManager2.close(conn, pstmt);
		}
		
		
		return result;
	}
	
}
