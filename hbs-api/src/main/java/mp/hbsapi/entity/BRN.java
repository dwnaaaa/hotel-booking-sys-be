package mp.hbsapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
    private Date checkInDate;
    private Date checkOutDate;
    private char roomType;
    private int noOfRooms;

    public BRN(long primaryGuestId, String checkInDate, String checkOutDate, char roomType, int noOfRooms) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        this.primaryGuestId = primaryGuestId;
        this.roomType = roomType;
        this.noOfRooms = noOfRooms;
        // Parse string to date
        try {
            this.checkInDate = dateFormat.parse(checkInDate);
            if(checkOutDate != null) {
                this.checkOutDate = dateFormat.parse(checkOutDate);
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
