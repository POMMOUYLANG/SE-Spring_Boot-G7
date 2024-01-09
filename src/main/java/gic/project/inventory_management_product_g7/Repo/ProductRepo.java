package gic.project.inventory_management_product_g7.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gic.project.inventory_management_product_g7.Model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long>{

    
}
