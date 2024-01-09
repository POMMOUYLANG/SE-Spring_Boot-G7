package gic.project.inventory_management_product_g7.Service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import gic.project.inventory_management_product_g7.DTO.UserDto;
import gic.project.inventory_management_product_g7.Model.User;

@Service
public interface UserService {
    
    // register
    User save(UserDto userDto);

    // login
    Optional<User> findByEmail(String email);

    // User checkUser(String email, String password);
}
