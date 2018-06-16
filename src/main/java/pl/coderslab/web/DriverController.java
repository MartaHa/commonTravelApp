package pl.coderslab.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.entity.User;
import pl.coderslab.repositories.UserRepository;
import pl.coderslab.services.UserService;

import javax.validation.Valid;
@RequestMapping("/driver")
@Controller
public class DriverController {

    private final UserRepository userRepository;
    private final UserService userService;

    public DriverController(UserRepository userRepository, UserService userService) {
        this.userRepository = userRepository;
        this.userService = userService;
    }
    @GetMapping("/add")
    public String showFormUser(Model model) {
        model.addAttribute("users", new User());
        return "driver/addDriver";
    }

    @PostMapping("/add")

    public String perform(@ModelAttribute @Valid User user, String role, BindingResult result) {
        if (result.hasErrors()) {
            return "addDriver";
        }
        userService.saveUser(user, "ROLE_DRIVER");
        return "redirect:/login";

    }
 ////redirectDriver


    @GetMapping("/driverRedirect")
    public String redirectDriver() {
        return "listRides";

    }

}
