package Problems.AmazonLockerDesign;
import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private Integer orderId;
    private List<String> Items;
    private LocalDateTime createdAt;


    public Integer getOrderId() {
        return orderId;
    }

    public List<String> getItems() {
        return Items;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
}
