package lab7.auction;

public class User {
    private final String firstName;
    private final String lastName;
    private final String login;
    private final String email;
    private int trustPoints;

    public User(String firstName, String lastName, String login, String email, int trustPoints) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.email = email;
        this.trustPoints = trustPoints;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    public int getTrustPoints() {
        return trustPoints;
    }

    void addTrustPoint() {
        trustPoints++;
    }

    void removeTrustPoint() {
        if (trustPoints > 0) trustPoints--;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (@" + login + ", trust: " + trustPoints + ")";
    }
}
