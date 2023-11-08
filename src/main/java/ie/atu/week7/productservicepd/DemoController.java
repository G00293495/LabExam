package ie.atu.week7.productservicepd;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @PostMapping("registerProductBody")

    @ResponseStatus(HttpStatus.CREATED)
    public Prodcut registerProduct(@RequestBody Product product){
        System.out.println("Product name: "+ product.getName());
        System.out.println("Product ID: "+ product.getId());
        System.out.println("Product quantity: "+ product.getQuantity());
        System.out.println("Product warehouseId: "+ product.getWarehouseId());
    }
}
