package gic.project.inventory_management_product_g7.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HomeController {
    @GetMapping("/")
    public String getMethodName() {
        return "Welcome";
    }
    
}
