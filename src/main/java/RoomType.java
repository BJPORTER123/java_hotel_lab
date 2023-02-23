public enum RoomType {
    SINGLE(1),
    DOUBLE(2);

    private final int roomCapacity;

    RoomType(int roomCapacity) {
        this.roomCapacity = roomCapacity;
    }

    public int getRoomCapacity() {
        return roomCapacity;
    }
}
