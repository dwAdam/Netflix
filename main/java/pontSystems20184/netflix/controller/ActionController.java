package pontSystems20184.netflix.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ActionController {
	
	@GetMapping("Action")
	public String getView(HttpServletRequest request) {
		HttpSession session = request.getSession();
		if (session.getAttribute("name") == null || session.getAttribute("name") == "") {
				return "redirect:/Welcome";
		}
		return "Action";
	}
	
	@PostMapping("")
	public String postView() {
		
		
		
		return "";
	}
}
