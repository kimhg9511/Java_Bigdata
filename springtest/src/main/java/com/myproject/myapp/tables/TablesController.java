package com.myproject.myapp.tables;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TablesController {

		@RequestMapping(value="tables")
		public ModelAndView TablesView(ModelAndView mv) throws Exception{
			
			mv.setViewName("tables/tables");
			return mv;
		}
}
