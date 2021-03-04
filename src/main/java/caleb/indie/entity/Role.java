package caleb.indie.entity;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.util.Objects;

/**
 * Class respresents a user of the indieProject
 *
 * @author Caleb T. Krause
 */
@Entity(name = "Role")
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;


    @ManyToOne
    @JoinColumn(name = "user_id",
        foreignKey = @ForeignKey(name = "role_user_user_id_fk")
    )
    private User user;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "role_name")
    private String roleName;

    /**
     * Instantiates a new Roles.
     */
    public Role() {
        //no argument constructor
    }

    /**
     * Instantiates a new Role.
     *
     * @param user     the user
     * @param userName the user name
     * @param roleName the role name
     */
    public Role(User user, String userName, String roleName) {
        this.user = user;
        this.userName = userName;
        this.roleName = roleName;
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

    /**
     * Gets user name.
     *
     * @return the user name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets user name.
     *
     * @param userName the user name
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Gets role name.
     *
     * @return the role name
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * Sets role name.
     *
     * @param roleName the role name
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return id == role.id &&
                Objects.equals(userName, role.userName) &&
                Objects.equals(roleName, role.roleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, roleName);
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}
