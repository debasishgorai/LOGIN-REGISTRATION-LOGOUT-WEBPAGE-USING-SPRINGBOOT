package SpringBootApplication.controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import SpringBootApplication.entities.User;
import SpringBootApplication.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
@Controller
public class MyController {
	@Autowired
private UserService userService;
	@GetMapping("/regPage")
	public String OpenRegPage(Model model) {
		model.addAttribute("user",new User());
		return "register";
	}
	
	@PostMapping("/regForm")
	public String submitRegForm(@ModelAttribute("user")User user,Model model) {
	boolean status=	userService.registerUser(user);
	if(status) {
		model.addAttribute("SuccesMsg","User Registration succesfully");
	}
	else {
		model.addAttribute("ErrorMsg ","User Registration Unsuccesfully due to some error");
	}
		return "register";
	}
	@GetMapping("/loginPage")
	public String openLoginPage(Model model) {
		model.addAttribute("user",new User());
		return "login";
	}
	@PostMapping("/loginForm")
	public String submitLoginForm(@ModelAttribute("user")User user,Model model) {
	User validuser=	userService.loginUser(user.getEmail(), user.getPassword());
	
	if(validuser!=null) {
		model.addAttribute("modelName",validuser);
		return "profile";
	}
	else {
		model.addAttribute("ErrorMsg ","Email &Password doesnot match");
		return "login";
	}
	

	}
	@GetMapping("/logout")
	public String logoutUser(HttpServletRequest request) {
		
	HttpSession session=	request.getSession();
	if(session!=null) {
		session.invalidate();
	}
	return "login";
	}
	
	
	
	
	
	
	
	
}
