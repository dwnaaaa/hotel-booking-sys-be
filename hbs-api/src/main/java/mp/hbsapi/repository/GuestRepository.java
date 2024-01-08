package mp.hbsapi.repository;

import mp.hbsapi.entity.Guest;
import mp.hbsapi.entity.request.AddGuestRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GuestRepository extends JpaRepository<Guest, String> {
    @Query(value = "SELECT * FROM GUEST_VIEW", nativeQuery = true)
    List<Guest> getAllGuests();

//    @Procedure(name = "Guest.addGuest")
//    Guest addGuest(@Param("in_first_name") String firstName, @Param("in_middle_name") String middleName, @Param("in_last_name") String lastName,
//                   @Param("in_birthday") String birthday, @Param("in_street") String street, @Param("in_city") String city,
//                   @Param("in_state") String state, @Param("in_zip_code") String zipCode,
//                   @Param("in_contact_no") String contactNo, @Param("in_email_add") String emailAdd);

//    @Query(value = """
//    INSERT INTO GUEST VALUES (:guestId, :firstName, :middleName, :lastName,
//    TO_DATE(:birthday, 'YYYY-MM-DD'), :street, :city, :state, :zipCode, :contactNo, :emailAdd)""", nativeQuery = true)
//    Guest addGuest(@Param("guestId") String guestId,
//                   @Param("firstName") String firstName,
//                   @Param("middleName") String middleName,
//                   @Param("lastName") String lastName,
//                   @Param("birthday") String birthday,
//                   @Param("street") String street,
//                   @Param("city") String city,
//                   @Param("state") String state,
//                   @Param("zipCode") String zipCode,
//                   @Param("contactNo") String contactNo,
//                   @Param("emailAdd") String emailAdd);

    @Query(value = "INSERT INTO GUEST G (G.GUEST_ID, G.FIRST_NAME, G.MIDDLE_NAME, G.LAST_NAME, G.BIRTHDAY, G.STREET, G.CITY, G.STATE, G.ZIP_CODE, G.CONTACT_NO, G.EMAIL_ADD) VALUES (?1, ?2, ?3, ?4, TO_DATE(?5, 'YYYY-MM-DD'), ?6, ?7, ?8, ?9, ?10, ?11)", nativeQuery = true)
    Guest addGuest(String guestId,
                   String firstName,
                   String middleName,
                   String lastName,
                   String birthday,
                   String street,
                   String city,
                   String state,
                   String zipCode,
                   String contactNo,
                   String emailAdd);
}
