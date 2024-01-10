package gic.project.inventory_management_product_g7.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import gic.project.inventory_management_product_g7.Model.Product;
import gic.project.inventory_management_product_g7.Service.ProductService;


@Controller
public class Productontroller {   
    
    @Autowired
    private ProductService productService;

    @GetMapping("/admin/viewadmin")
    public String getviewproduct() {
        return "product/Viewadmin";
    }

    @GetMapping("/user/viewuser")
    public String getviewuser() {
        return "user/Viewuser";
    }
    
    @GetMapping("/user/viewusernon")
    public String getviewusernon() {
        return "user/Viewuser_non";
    }
    

    @GetMapping("/user/item_detail")
    public String getitemdetail() {
        return "user/Item_detail";
    }



    @GetMapping("/product/listproduct")
    public String listProduct(Model model) {
        List<Product> products = productService.getAllProduct();
        model.addAttribute("products", products);
        return "product/Product";
    }

    @GetMapping("/product/addproduct")
    public String addProductForm(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);
        return "product/Addproduct";
    }

    @PostMapping("/product/saveProduct")
    public String saveProduct(@ModelAttribute("product") Product product) {
        productService.saveOrUpdateProduct(product);
        return "redirect:/product/listproduct";
    }

    @GetMapping("/product/updateproduct/{id}")
    public String updateProductForm(@PathVariable Long id, Model model) {
        Product product = productService.getProductById(id);
        model.addAttribute("product", product);
        // return "product/UpdateProductForm";
        return "product/Updateproduct";
    }

    @GetMapping("/product/deleteproduct/{id}")
    public String deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return "redirect:/product/listproduct";
    }


























//     // list Product

//     @GetMapping("/product/listproduct")
//     public String listProduct(Model model) {
//         List<Product> products = productService.getAllProduct();
//         model.addAttribute("products", products);
//         return "product/Product";
//     }

//     // Add product

//     @GetMapping("/product/addproduct")
//     public String AddProduct(Model model) {
//         Product product = new Product();
//         model.addAttribute("product", product);
//         return "product/Addproduct";
//     }

//     // Save Product

//     @PostMapping("/product/saveProduct")
//     public String saveProduct(@ModelAttribute("product") Product product) {
//         productService.saveOrUpdateProduct(product);
//         return "redirect:/product/listproduct";
//     }

//     // Update Product

//     @GetMapping("/product/updateproduct")
//     public String UpdateProduct(@RequestParam("id") Long id, Model model) {
//         Product product = productService.getProductById(id);
//         model.addAttribute("product", product);
//         return "product/Updateproduct";
//     }

//     // Delete Product

//     // @DeleteMapping("/product/deleteproduct")
//     // public String deleteProduct(@RequestParam("id") Long id) {
//     //     productService.deleteProduct(id);
//     //     return "redirect:/product/listproduct";
//     // }

//     @GetMapping("/product/deleteproduct/{id}")
//         public String deleteProduct(@PathVariable Long id) {
//         productService.deleteProduct(id);
//         return "redirect:/product/listproduct";
// }
















    
    // @GetMapping("/admin/product")
    // public String adminproduct(Model model, Principal principal) {
    //     // if(principal == null){
    //     //     return "redirect:/admin/login";
    //     // }
    //     List<ProductDto> productDtosList = productService.findAll();
    //     model.addAttribute("title", "Manage Product");
    //     model.addAttribute("products", productDtosList);
    //     model.addAttribute("size", productDtosList.size());
    //     return "Product";
    // }
    
    // @GetMapping("/admin/addproduct")
    // public String getaddproduct(Model model) {
    //     model.addAttribute("product", new ProductDto());
    //     return "Addproduct";
    // }
}
