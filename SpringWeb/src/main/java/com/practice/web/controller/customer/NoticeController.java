package com.practice.web.controller.customer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//실습 관리자 페이지 추가
// admin/board/notice/list,detail,edit,reg,del 에 추가한다. 화면은 static/admin/board/event/notice에 있다.
//@RestController는 return 문자열을 그대로 출력한다.
@Controller // jsp 와 같은 view를 지정해서 출력한다. // RestController와 Controller의 차이점

@RequestMapping("/customer/notice/")
public class NoticeController {
	
	
	// 도메인 맨 끝은 행위를 의미한다. 목록은 list, 자세한 페이지 detail, edit 수정 , reg 등록
	// 공지(notice) 라는 도메인으로 컨트롤러를 만들어서 행위(list, detail, edit, reg)를 매핑한다.
	// 패키지명/도메인/기능 으로 작성규칙을 한다.
	// 회사에 가서 회사의 규칙에 따라라.
//	@RequestMapping("/customer/notice/list")
	// RequestMapping의 주소가 길어지므로 public class 위에 공통된 위치를 선언한다.
	
	@RequestMapping("list") 
	public String list(Model model) { // Spring MVC Library가 호출해줌.
		
		model.addAttribute("test", "Hello~DevTools!!"); // model.addAttribute 함수로 test를 호출하면 Hello를 반환한다.
//		Model 은 데이터를 의미한다.
		
//		return "/customer/notice/list.jsp"; RequestMapper와 동일한경로이면, 생략해도 된다.
//		return "customer/notice/list"; // ResourceViewResolver 
		return "customer.notice.list"; // TilesViewResolver
		// 사용자가 controller를 거치지 않고 view를 접근 할 수 있게됨
		// 사용자가 jsp에 직접적인 접근을 막고자 /webapp/WEB-INF 라는 약속된 폴더를 생성한다.
		
		
		// String list(Model model) : Model / list.jsp : View / NoticeController : Controller
	}
	
	
	
	
	//	Controller는 URL을 매핑하는 역할 
	@RequestMapping("detail")	// list, detail, edit, reg, del
	public String detail() {
		return "customer.notice.detail";
	}

	
}
