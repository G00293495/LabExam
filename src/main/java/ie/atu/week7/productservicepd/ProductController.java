package ie.atu.week7.productservicepd;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    private ProductService productService;

    @Autowired
    public ProductController(ProductService ps){this.productService = ps;}

    @ResponseStatus(HttpStatus.CREATED)

    @GetMapping("registerProduct/{name}/{id}/{quantity}/{warehouseid}")
    public String getProduct(@PathVariable String name,@PathVariable String ID,@PathVariable String quantity, @PathVariable String warehouseId)

    {
        ProductService registerProduct(name, ID, quantity, warehouseId);
        return("Products");
    }
    }

