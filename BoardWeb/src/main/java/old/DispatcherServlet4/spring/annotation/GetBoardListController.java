package old.DispatcherServlet4.spring.annotation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springbook.biz.board.BoardDTO;
import com.springbook.biz.board.impl.BoardDAO;

@Controller
public class GetBoardListController{

	@RequestMapping(value="/getBoardList.do")
	public ModelAndView getBoardList(BoardDTO dto, BoardDAO boardDAO, ModelAndView mav) {
		System.out.println("글 목록 조회");
		// 1. DB 연동
		// List<BoardDTO> boardList = boardDAO.getBoardList(dto);
		// 2. 세션 생성, 화면 이동
		mav.addObject("boardList", boardDAO.getBoardList(dto));
		mav.setViewName("getBoardList.jsp");
		return mav;
	}

}
