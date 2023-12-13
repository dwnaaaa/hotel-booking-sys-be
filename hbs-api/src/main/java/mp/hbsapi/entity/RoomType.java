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
    private char bedType;
    private int price;
    private int maxGuests;
    private int numberOfBeds;
    private float area;
    private String description;
}
