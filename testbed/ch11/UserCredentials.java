package gr.aueb.cf.testbed.ch11;
/**
 * The UserCredentials class represents user credentials.
 */
public class UserCredentials {
    private Long id;
    private String username;
    private String password;

    public UserCredentials() {
    }

    /**
     * Overloaded constructor for the UserCredentials class.
     *
     * @param id       the credentials' ID
     * @param username the username
     * @param password the password
     */
    public UserCredentials(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

