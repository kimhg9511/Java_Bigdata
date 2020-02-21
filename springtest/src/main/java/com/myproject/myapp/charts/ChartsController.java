package com.myproject.myapp.charts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ChartsController {

		@RequestMapping(value="charts")
		public ModelAndView ChartsView(ModelAndView mv) throws Exception{
			
			mv.setViewName("charts/charts");
			return mv;
		}
}
