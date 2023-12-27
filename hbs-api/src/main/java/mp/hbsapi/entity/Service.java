package mp.hbsapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity(name = "SERVICES")
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Service {
    @Id
    private int serviceCode;
    private String serviceName;
    private String description;
    private char employeeType;
    private String productId;
    private int price;
}
