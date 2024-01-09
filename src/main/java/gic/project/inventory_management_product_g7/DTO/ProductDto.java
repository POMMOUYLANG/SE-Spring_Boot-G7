package gic.project.inventory_management_product_g7.DTO;

public class ProductDto {
    
    private Long id;
    private String product_code;
    private String product_image;
    private String product_name;
    private String country;
    private Double price;
    private Double cost;
    private String Description;
    private Integer quantity_order;
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
    public ProductDto(String product_code, String product_image, String product_name, String country, Double price,
            Double cost, String description, Integer quantity_order, Integer quantity_available) {
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
    public ProductDto(String product_code, String product_image, String product_name, String country, Double price,
            Integer quantity_order, Integer quantity_available) {
        this.product_code = product_code;
        this.product_image = product_image;
        this.product_name = product_name;
        this.country = country;
        this.price = price;
        this.quantity_order = quantity_order;
        this.quantity_available = quantity_available;
    }
    public ProductDto(String product_code, String product_image, String product_name, String country, Double price,
            Double cost) {
        this.product_code = product_code;
        this.product_image = product_image;
        this.product_name = product_name;
        this.country = country;
        this.price = price;
        this.cost = cost;
    }
    public ProductDto() {
    }

    

    
    
}
