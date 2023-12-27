package mp.hbsapi.repository;

import mp.hbsapi.entity.BRN;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<BRN, String> {
    @Procedure(name = "BRN.addBooking")
    BRN addBooking(@Param("in_primary_guest_id") String primaryGuestId, @Param("in_booking_date") String bookingDate, @Param("in_check_in_date") String checkInDate,
                   @Param("in_check_out_date") String checkOutDate, @Param("in_room_type") char roomType, @Param("in_no_of_rooms") int noOfRooms);
}
