package mp.hbsapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity(name = "ROOM")
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Room {
    @Id
    private int roomNumber;
    private char roomType;
}
