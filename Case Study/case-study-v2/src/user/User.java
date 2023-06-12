package user;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    private String account;
    private String passWord;
    private int id;
    private static int count = 0;
    private Matcher matcher;
    private static final String ACCOUNT_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z-0-9]+(\\.[A-Za-z0-9]+)$";
    private static final String PASSWORD_REGEX = "^[A-Z]+[A-Za-z-0-9]+[0-9]$";

    public User(String account, String passWord) {
        this.account = account;
        this.passWord = passWord;
        this.id = ++count;
    }

    public User() {
    }

    public boolean validateAccount(String account) {
        matcher = Pattern.compile(ACCOUNT_REGEX).matcher(account);
        return matcher.matches();
    }

    public boolean validatePassWord(String passWord) {
        matcher = Pattern.compile(PASSWORD_REGEX).matcher(passWord);
        return matcher.matches();
    }

    public String getAccount() {
        return account;
    }

    public String getPassWord() {
        return passWord;
    }

    @Override
    public String toString() {
        return "account= " + account +
                "\tpassword= " + passWord+
                "\tid= " + id+
                "\n";
    }
}
