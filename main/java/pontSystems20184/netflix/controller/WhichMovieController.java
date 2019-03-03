package pontSystems20184.netflix.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WhichMovieController {
	
	@GetMapping("WhichMovie")
	public String getView(HttpServletRequest request) {
		HttpSession session = request.getSession();
		if (session.getAttribute("name") == null || session.getAttribute("name") == "") {
			return "redirect:/Welcome";
		}
		return "WhichMovie";
	}
	
	@PostMapping("PostWhichMovie")
	public String postView(@RequestParam String action)  {
		if (action.equals("action")) {
			return "redirect:/Action";
		} else if (action.equals("adventure")) {
			return "redirect:/Adventure";
		} else if (action.equals("animation")) {
			return "redirect:/Animation";
		} else if (action.equals("comedy")) {
			return "redirect:/Comedy";
		} else if (action.equals("documentary")) {
			return "redirect:/Documentary";
		} else if (action.equals("drama")) {
			return "redirect:/Drama";
		} else if (action.equals("family")) {
			return "redirect:/Family";
		} else if (action.equals("fantasy")) {
			return "redirect:/Fantasy";
		} else if (action.equals("horror")) {
			return "redirect:/Horror";
		} else if (action.equals("marvel")) {
			return "redirect:/Marvel";
		} else if (action.equals("romantic")) {
			return "redirect:/Romantic";
		} else if (action.equals("scienceFiction")) {
			return "redirect:/ScienceFiction";
		} else if (action.equals("thriller")) {
			return "redirect:/Thriller";
		}
		
		return null;
	}

}
