package gic.project.inventory_management_product_g7.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import gic.project.inventory_management_product_g7.Model.Product;

@Service
public interface ProductService {
    
    // List<ProductDto> findAll();
    // Product save(ProductDto productDto);
    // Product update(ProductDto productDto);
    // void deleteById(Long id);
    // void enableById(Long id);

    List<Product> getAllProduct();

    Product getProductById(Long id);

    void saveOrUpdateProduct(Product product);

    void deleteProduct(Long id);
}
