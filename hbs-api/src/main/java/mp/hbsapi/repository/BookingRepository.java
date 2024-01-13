package mp.hbsapi.repository;

import jakarta.transaction.Transactional;
import mp.hbsapi.entity.BRN;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<BRN, String> {
    @Procedure(name = "BRN.addBooking")
    BRN addBooking(@Param("in_primary_guest_id") String primaryGuestId, @Param("in_booking_date") String bookingDate, @Param("in_check_in_date") String checkInDate,
                   @Param("in_check_out_date") String checkOutDate, @Param("in_room_type") char roomType, @Param("in_no_of_rooms") int noOfRooms, @Param("in_is_checked_in") int isCheckedIn);

    BRN getBRNByBrnIs(String brn);

    @Modifying
    @Transactional
    @Query(value = "UPDATE BRN SET IS_CHECKED_IN = 1 WHERE BRN = ?1", nativeQuery = true)
    void checkIn(String brn);

    @Modifying
    @Transactional
    @Query(value = "UPDATE BRN SET IS_CHECKED_IN = 0 WHERE BRN = ?1", nativeQuery = true)
    void checkOut(String brn);
}
