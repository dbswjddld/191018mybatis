package com.company.app.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.app.board.BoardVO;
import com.company.app.board.service.BoardService;

@Controller
public class BoardController {

	@Autowired BoardService boardService;
	
	// 단건조회
	@RequestMapping("/getBoard")
	public String getBoard(BoardVO vo, Model model) {
		model.addAttribute("board", boardService.getBoard(vo));
		return "board/getBoard"; // 넘겨줄 jsp페이지 src/main/webapp/WEB-INF/views/board/getBoard.jsp
	}
}
