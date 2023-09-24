package monastery.model;
import jakarta.persistence.Entity;

@Entity
public class Order extends monastery.model.Entity {

    private String orderName;

    public Order() {
    }

    public Order(Integer id, String orderName) {
        super(id);
        this.orderName = orderName;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }
}
