package old.DispatcherServlet4.spring.annotation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbook.biz.board.BoardDTO;
import com.springbook.biz.board.impl.BoardDAO;

@Controller
public class UpdateBoardController{

	@RequestMapping(value="/updateBoard.do")
	public String updateBoard(BoardDTO dto, BoardDAO boardDAO) {
		System.out.println("글 수정 처리");
		//1. 요청 정보 획득
		//2. 객체 생성, DB 연동
		boardDAO.updateBoard(dto);
		// 3. 화면 이동
		return "getBoardList.do";
	}

}
