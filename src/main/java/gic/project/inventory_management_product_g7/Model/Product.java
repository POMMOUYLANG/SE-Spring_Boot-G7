// package gic.project.inventory_management_product_g7.Model;

// import jakarta.persistence.Column;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.Table;

// @Entity
// @Table(name="product")
// public class Product {
    
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;

//     @Column
//     private String product_code;

//     @Column
//     private String product_image;

//     @Column
//     private String product_name;    

//     @Column
//     private String country;

//     @Column
//     private Double price;

//     @Column
//     private Double cost;

//     @Column
//     private String Description;

//     @Column
//     private Integer quantity_order;

//     @Column
//     private Integer quantity_available;

//     public Long getId() {
//         return id;
//     }

//     public void setId(Long id) {
//         this.id = id;
//     }

//     public String getProduct_code() {
//         return product_code;
//     }

//     public void setProduct_code(String product_code) {
//         this.product_code = product_code;
//     }

//     public String getProduct_image() {
//         return product_image;
//     }

//     public void setProduct_image(String product_image) {
//         this.product_image = product_image;
//     }

//     public String getProduct_name() {
//         return product_name;
//     }

//     public void setProduct_name(String product_name) {
//         this.product_name = product_name;
//     }

//     public String getCountry() {
//         return country;
//     }

//     public void setCountry(String country) {
//         this.country = country;
//     }

//     public Double getPrice() {
//         return price;
//     }

//     public void setPrice(Double price) {
//         this.price = price;
//     }

//     public Double getCost() {
//         return cost;
//     }

//     public void setCost(Double cost) {
//         this.cost = cost;
//     }

//     public String getDescription() {
//         return Description;
//     }

//     public void setDescription(String description) {
//         Description = description;
//     }

//     public Integer getQuantity_order() {
//         return quantity_order;
//     }

//     public void setQuantity_order(Integer quantity_order) {
//         this.quantity_order = quantity_order;
//     }

//     public Integer getQuantity_available() {
//         return quantity_available;
//     }

//     public void setQuantity_available(Integer quantity_available) {
//         this.quantity_available = quantity_available;
//     }

//     public Product(String product_code, String product_image, String product_name, String country, Double price,
//             Double cost, String description, Integer quantity_order, Integer quantity_available) {
//         this.product_code = product_code;
//         this.product_image = product_image;
//         this.product_name = product_name;
//         this.country = country;
//         this.price = price;
//         this.cost = cost;
//         Description = description;
//         this.quantity_order = quantity_order;
//         this.quantity_available = quantity_available;
//     }

//     public Product(String product_code, String product_image, String product_name, String country, Double price,
//             Integer quantity_order, Integer quantity_available) {
//         this.product_code = product_code;
//         this.product_image = product_image;
//         this.product_name = product_name;
//         this.country = country;
//         this.price = price;
//         this.quantity_order = quantity_order;
//         this.quantity_available = quantity_available;
//     }

//     public Product(String product_code, String product_image, String product_name, String country, Double price,
//             Double cost) {
//         this.product_code = product_code;
//         this.product_image = product_image;
//         this.product_name = product_name;
//         this.country = country;
//         this.price = price;
//         this.cost = cost;
//     }

//     public Product() {
//     }

//     @Override
//     public String toString() {
//         return "Product [id=" + id + ", product_code=" + product_code + ", product_image=" + product_image
//                 + ", product_name=" + product_name + ", country=" + country + ", price=" + price + ", cost=" + cost
//                 + ", Description=" + Description + ", quantity_order=" + quantity_order + ", quantity_available="
//                 + quantity_available + "]";
//     }

    

    
    
// }
package gic.project.inventory_management_product_g7.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_code")
    private String product_code;

    @Column(name = "product_image")
    private String product_image;

    @Column(name = "product_name")
    private String product_name;

    @Column(name = "country")
    private String country;

    @Column(name = "price")
    private Double price;

    @Column(name = "cost")
    private Double cost;

    @Column(name = "Description")
    private String Description;

    @Column(name = "quantity_order")
    private Integer quantity_order;

    @Column(name = "quantity_available")
    private Integer quantity_available;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProduct_code() {
        return product_code;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }

    public String getProduct_image() {
        return product_image;
    }

    public void setProduct_image(String product_image) {
        this.product_image = product_image;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Integer getQuantity_order() {
        return quantity_order;
    }

    public void setQuantity_order(Integer quantity_order) {
        this.quantity_order = quantity_order;
    }

    public Integer getQuantity_available() {
        return quantity_available;
    }

    public void setQuantity_available(Integer quantity_available) {
        this.quantity_available = quantity_available;
    }

    public Product(Long id, String product_code, String product_image, String product_name, String country,
            Double price, Double cost, String description, Integer quantity_order, Integer quantity_available) {
        this.id = id;
        this.product_code = product_code;
        this.product_image = product_image;
        this.product_name = product_name;
        this.country = country;
        this.price = price;
        this.cost = cost;
        Description = description;
        this.quantity_order = quantity_order;
        this.quantity_available = quantity_available;
    }

    public Product() {

    }

    // @Override
    // public String toString() {
    // return "Product [id=" + id + ", product_code=" + product_code + ",
    // product_image=" + product_image
    // + ", product_name=" + product_name + ", country=" + country + ", price=" +
    // price + ", cost=" + cost
    // + ", Description=" + Description + ", quantity_order=" + quantity_order + ",
    // quantity_available="
    // + quantity_available + "]";
    // }

}
