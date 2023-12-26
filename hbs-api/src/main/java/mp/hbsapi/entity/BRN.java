package mp.hbsapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity(name = "BRN")
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BRN {
    @Id
//    @GeneratedValue(generator = "brn_seq")
//    @SequenceGenerator(name = "brn_seq", sequenceName = "BRN_SEQ", allocationSize = 1)
    private long brn;
    private long primaryGuestId;
    private String checkInDate;
    private String checkOutDate;
    private char roomType;
    private int noOfRooms;

    public BRN(long primaryGuestId, String checkInDate, String checkOutDate, char roomType, int noOfRooms) {
        this.primaryGuestId = primaryGuestId;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.roomType = roomType;
        this.noOfRooms = noOfRooms;
    }
}
