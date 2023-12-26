package mp.hbsapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity(name = "ROOM_TYPE")
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RoomType {
    @Id
    private char roomType;
    private String roomTypeName;
    private char bedType;
    private String roomTypeDesc;
    private int price;
    private int maxGuests;
    private int noOfBeds;
    private float area;
}
