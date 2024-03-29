package mp.hbsapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity(name = "PRODUCTS")
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product {
    @Id
    private String productId;
    private String productName;
    private int price;
}
