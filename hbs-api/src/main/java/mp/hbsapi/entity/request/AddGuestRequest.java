package mp.hbsapi.entity.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.RequiredArgsConstructor;
import mp.hbsapi.entity.Guest;

@RequiredArgsConstructor
public class AddGuestRequest {
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("middle_name")
    private String middleName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("birthday")
    private String birthday;
    @JsonProperty("street")
    private String street;
    @JsonProperty("city")
    private String city;
    @JsonProperty("state")
    private String state;
    @JsonProperty("zip_code")
    private int zipCode;
    @JsonProperty("contact_no")
    private String contactNo;
    @JsonProperty("email_add")
    private String emailAdd;

    public Guest mapToGuest() {
        return new Guest(firstName, middleName, lastName, birthday, street, city, state, zipCode, contactNo, emailAdd);
    }
}
