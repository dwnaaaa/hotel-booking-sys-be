package mp.hbsapi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity(name = "GUEST")
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@NamedStoredProcedureQuery(name = "Guest.addGuest", procedureName = "ADD_GUEST", parameters =  {
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "in_first_name", type = String.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "in_middle_name", type = String.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "in_last_name", type = String.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "in_birthday", type = String.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "in_street", type = String.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "in_city", type = String.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "in_state", type = String.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "in_zip_code", type = String.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "in_contact_no", type = String.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "in_email_add", type = String.class),
})
public class Guest {
    @Id
    private String guestId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String birthday;
    private int age;
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String contactNo;
    private String emailAdd;

    public Guest(String firstName, String middleName, String lastName, String birthday, String street, String city,
                 String state, String zipCode, String contactNo, String emailAdd) {

        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.contactNo = contactNo;
        this.emailAdd = emailAdd;
    }
}
