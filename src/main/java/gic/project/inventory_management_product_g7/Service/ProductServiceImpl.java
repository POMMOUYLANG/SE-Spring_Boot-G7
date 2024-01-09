package gic.project.inventory_management_product_g7.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gic.project.inventory_management_product_g7.Model.Product;
import gic.project.inventory_management_product_g7.Repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepo productRepo;

    @Override
    public List<Product> getAllProduct() {
        return productRepo.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return productRepo.findById(id).orElse(null);
    }

    @Override
    public void saveOrUpdateProduct(Product product) {
        productRepo.save(product);
    }

    @Override
    public void deleteProduct(Long id) {
        productRepo.deleteById(id);
    }

    

    // @Override
    // public List<ProductDto> findAll() {
    //     List<ProductDto> productDtosList = new ArrayList<>();
    //     List<Product> products = productRepo.findAll();
    //     for(Product product : products){
    //         ProductDto productDto = new ProductDto();
    //         productDto.setId(product.getId());
    //         productDto.setProduct_code(product.getProduct_code());      
    //         productDto.setProduct_image(product.getProduct_image());
    //         productDto.setProduct_name(product.getProduct_name());
    //         productDto.setCountry(product.getCountry());
    //         productDto.setPrice(product.getPrice());
    //         productDto.setCost(product.getCost()); 
    //         productDto.setDescription(product.getDescription());
    //         productDto.setQuantity_order(product.getQuantity_order());
    //         productDto.setQuantity_available(product.getQuantity_available()); 
    //     }
        
    //     return productDtosList;
    // }

    
    
}
