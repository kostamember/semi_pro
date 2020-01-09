package loginMVC;

//import com.mvc.model.LoginModel;
//import com.mvc.view.LoginView;

public class LoginController {

    private LoginView view;
    private MemberDAO model;

    public LoginController(LoginView view){
        this.view = view;
        model = MemberDAO.getInstance();
    }

    public void checkCredentials(String userid, String userpwd){
//        model.setUsername(username);
//        model.getCredentials();
    	int result = model.loginProcess(userid, userpwd);
        if(result == 1){
            view.setErrorMessage("Login Success!");
            // 여기서 main으로 이동해야 함. 
            Test_Main toMain = new Test_Main();
         
            view.setVisible(false);
            toMain.setVisible(true);
            
        }
        else if(result == 0){
            view.setErrorMessage("Wrong password");
        } 
        else if(result == -1) {
        	 view.setErrorMessage("Do not exits userid");
        }
    }

	public void joinMember() {
		Join_View join = new Join_View();
        
        view.setVisible(false);
        join.setVisible(true);
		
	}
}
