package mp.hbsapi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity(name = "BRN")
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@NamedStoredProcedureQuery(name = "BRN.addBooking", procedureName = "ADD_BOOKING", parameters =  {
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "in_primary_guest_id", type = String.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "in_booking_date", type = String.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "in_check_in_date", type = String.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "in_check_out_date", type = String.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "in_room_type", type = Character.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "in_no_of_rooms", type = Integer.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "in_is_checked_in", type = Integer.class),
})
public class BRN {
    @Id
    private String brn;
    private String primaryGuestId;
    private Date bookingDate;
    private Date checkInDate;
    private Date checkOutDate = null;
    private char roomType;
    private int noOfRooms;
    private int isCheckedIn;
}
