package com.example.demo;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.MeetingRoom;
import com.example.demo.entity.MeetingRoomExample;
import com.example.demo.mapper.MeetingRoomMapper;
import com.example.demo.model.AccountUserDetails;
import com.example.form.SessionForm;

@Controller
@SessionAttributes(value= {"sessionTest"})
public class IndexController {

	@Autowired
	private MeetingRoomMapper meetingMapper;

	@Autowired
	HttpSession session;

//	@ModelAttribute(value = "sessionTest")
//	public SessionForm setupSessionForm() {
//		return new SessionForm(1, "AAA", "こんにちは");
//	}

	@GetMapping("/")
	public ModelAndView hello(@AuthenticationPrincipal AccountUserDetails userDetails, ModelAndView mv) {
		mv.setViewName("index");
		mv.addObject("test", "Hello");
		mv.addObject("flag1", true);
		mv.addObject("flag2", false);

		var list = getMeetingRoomList();
		mv.addObject("meetingRoomList", list);

		var sessionForm = session.getAttribute("sessionTest");
		if(sessionForm == null) {
			session.setAttribute("sessionTest", new SessionForm(1, "AAA", "こんにちは"));
		}

		return mv;
	}

	@GetMapping("/back")
	public ModelAndView back(ModelAndView mv) {
		mv.setViewName("index");
		mv.addObject("test", "Hello");
		mv.addObject("flag1", true);
		mv.addObject("flag2", false);

		var sessionForm = session.getAttribute("sessionTest");

		return mv;
	}

//	@GetMapping("/test")
//	public ModelAndView test(ModelAndView mv, @ModelAttribute("sessionTest") SessionForm sessionTest) {
//		mv.setViewName("test");
//
//		return mv;
//	}

	private List<MeetingRoom> getMeetingRoomList() {

		var conditions = new MeetingRoomExample();
		var list = meetingMapper.selectByExample(conditions);

		return list;
	}

}
