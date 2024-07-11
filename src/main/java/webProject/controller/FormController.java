package webProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FormController {
	@ResponseBody
	@RequestMapping("/test")
	public String test() {
		
		return "Working";
	}
	
	@RequestMapping("/")  
    public String display()  
    {  
        return "index";  
    }  
	
}
