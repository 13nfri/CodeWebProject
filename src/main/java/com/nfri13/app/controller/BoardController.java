package com.nfri13.app.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nfri13.app.domain.BoardVO;
import com.nfri13.app.service.BoardService;

@Controller
public class BoardController {
	//게시판은 하나의 콘트롤러로 전부 묶어버린다.
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Inject
	private BoardService service;
	
	@RequestMapping("/board/register")
	public void registerGET(){
		//return "/board/register";
		//get방식일때는, 요청과 파일명이 같다면 생략이 가능하다.
	}
	
	@RequestMapping(value="/board/register",method=RequestMethod.POST)
	public String registerPOST(BoardVO board, RedirectAttributes rttr) throws Exception{
		logger.info("registerPOST : " + board.toString());
		
		service.register(board);
		//model.addAttribute("msg", "SUCCESS");
		rttr.addFlashAttribute("msg", "SUCCESS"); //세션에저장 새로고침시 사라짐
		return "redirect:/board/listAll";
		//redirect를 사용해야 db에있는 리스트를 가져올 수 있다.
		//redirect로 listall에게 전달
	}
	
	@RequestMapping("/board/listAll")
	public void listAll(Model model) throws Exception{
		//model.addAttribute("msg", "SUCCESS");
		model.addAttribute("list", service.listAll());
	}
	
	@RequestMapping("/board/read")
	public void read(int bno, Model model) throws Exception{
		model.addAttribute("boardVO", service.read(bno));
	}
	
	@RequestMapping("/board/update")
	public void modify() throws Exception{
		
	}
}
