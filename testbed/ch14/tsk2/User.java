package gr.aueb.cf.testbed.ch14.tsk2;

/**
 * This class represents a user.
 */
public class User {
    private Long id;
    private String firstname;
    private String lastname;

    /**
     * Constructor for creating a User object.
     *
     * @param id         The user's identifier.
     * @param firstname  The user's first name.
     * @param lastname   The user's last name.
     */
    public User(Long id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    /**
     * Register the user.
     */
    public void registerUser() {
        System.out.println("User is registered successfully.");
    }
}


