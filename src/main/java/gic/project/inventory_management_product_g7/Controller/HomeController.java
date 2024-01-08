package gic.project.inventory_management_product_g7.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import gic.project.inventory_management_product_g7.DTO.UserDto;
import gic.project.inventory_management_product_g7.Model.User;
import gic.project.inventory_management_product_g7.Service.UserService;


@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String getIndex() {
        return "Index";
    }

    // Admin of Login

    @GetMapping("/admin/login")
    public String getadminlogin() {
        return "admin/Login";
    }

    @PostMapping("admin/login")
    public String processLoginAdmin(@RequestParam String email, @RequestParam String password) {
        // Check credentials against the database
        Optional<User> userOptional = userService.findByEmail(email);

        if (userOptional.isPresent() && userOptional.get().getPassword().equals(password)) {
            // Successful login
            return "redirect:/admin/After_Home_Page"; // redirect to the dashboard or any other page
        } else {
            // Failed login
            return "redirect:/admin/login";
        }
    }

    // User of Login

    @GetMapping("/user/login")
    public String getuserlogin() {
        return "user/Login";
    }

    @PostMapping("user/login")
    public String processLoginUser(@RequestParam String email, @RequestParam String password) {
        // Check credentials against the database
        Optional<User> userOptional = userService.findByEmail(email);

        if (userOptional.isPresent() && userOptional.get().getPassword().equals(password)) {
            // Successful login
            return "redirect:/user/After_Home_Page"; // redirect to the dashboard or any other page
        } else {
            // Failed login
            return "redirect:/user/login";
        }
    }

    // Home Page of User

     @GetMapping("/user/Home_Page")
    public String getuserHomePage() {
        return "user/HomePage";
    }

     @GetMapping("/user/After_Home_Page")
    public String getuserAfterHomePage() {
        return "user/AfterHomePage";
    }

    // User of Register

    @GetMapping("/user/register")
    public String getuserRegisterPage(@ModelAttribute("user") UserDto userDto) {
        return "user/Register";
    }

    @PostMapping("/user/register")
    public String saveUser(@ModelAttribute("user") UserDto userDto, Model model) {
        userService.save(userDto);
        model.addAttribute("message","Registered Successfully");
        return "user/Register";
    }

    // Home Page of Admin

     @GetMapping("/admin/Home_Page")
    public String getadminHomePage() {
        return "admin/HomePage";
    }

     @GetMapping("/admin/After_Home_Page")
    public String getadminAfterHomePage() {
        return "admin/AfterHomePage";
    }

    // Admin of Register

    @GetMapping("/admin/register")
    public String getadminRegisterPage(@ModelAttribute("admin") UserDto userDto) {
        return "user/Register";
    }

    @PostMapping("/admin/register")
    public String saveAdmin(@ModelAttribute("user") UserDto userDto, Model model) {
        userService.save(userDto);
        model.addAttribute("message","Registered Successfully");
        return "user/Register";
    }
    
    
    @GetMapping("/Home_Page")
    public String getHomePage() {
        return "HomePage";
    }

    @GetMapping("/After_Home_Page")
    public String getAfterHomePage() {
        return "AfterHomePage";
    }

    @GetMapping("/register_form")
    public String getRegister() {
        return "Register";
    }

    @GetMapping("/login_form")
    public String getLogin() {
        return "Login";
    }
    
}
