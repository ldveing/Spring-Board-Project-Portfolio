package old.DispatcherServlet4.spring.annotation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springbook.biz.board.BoardDTO;
import com.springbook.biz.board.impl.BoardDAO;

@Controller
public class GetBoardController{
	
	@RequestMapping(value="/getBoard.do")
	public ModelAndView getBoard(BoardDTO dto, BoardDAO boardDAO, ModelAndView mav){
		System.out.println("글 상세 보기");
		// 1. 요청 정보 획득
		// 2. 객체 생성, DB 연동
		//BoardDTO board = boardDAO.getBoard(dto);
		// 3. 화면 이동
		mav.addObject("board", boardDAO.getBoard(dto));
		mav.setViewName("getBoard.jsp");
		return mav;
	}
	
}
