package old.DispatcherServlet4.spring.annotation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbook.biz.board.BoardDTO;
import com.springbook.biz.board.impl.BoardDAO;

@Controller
public class DeleteBoardController{

	@RequestMapping(value="/deleteBoard.do")
	public String deleteBoard(BoardDTO dto, BoardDAO boardDAO){
		System.out.println("글 삭제 처리");
		//1. 요청 정보 획득
		//2. 객체 생성, DB 연동
		boardDAO.deleteBoard(dto);
		//3. 화면 이동
		return "getBoardList.do";
	}

}
