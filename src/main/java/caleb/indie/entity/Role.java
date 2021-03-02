package caleb.indie.entity;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.util.Objects;

/**
 * Class respresents a user of the indieProject
 * @author Caleb T. Krause
 */
@Entity(name = "Role")
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    private String title;

    @ManyToOne
    private User user;

    /**
     * Instantiates a new Roles.
     */
    public Role() {
        //no argument constructor
    }

    /**
     * Instantiates a new Roles.
     *
     * @param title  the title
     * @param user the user id
     */
    public Role(String title, User user) {
        this.title = title;
        this.user = user;
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
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets user id.
     *
     * @param user the user id
     */
    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return id == role.id && Objects.equals(title, role.title) && user.equals(role.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, user);
    }

    @Override
    public String toString() {
        return "Roles{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", userId=" + user +
                '}';
    }
}
