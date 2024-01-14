package mp.hbsapi.repository;

import mp.hbsapi.entity.Guest;
import mp.hbsapi.entity.request.GetGuestNameResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GuestRepository extends JpaRepository<Guest, Long> {
//    @Query(value = "SELECT * FROM GUEST_VIEW", nativeQuery = true)
//    List<Guest> getAllGuests();

    @Query(value = "INSERT INTO GUEST (FIRST_NAME, MIDDLE_NAME, LAST_NAME, BIRTHDAY, STREET, CITY, STATE, ZIP_CODE, CONTACT_NO, EMAIL_ADD) VALUES (?1, ?2, ?3, TO_DATE(?4, 'YYYY-MM-DD'), ?5, ?6, ?7, ?8, ?9, ?10)", nativeQuery = true)
    Guest addGuest(
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

    @Query(value = "SELECT GUEST_ID FROM GUEST WHERE FIRST_NAME = ?1 AND MIDDLE_NAME= ?2 AND LAST_NAME = ?3", nativeQuery = true)
    long getGuestIdByName(String firstName, String middleName, String lastName);

//    @Query(value = "SELECT * FROM GUEST_VIEW WHERE GUEST_ID = :id", nativeQuery = true)
//    Guest getGuestById(long id);

    Guest getGuestByGuestId(long id);
}
