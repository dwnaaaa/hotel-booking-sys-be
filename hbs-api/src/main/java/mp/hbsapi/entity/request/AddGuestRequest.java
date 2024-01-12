package mp.hbsapi.entity.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import mp.hbsapi.entity.Guest;

@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
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
    private String zipCode;
    @JsonProperty("contact_no")
    private String contactNo;
    @JsonProperty("email_add")
    private String emailAdd;

    public Guest mapToGuest() {
        return new Guest(this.firstName, this.middleName, this.lastName, this.birthday, this.street,
        this.city, this.state, this.zipCode, this.contactNo, this.emailAdd);
    }
}
