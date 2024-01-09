package gic.project.inventory_management_product_g7.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gic.project.inventory_management_product_g7.DTO.UserDto;
import gic.project.inventory_management_product_g7.Model.User;
import gic.project.inventory_management_product_g7.Repo.UserRepo;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepo userRepo;

    // register
    @Override
    public User save(UserDto userDto) {
        final User user = new User(userDto.getUsername(), userDto.getEmail(), userDto.getPassword(),userDto.getRole());
        return userRepo.save(user);
    }

    // login
    @Override
    public Optional<User> findByEmail(String email) {
        return userRepo.findByEmail(email);
    }

    // @Override
    // public User checkUser(String email, String password) {
    //     User user = userRepo.findByEmail(email);

    //   if (user != null && user.getPassword().equals(password)) {
    //       return user;
    //   }

    //   return null;
    // }

    
    
}
