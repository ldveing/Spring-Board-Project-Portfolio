package old.DispatcherServlet4.spring.annotation;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogoutController{

	@RequestMapping(value="/logout.do")
	public String logout(HttpSession session) {
		System.out.println("로그아웃 처리");
		// 1. 세션 삭제
		session.invalidate();
		// 2. 화면 이동
		return "login.jsp";
	}

}
