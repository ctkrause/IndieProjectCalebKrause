package entity;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

/**
 * Class respresents a user of the indieProject
 *
 * @author Caleb T. Krause
 */
@Entity(name = "Roles")
@Table(name = "roles")
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    private String title;

    @Column(name = "user_id")
    private int userId;

    /**
     * Instantiates a new Roles.
     */
    public Roles() {
    }

    /**
     * Instantiates a new Roles.
     *
     * @param id     the id
     * @param title  the title
     * @param userId the user id
     */
    public Roles(int id, String title, int userId) {
        this.id = id;
        this.title = title;
        this.userId = userId;
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
    public int getUserId() {
        return userId;
    }

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Roles{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", userId=" + userId +
                '}';
    }
}
