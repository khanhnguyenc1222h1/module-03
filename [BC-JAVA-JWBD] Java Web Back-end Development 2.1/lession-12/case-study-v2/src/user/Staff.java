package user;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Staff implements InterfaceUser{
    public static List<User> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    boolean validate;
    User user = new User();

    static {
        list.add(new User("lam123@gmail.com", "Aa123"));
        list.add(new User("thai123@gmail.com", "Aa123"));
        list.add(new User("huong123@gmail.com", "Aa123"));
    }

    public void addUser() {
        validate = true;
        while (validate) {
            System.out.println("đăng ký tài khoản");
            String account = scanner.nextLine();
            System.out.println("đăng ký mật khẩu");
            String passWord = scanner.nextLine();
            if (user.validateAccount(account) && user.validatePassWord(passWord)) {
                list.add(new User(account, passWord));
                validate = false;
            }
            System.out.println("===========");
            System.out.println("Do it again");
        }
    }

    public void removeUser() {
        validate = true;
        while (validate) {
            System.out.println("xóa tài khoản");
            String account = scanner.nextLine();
            System.out.println("xóa mật khẩu");
            String passWord = scanner.nextLine();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getAccount().equals(account) && list.get(i).getPassWord().equals(passWord)) {
                    list.remove(list.get(i));
                    validate = false;
                }
            }
            System.out.println("===========");
            System.out.println("thử lại");
        }
    }

    public boolean checkUser() {
        do{
            System.out.println("đăng nhập");
            String account = scanner.nextLine();
            System.out.println("mật khẩu");
            String passWord = scanner.nextLine();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getAccount().equals(account) && list.get(i).getPassWord().equals(passWord)) {
                    return true;
                }
            }
            System.out.println("======tài khoản không hợp lệ======");
        }while(true);
    }
}
