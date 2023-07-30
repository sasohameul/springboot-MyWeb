package com.coding404.myweb.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.coding404.myweb.board.service.BoardService;
import com.coding404.myweb.command.BoardVO;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	@Qualifier("boardService")
	BoardService boardService;
	
	@GetMapping("/topicListAll")
	public String boardList(Model model) {
		
		String id = "admin";
		ArrayList<BoardVO> list = boardService.getList(id);
		model.addAttribute("list", list);
		
		return "board/topicListAll";
	}
	
	@GetMapping("/topicDetail")
	public String boardDetail(Model model, 
							 @RequestParam("board_num") int board_num) {
		
		BoardVO vo = boardService.getDetail(board_num);
		model.addAttribute("vo", vo);
		System.out.println(vo.toString());
		
		return "board/topicDetail";
	}
	
	@GetMapping("/topicReg")
	public String boardReg() {
		
		return "board/topicReg";
	}
	
	@PostMapping("/regiForm")
	public String regiForm(BoardVO vo, RedirectAttributes ra) {
		
		int result= boardService.boardRegist(vo);
		//System.out.println(vo.toString());
		String msg = result == 1 ? "작성하신 글이 등록되었습니다." : "등록 실패";
		ra.addFlashAttribute("msg", msg);
		
		return "redirect:/board/topicListAll";
	}
	
	
	
	@GetMapping("/topicModify")
	public String boardModify() {
		
		return "board/topicModify";
	}
	
	@GetMapping("/topicListMe")
	public String boardListMe() {
		
		return "board/topicListMe";
	}

}
