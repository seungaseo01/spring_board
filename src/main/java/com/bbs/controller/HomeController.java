package com.bbs.controller;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bbs.model.BoardDTO;
import com.bbs.model.MemberDTO;
import com.bbs.page.Criteria;
import com.bbs.page.ViewPage;
import com.bbs.service.BoardService;
import com.bbs.service.MemberService;


@Controller
public class HomeController {
	
	@Autowired
	private BoardService boardService;

// 홈
	@GetMapping("/")	
	public String home(Locale locale, Model model) {

		
		return "home";
	}
	
////////////////////////////////board등록////////////////////////////////////////////////	
	
	@GetMapping("/register")	
	public String goRegister() {
				
		return "register";
	}

	
//	레지스터에서 포스트방식으로 컨트롤러와서 홈으로 리다이렉트
//	@RequestParam("name")타입 변수명
	@PostMapping("/register")	
	public String register(BoardDTO dto){ //dto에 값이 들어감

//		실제로 등록할곳
		boardService.insert(dto);
				
		return "redirect:/"; //다돌고 나서 갈 곳(리다이렉트로 감 새로고침)
	}
	

	
///////////////////////////////boardList//////////////////////////////////////////////

//Model 속성값을 담아 뿌림 
//model.addAttribute("이름", 원하는 오브젝트); 한뒤 이동하면 값을 가지고 이동함
	@GetMapping("/boardList")	
	public String boardList(Model model , Criteria cri) {
			
		List<BoardDTO> boardList =  boardService.getListPaging(cri);
		model.addAttribute("boardList", boardList);
		
		int total = boardService.getTotal();
		ViewPage vp = new ViewPage(cri, total);		
		model.addAttribute("pageMaker", vp);
	
		return "boardList";	
	}	
/*
 * @GetMapping("/boardList") public String boardList(Model model) {
 * 
 * List<BoardDTO> boardList = boardService.list_all();
 * model.addAttribute("boardList", boardList);
 * 
 * return "boardList"; }
 */	

///////////////////////////////board삭제/////////////////////////////////////////////////	
	
	@GetMapping("/delete")	
	public String delete(@RequestParam("bno") String ubno) {
		
		Long bno = Long.parseLong(ubno);
		boardService.delete(bno);

		
		return "redirect:/boardList";
	}
	
	

	
	
///////////////////////////////boardtitleSelect/////////////////////////////////////////////////	
	
	@GetMapping("/select")	
	public String select(@RequestParam("bno") String ubno ,Model model) {
		
		Long bno = Long.parseLong(ubno);
		
		BoardDTO dto =  boardService.select(bno);
		model.addAttribute("dto", dto);
		
		return "boardSelect";
	}
	
	
///////////////////////////////boardupdate/////////////////////////////////////////////////	
	

	
	@GetMapping("/update")	
	public String updateForm(@RequestParam("bno") String ubno ,Model model) {
		
		Long bno = Long.parseLong(ubno);
		
		BoardDTO dto =  boardService.select(bno);
		model.addAttribute("dto", dto);
		
		return "boardUpdate";
	}
	
	
	@PostMapping("/update")	
	public String goupdate(BoardDTO dto) {
		
		boardService.update(dto);
		
		return "redirect:/select?bno="+dto.getBno();
	}
	
	
	
	
	
	@Autowired
	private MemberService memberService;
	
	
////////////////////////////////member등록////////////////////////////////////////////////	
	
@GetMapping("/memberInsert")	
public String memberInsertForm() {

return "/memberInsert";
}



@PostMapping("/memberInsert")	
public String memberInsert(MemberDTO dto){ //dto에 값이 들어감
System.out.println(dto);
//실제로 등록할곳
memberService.insert(dto);

return "redirect:/"; //다돌고 나서 갈 곳(리다이렉트로 감 새로고침)
}
	

///////////////////////////////member전체 검색//////////////////////////////////////////////

//Model 속성값을 담아 뿌림 
//model.addAttribute("이름", 원하는 오브젝트); 한뒤 이동하면 값을 가지고 이동함
@GetMapping("/memberList")	
public String memberList(Model model) {

List<MemberDTO> memberList =  memberService.list_all();
model.addAttribute("memberList", memberList);

return "memberList";
}	
	


///////////////////////////////titleSelect/////////////////////////////////////////////////	

@GetMapping("/memberSelect")	
public String memberSelect(@RequestParam("mno") String umno ,Model model) {

Long mno = Long.parseLong(umno);

MemberDTO dto =  memberService.select(mno);
model.addAttribute("dto", dto);

return "memberSelect";
}	




///////////////////////////////memberupdate/////////////////////////////////////////////////	



@GetMapping("/memberUpdate")	
public String memberupdateForm(@RequestParam("mno") String umno ,Model model) {

Long mno = Long.parseLong(umno);

MemberDTO dto =  memberService.select(mno);
model.addAttribute("dto", dto);

return "memberUpdate";
}


@PostMapping("/memberUpdate")	
public String gomemberUpdate(MemberDTO dto) {

memberService.update(dto);

return "redirect:/memberSelect?mno="+dto.getMno();
}




///////////////////////////////member삭제/////////////////////////////////////////////////	

@GetMapping("/memberDelete")	
public String memberDelete(@RequestParam("mno") String umno) {

Long mno = Long.parseLong(umno);
memberService.delete(mno);


return "redirect:/memberList";
}





	
}
