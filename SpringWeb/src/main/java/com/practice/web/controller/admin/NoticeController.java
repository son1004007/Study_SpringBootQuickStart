package com.practice.web.controller.admin;
// 실습

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("adminNoticeController") // /customer의 NoticeController와 동일한 이름이므로 객체 이름을 지정한다.
//이름 바꾸기 컨트롤박스에서 생성된 객체의 이름을 지정한다. DI
@RequestMapping("/admin/board/notice/")
public class NoticeController {

	
	@RequestMapping("list")
	public String list() {
		return "admin.board.notice.list";
	}
	
	@RequestMapping("detail")
	public String detail() {
		return "admin.board.notice.detail";
	}
	
	@RequestMapping("reg")
	public String reg() {
		return "admin.board.notice.reg";
	}
	
}
