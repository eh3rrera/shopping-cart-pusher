package com.pusher.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.pusher.constants.GeneralConstants;
import com.pusher.constants.PusherConstants;
import com.pusher.model.Product;

/**
 * Controller that serves the initial page
 */
@Controller
@SessionAttributes(GeneralConstants.ID_SESSION_SHOPPING_CART)
public class IndexController {

	/**
	 * Method that sets up and serves the initial page of the app
	 * @param model Object from Spring MVC
	 * @return ModelAndView object
	 */
  @RequestMapping(method=RequestMethod.GET, value="/")
  public ModelAndView index(Model model) {
	  ModelAndView modelAndView = new ModelAndView();
		
	  modelAndView.setViewName("index");
	  modelAndView.addObject("pusher_app_key", PusherConstants.PUSHER_APP_KEY); 
	  modelAndView.addObject("pusher_channel", PusherConstants.CHANNEL_NAME); 
	
	  if(!model.containsAttribute(GeneralConstants.ID_SESSION_SHOPPING_CART)) {
	  	model.addAttribute(GeneralConstants.ID_SESSION_SHOPPING_CART, new ArrayList<Product>());
    }
       
    return modelAndView;
  }
}
