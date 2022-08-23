package old.DispatcherServlet4.spring.annotation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbook.biz.member.MemberDTO;
import com.springbook.biz.member.impl.MemberDAO;


@Controller
public class LoginController{

	@RequestMapping(value="/login.do")
	public String login(MemberDTO dto, MemberDAO memberDAO) {
		System.out.println("로그인 처리");
		// 1. 클라이언트의 입력 정보 획득
		// 2. 객체 생성 및 DB 연동
		// 3. 화면 이동
		// ModelAndView 클래스 - 모델과 뷰를 함께 저장하는 클래스
		// redirect: - ViewResolver를 무시하고 리다이렉트를 실행
		if(memberDAO.getMember(dto) != null) return "getBoardList.do";
		else return "login.jsp"; 
	}

}
