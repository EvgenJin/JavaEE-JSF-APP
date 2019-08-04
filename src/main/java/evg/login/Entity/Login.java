/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evg.login.Entity;
import evg.login.Util.Auth;
import evg.login.Util.SessionUtils;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

@ManagedBean
@SessionScoped
//@ViewScoped 
public class Login implements Serializable {

	private static final long serialVersionUID = 1094801825228386363L;
	
	private String pwd;
	private String msg;
	private String user;

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	//validate login
	public String validateUsernamePassword() {
		boolean valid = Auth.validate(user, pwd);
		if (valid) {
			HttpSession session = SessionUtils.getSession();
                        session.setAttribute("username", user);
                        user = SessionUtils.getUserName();
			return "admin";
		} else {
//                    info();
//                        setMsg("Не верное имя пользователя или пароль");
                        FacesContext.getCurrentInstance().addMessage(
                                null
                                , new FacesMessage(FacesMessage.SEVERITY_ERROR
                                                   ,"Не правильное имя пользователя или пароль"
                                                   ,"Проверьте реквизиты"));
			return null;
		}
	}
        public void info() {
//           SEVERITY_INFO SEVERITY_WARN SEVERITY_ERROR SEVERITY_FATAL
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Info", "PrimeFaces Rocks."));
        }
	//logout event, invalidate session
	public String logout() {
		HttpSession session = SessionUtils.getSession();
		session.invalidate();
		return "index";
	}
        
        public String getSessionUser() {
            return SessionUtils.getUserName();
        }
}


