package com.springboot.dashboard.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    
	             
	@RequestMapping(value="/",method = RequestMethod.GET)  
	public ModelAndView getIndexPage() {
		System.out.println("\n\n\n====================================cccc");
		ModelAndView mav = new ModelAndView("index");
		System.out.println("\n\n\n====================================bbb");
		return mav;
	}
	@RequestMapping(value="/calendarpage",method = RequestMethod.GET)
	  public ModelAndView getLinkPage() {
			ModelAndView mav = new ModelAndView("calendar");
			return mav;
	    }
	       
	 
	@RequestMapping(value="/photogallery",method = RequestMethod.GET)
	  public ModelAndView getPhotogallery() { 
			ModelAndView mav = new ModelAndView("photogallery");
			return mav;
	    }
	 
	@RequestMapping(value="/labelsAdvanced",method = RequestMethod.GET)
	  public ModelAndView getLabelsAdvanced() {
			ModelAndView mav = new ModelAndView("advanced");
			return mav;
	    }
	
	@RequestMapping(value="/labelsEditors",method = RequestMethod.GET)
	  public ModelAndView getEditors() {
			ModelAndView mav = new ModelAndView("editors");
			return mav;
	    } 
	 
	@RequestMapping(value="/labelsGeneral",method = RequestMethod.GET)
	  public ModelAndView getGeneral() {
			ModelAndView mav = new ModelAndView("general");
			return mav;
	    }
	 
	
	@RequestMapping(value="/getSimpleTable",method = RequestMethod.GET)
	  public ModelAndView getSimpleTable() {
			ModelAndView mav = new ModelAndView("simple");
			return mav;
	    }
	
	@RequestMapping(value="/getDataTable",method = RequestMethod.GET)
	  public ModelAndView getDataTable() {
			ModelAndView mav = new ModelAndView("data");
			return mav;
	    }
	
	@RequestMapping(value="/getChartJs",method = RequestMethod.GET)
	  public ModelAndView getChartJs() {
			ModelAndView mav = new ModelAndView("chartjs");
			return mav;
	    }
	//==================================================
	
	
	@RequestMapping(value="/get404",method = RequestMethod.GET)
	  public ModelAndView get404Error() {
			ModelAndView mav = new ModelAndView("404");
			return mav;
	    }
	
	@RequestMapping(value="/get500",method = RequestMethod.GET)
	  public ModelAndView get500Error() {
			ModelAndView mav = new ModelAndView("500");
			return mav;
	    }
	
	@RequestMapping(value="/getBlank",method = RequestMethod.GET)
	  public ModelAndView getBlank() {
			ModelAndView mav = new ModelAndView("blank");
			return mav;
	    }
	
	@RequestMapping(value="/getInvoiceprint",method = RequestMethod.GET)
	  public ModelAndView getInvoice_print() {
			ModelAndView mav = new ModelAndView("invoice-print");
			return mav;
	    }
	
	
	@RequestMapping(value="/getInvoice",method = RequestMethod.GET)
	  public ModelAndView getInvoice() {
			ModelAndView mav = new ModelAndView("invoice");
			return mav;
	    }
	 
	@RequestMapping(value="/getLockscreen",method = RequestMethod.GET)
	  public ModelAndView getLockscreen() {
			ModelAndView mav = new ModelAndView("lockscreen");
			return mav;
	    }
	  
	@RequestMapping(value="/getLogin",method = RequestMethod.GET)
	  public ModelAndView getLogin() {
			ModelAndView mav = new ModelAndView("login");
			return mav;
	    }
	
	@RequestMapping(value="/getPace",method = RequestMethod.GET)
	  public ModelAndView getPace() {
			ModelAndView mav = new ModelAndView("pace");
			return mav;
	    }
	
	@RequestMapping(value="/getProfile",method = RequestMethod.GET)
	  public ModelAndView getProfile() {
			ModelAndView mav = new ModelAndView("profile");
			return mav;
	    } 
	  
	@RequestMapping(value="/getRegister",method = RequestMethod.GET)
	  public ModelAndView getRegister() {
			ModelAndView mav = new ModelAndView("register");
			return mav;
	    }
	 
	
	//================================================
	
	@RequestMapping(value="/getCompose",method = RequestMethod.GET)
	  public ModelAndView getCompose() {
			ModelAndView mav = new ModelAndView("compose");
			return mav;
	    }
	
	@RequestMapping(value="/getMailbox",method = RequestMethod.GET)
	  public ModelAndView getMailbox() {
			ModelAndView mav = new ModelAndView("mailbox");
			return mav;
	    }
	
	
	@RequestMapping(value="/getReadmail",method = RequestMethod.GET)
	  public ModelAndView getReadmail() {
			ModelAndView mav = new ModelAndView("read-mail");
			return mav;
	    }
	/*@RequestMapping(value="/employeeHomePage",method = RequestMethod.GET)
	  public ModelAndView getHomePage() {
			ModelAndView mav = new ModelAndView("employee");
			return mav;
	    }
	  
	  @RequestMapping(value="/formPage",method = RequestMethod.GET)
	  public ModelAndView getformPage() {
			ModelAndView mav = new ModelAndView("formpage");
			return mav;
	    }
	  
	  @RequestMapping(value="/linkPage",method = RequestMethod.GET)
	  public ModelAndView getLinkPage() {
			ModelAndView mav = new ModelAndView("link");
			return mav;
	    }*/
	  
	  
	  

}
