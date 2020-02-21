package com.myproject.myapp.pages.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

		@RequestMapping(value="login")
		public ModelAndView LoginView(ModelAndView mv) throws Exception{
			
			mv.setViewName("pages/login");
			return mv;
		}
}
