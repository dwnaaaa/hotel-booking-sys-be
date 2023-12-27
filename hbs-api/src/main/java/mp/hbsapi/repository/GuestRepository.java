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
public interface GuestRepository extends JpaRepository<Guest, Long> {
    @Query(value = "SELECT * FROM GUEST_VIEW", nativeQuery = true)
    List<Guest> getAllGuests();

    @Procedure(name = "Guest.addGuest")
    Guest addGuest(@Param("in_first_name") String firstName, @Param("in_middle_name") String middleName, @Param("in_last_name") String lastName,
                   @Param("in_birthday") String birthday, @Param("in_street") String street, @Param("in_city") String city,
                   @Param("in_state") String state, @Param("in_zip_code") String zipCode,
                   @Param("in_contact_no") String contactNo, @Param("in_email_add") String emailAdd);
}
