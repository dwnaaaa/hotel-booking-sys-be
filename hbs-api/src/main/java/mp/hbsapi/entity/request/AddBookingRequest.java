package mp.hbsapi.entity.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.RequiredArgsConstructor;
import mp.hbsapi.entity.BRN;

@RequiredArgsConstructor
public class AddBookingRequest {
    @JsonProperty("primary_guest_id")
    private long primaryGuestId;
    @JsonProperty("check_in_date")
    private String checkInDate;
    @JsonProperty("check_out_date")
    private String checkOutDate = null;
    @JsonProperty("room_type")
    private char roomType;
    @JsonProperty("no_of_rooms")
    private char noOfRooms;

    public BRN mapToBRN() {
        return new BRN(primaryGuestId, checkInDate, checkOutDate, roomType, noOfRooms);
    }
}
