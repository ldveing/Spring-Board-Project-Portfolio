package old.DispatcherServlet4.spring.annotation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springbook.biz.board.BoardDTO;
import com.springbook.biz.board.impl.BoardDAO;

@Controller
public class BoardController {
	@RequestMapping(value="/insertBoard.do")
	public String insertMethod(BoardDTO dto, BoardDAO boardDAO) {
		System.out.println("글 등록 처리");
		boardDAO.insertBoard(dto);
		return "getBoardList.jsp";
	}
	
	@RequestMapping(value="/updateBoard.do")
	public String updateBoard(BoardDTO dto, BoardDAO boardDAO) {
		System.out.println("글 수정 처리");
		boardDAO.updateBoard(dto);
		return "getBoardList.do";
	}
	
	@RequestMapping(value="/deleteBoard.do")
	public String deleteBoard(BoardDTO dto, BoardDAO boardDAO){
		System.out.println("글 삭제 처리");
		boardDAO.deleteBoard(dto);
		return "getBoardList.do";
	}
	
	@RequestMapping(value="/getBoard.do")
	public ModelAndView getBoard(BoardDTO dto, BoardDAO boardDAO, ModelAndView mav){
		System.out.println("글 상세 보기");
		mav.addObject("board", boardDAO.getBoard(dto));
		mav.setViewName("getBoard.jsp");
		return mav;
	}
	
	@RequestMapping(value="/getBoardList.do")
	public ModelAndView getBoardList(BoardDTO dto, BoardDAO boardDAO, ModelAndView mav) {
		System.out.println("글 목록 조회");
		mav.addObject("boardList", boardDAO.getBoardList(dto));
		mav.setViewName("getBoardList.jsp");
		return mav;
	}
}
