package cn.com.hs.test.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.com.hs.test.pojo.UserT;
import cn.com.hs.test.service.IUserTService;


@Controller
@RequestMapping("/user")
public class UserTController {
	@Resource
	private IUserTService userService;
	
	@RequestMapping("/showUser")
	public String toIndex(Integer id,Model model){
		int userId = id;
		UserT user = this.userService.getUserById(userId);
		model.addAttribute("user", user);
		return "showUser";
	}
}
