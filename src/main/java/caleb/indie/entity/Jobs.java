package caleb.indie.entity;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * The type Jobs.
 */
@Entity(name = "Jobs")
@Table(name = "jobs")
public class Jobs {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;


    private String description;

    @ManyToOne
    @JoinColumn(name = "user_id",
            foreignKey = @ForeignKey(name = "orders_user_id_fk"))
    private User user;

    /**
     * Instantiates a new Jobs.
     */
    public Jobs() {
    }

    /**
     * Instantiates a new Jobs.
     *
     * @param description the description
     * @param user        the user
     */
    public Jobs(String description, User user) {
        this.user = user;
        this.description = description;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets user.
     *
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets user.
     *
     * @param user the user
     */
    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jobs jobs = (Jobs) o;
        return id == jobs.id && userId == jobs.userId && Objects.equals(description, jobs.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, userId);
    }

    @Override
    public String toString() {
        return "Jobs{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", userId=" + userId +
                '}';
    }
}
