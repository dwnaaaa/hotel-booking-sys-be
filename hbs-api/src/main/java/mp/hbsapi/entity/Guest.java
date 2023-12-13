package mp.hbsapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

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
}
