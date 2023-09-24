package monastery.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Priest extends Person {

    @ManyToOne
    private Order order;

    @ManyToOne
    private Priest superior;

    @ManyToMany (mappedBy = "priests")
    private List<Job> jobs = new ArrayList<>();


    public Priest() {
    }

    public Priest(Integer id, String firstName, String lastName, String email, String oib, Order order, Priest superior, List<Job> jobs) {
        super(id, firstName, lastName, email, oib);
        this.order = order;
        this.superior = superior;
        this.jobs = jobs;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Priest getSuperior() {
        return superior;
    }

    public void setSuperior(Priest superior) {
        this.superior = superior;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}

