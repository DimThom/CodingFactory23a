package gr.aueb.cf.testbed.ch11;

/**
 * The User class represents a user entity.
 *
 * @author dimthoma
 */
public class User {
    private Long id;
    private String firstName;
    private String lastName;

    public User() {
    }

    /**
     * Overloaded constructor for the User class.
     *
     * @param id        the user's ID
     * @param firstName the user's first name
     * @param lastName  the user's last name
     */
    public User(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
