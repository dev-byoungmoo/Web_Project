package org.zerock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.BoardVO;
import org.zerock.service.BoardService;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/board/*")

public class BoardController {
	
	@Setter(onMethod_ = @Autowired)
	private BoardService service;
	
	@GetMapping("/list")
	public void list(Model model) {
		log.info("�ȳ��ϼ���");
		System.out.println("Get Mapping = public void list");
		model.addAttribute("list", service.getList());
	}
	
	@GetMapping("/register")
	public void register() {
		System.out.println("Get Mapping = public void register()");
	}
	
	@PostMapping("/register")
	public String register(BoardVO board , RedirectAttributes rttr) {
		System.out.println("Post Mapping = public String register()");
		service.register(board);
		rttr.addFlashAttribute("result" , board.getBno());
		return "redirect:/board/list";
	}
	
	@GetMapping("/get")
	public void get(@RequestParam("bno") Long bno , Model model) {
		log.info("/get");
		model.addAttribute("board" , service.get(bno));
	}
	
	@PostMapping("/modify")
	public String modify(BoardVO board , RedirectAttributes rttr) {
		log.info("modify = " + board);
		
		if(service.modify(board)) {
			rttr.addFlashAttribute("result" , "success");
		}
		
		return "redirect:/board/list";
	}
}
