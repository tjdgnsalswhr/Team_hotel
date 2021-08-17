package teamhotel;

public class Ordered extends AbstractEvent {

    private Long id;
    private String roomType;
    private String status;
    private String cardNo;
    private String customerName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }
    public String getCutomerName() {
        return customerName;
    }

    public void setCutomerName(String customerName) {
        this.customerName = customerName;
    }
}