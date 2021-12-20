package DispatcherServlet;


	
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.ModelMap;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.servlet.ModelAndView;


		@Controller
		public class SIController {
		    @RequestMapping(value = "/si", method = RequestMethod.GET)
		      public ModelAndView siload() {
		        return new ModelAndView("sf", "command", new SI());
		       }
		    @RequestMapping(value = "/si", method = RequestMethod.POST)
		      public ModelAndView si(@ModelAttribute("SpringWeb")SI s, ModelMap model) {
		         
		         float s1 = (s.getP()*s.getR()*s.getT())/100;
		         return new ModelAndView("si","res",s1);
		       }
		}


