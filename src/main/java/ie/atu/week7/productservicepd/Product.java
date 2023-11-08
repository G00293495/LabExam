package ie.atu.week7.productservicepd;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private String name;
    private int Id;
    private int quantity;
    private int warehouseId;

}
