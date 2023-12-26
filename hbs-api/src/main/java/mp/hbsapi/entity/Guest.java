package mp.hbsapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.Period;

@Entity(name = "GUEST")
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Guest {
    @Id
//    @GeneratedValue(generator = "c")
//    @SequenceGenerator(name = "brn_seq", sequenceName = "BRN_SEQ", allocationSize = 1)
    private long guestId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String birthday;
    private int age;
    private String street;
    private String city;
    private String state;
    private int zipCode;
    private String contactNo;
    private String emailAdd;

    public Guest(String firstName, String middleName, String lastName, String birthday, String street, String city,
                 String state, int zipCode, String contactNo, String emailAdd) {
        // Calculate age from birthday
        LocalDate birthdate = LocalDate.parse(birthday);
        Period age = Period.between(birthdate, LocalDate.now());

        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.age = age.getYears();
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.contactNo = contactNo;
        this.emailAdd = emailAdd;
    }
}
