package pontSystems20184.netflix.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WelcomeController {
	
	@GetMapping("Welcome")
	public String getView() {
		
		
		return "Welcome";
	}
	
	@PostMapping("Welcome")
	public String postView(HttpServletRequest request) {
		String str = request.getParameter("name");
		HttpSession session = request.getSession();
		session.setAttribute("name", str);
		
		return "redirect:/WhichMovie";
	}
}
