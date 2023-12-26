package mp.hbsapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity(name = "BED_TYPE")
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BedType {
    @Id
    private char bedType;
    private String bedTypeName;
}
