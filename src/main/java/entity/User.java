package entity;

/**
 * The type User.
 */
public class User {

    private int id;
    private String username;
    private String name;
    private String role;
    private String skills;

    /**
     * Instantiates a new User.
     *
     * @param id       the id
     * @param username the username
     * @param name     the name
     * @param role     the role
     * @param skills   the skills
     */
    public User(int id, String username, String name, String role, String skills) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.role = role;
        this.skills = skills;
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
     * Gets username.
     *
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets username.
     *
     * @param username the username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets role.
     *
     * @return the role
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets role.
     *
     * @param role the role
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * Gets skills.
     *
     * @return the skills
     */
    public String getSkills() {
        return skills;
    }

    /**
     * Sets skills.
     *
     * @param skills the skills
     */
    public void setSkills(String skills) {
        this.skills = skills;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", skills='" + skills + '\'' +
                '}';
    }
}