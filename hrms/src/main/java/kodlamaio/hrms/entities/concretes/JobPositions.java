package kodlamaio.hrms.entities.concretes;

import javax.persistence.*;

@Entity
@Table(name = "JobPositions")
public class JobPositions {

    @Id
    @GeneratedValue
    @Column(name="Id")
    private int id;

    @Column(name="Name")
    private String name;

    public JobPositions(){

    }

    public JobPositions(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
