

public class room{
    
    private String roomName;
    private Integer roomCap;
    private Integer roomNum;

    public room(String room_name, Integer roomCap, Integer roomNum){
        this.roomName = room_name;
        this.roomCap = roomCap;
        this.roomNum = roomNum;
    }

    public String getRoomName() {
        return this.roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public Integer getRoomCap() {
        return this.roomCap;
    }

    public void setRoomCap(Integer roomCap) {
        this.roomCap = roomCap;
    }

    public Integer getRoomNum() {
        return this.roomNum;
    }

    public void setRoomNum(Integer roomNum) {
        this.roomNum = roomNum;
    }

}
