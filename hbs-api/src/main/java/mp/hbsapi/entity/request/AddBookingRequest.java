package mp.hbsapi.entity.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import mp.hbsapi.entity.BRN;


@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
public class AddBookingRequest {
    @JsonProperty("primary_guest_id")
    private String primaryGuestId;
    @JsonProperty("booking_date")
    private String bookingDate;
    @JsonProperty("check_in_date")
    private String checkInDate;
    @JsonProperty("check_out_date")
    private String checkOutDate = null;
    @JsonProperty("room_type")
    private char roomType;
    @JsonProperty("no_of_rooms")
    private char noOfRooms;
    @JsonProperty("is_checked_in")
    private int isCheckedIn;
}
