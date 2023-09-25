package monastery.model;
//import jakarta.persistence.Entity;

import jakarta.persistence.Column;

@jakarta.persistence.Entity
public class Order extends Entity {

    @Column (nullable = false)
    private String orderName;

    public Order(){ }

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
