package com.estsoft.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.estsoft.domain.Board;
import com.estsoft.repository.BoardRepository;

@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	private BoardRepository boardRepository;
	
	// �Խñ� ���
	@GetMapping("/tables")
	public String test() {
		return "/board/tables";
	}
	
	// �Խñ� ���
	@GetMapping("/list")
	public String list() {
		return "/board/list";
	}
	
	/*
	 * @PostMapping("/getList")
	 * 
	 * @ResponseBody public Page<Board> list(@PageableDefault(sort = {"id"},
	 * direction = Direction.DESC, size = 10) Pageable pageable) {
	 * System.out.println("�ǳ�"); return boardRepository.findAll(pageable); }
	 */
	
	  @PostMapping("/getList")
	  @ResponseBody 
	  public DataTablesOutput<Board> list(@Valid DataTablesInput input) {
		  System.out.println("�ǳ�"); 
		  System.out.println(boardRepository.findAll(input));
		  return boardRepository.findAll(input); 
	  }
	 
	
}
