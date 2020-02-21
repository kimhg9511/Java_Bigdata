package com.myproject.myapp.pages.forgotPassword;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ForgotPasswordController {

		@RequestMapping(value="forgotpassword")
		public ModelAndView ForgotPasswordView(ModelAndView mv) throws Exception{
			
			mv.setViewName("pages/forgotpassword");
			return mv;
		}
}
