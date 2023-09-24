package monastery.model;

import jakarta.persistence.ManyToMany;

import java.util.Date;
import java.util.List;

@jakarta.persistence.Entity
public class Job extends Entity{

    private String name;
    private String description;
    private Date beginDate;

    @ManyToMany
    private List<Priest> priests;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }
}
