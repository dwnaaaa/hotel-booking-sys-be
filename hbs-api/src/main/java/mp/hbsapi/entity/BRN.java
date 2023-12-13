package mp.hbsapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Entity(name = "BRN")
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BRN {
    @Id
//    @GeneratedValue(generator = "brn_seq")
//    @SequenceGenerator(name = "brn_seq", sequenceName = "BRN_SEQ", allocationSize = 1)
    private long brnId;
    private long primaryGuestId;
    private String checkInDate;
    private String checkOutDate;
    private char roomType;
    private int numberOfRooms;
}
