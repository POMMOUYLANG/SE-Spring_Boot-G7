package gic.project.inventory_management_product_g7.Repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import gic.project.inventory_management_product_g7.Model.User;

@Repository
public interface UserRepo extends CrudRepository<User, Long>{
    
    Optional<User> findByEmail(String email); // login user or admin
    
}
