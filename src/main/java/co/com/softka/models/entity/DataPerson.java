package co.com.softka.models.entity;

public class DataPerson {
    private String user;
    private String password;

    public DataPerson(String user, String password) {
        super();
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}
