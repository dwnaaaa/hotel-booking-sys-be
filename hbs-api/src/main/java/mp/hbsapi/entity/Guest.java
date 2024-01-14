package mp.hbsapi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "GUEST")
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Guest {
    @Id
    @GeneratedValue(generator = "guest_seq")
    @SequenceGenerator(name = "guest_seq", sequenceName = "GUEST_SEQ", allocationSize = 1)
    private long guestId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String birthday;
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
