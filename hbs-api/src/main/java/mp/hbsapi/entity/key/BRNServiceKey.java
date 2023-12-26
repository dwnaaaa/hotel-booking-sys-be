package mp.hbsapi.entity.key;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BRNServiceKey implements Serializable {
    private long brn;
    private int serviceCode;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BRNServiceKey that = (BRNServiceKey) obj;
        return Objects.equals(brn, that.brn) && Objects.equals(serviceCode, that.serviceCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brn, serviceCode);
    }
}
