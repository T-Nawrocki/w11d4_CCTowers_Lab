package room;

public class Bedroom extends Room {

    private int roomNumber;
    private RoomType roomType;
    private int nightlyRate;

    public Bedroom(int roomNumber, RoomType roomType, int nightlyRate) {
        super();
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.capacity = roomType.getCapacity();
        this.nightlyRate = nightlyRate;

    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public int getNightlyRate() {
        return nightlyRate;
    }
}
