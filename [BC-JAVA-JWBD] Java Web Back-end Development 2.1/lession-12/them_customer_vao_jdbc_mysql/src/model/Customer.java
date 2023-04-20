package model;

public class Customer {
    private int id;
    private String username;
    private String password;
    private static int count = 0;

    public Customer(String username, String password) {
        this.username = username;
        this.password = password;
        this.id = ++count;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", username=" + username +
                ", password=" + password ;
    }
}
