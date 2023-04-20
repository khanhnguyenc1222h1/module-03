package service;

import model.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    public static List<Customer> list = new ArrayList<>();
    static{
        list.add(new Customer("lamhuynh","lam123"));
        list.add(new Customer("thaidui","thai123"));
        list.add(new Customer("phuocnguyen","phuoc123"));
    }
    @Override
    public Customer viewCustomer() {
        for (Customer lists : list) {
            System.out.println(lists);
        }
        return null;
    }

    @Override
    public Customer deleteCustomer(int id) {
        for (int i = 0 ; i < list.size() ; i++) {
            if(list.get(i).getId() == id){
                list.remove(i);
                System.out.println("đã xóa thành công");
            }
        }
        return null;
    }

    @Override
    public Customer createCustomer() {
        Scanner scanner = new Scanner(System.in);
        String username = "";
        String password = "";
        System.out.print("username: ");
        username = scanner.nextLine();
        System.out.print("password: ");
        password = scanner.nextLine();
        list.add(new Customer(username,password));
        System.out.println("đã tạo thành công");
        return null;
    }

    @Override
    public Customer updateCustomer(int id) {
        Scanner scanner = new Scanner(System.in);
        String username;
        String password;
        for (Customer lists : list) {
            if(id == lists.getId()){
                System.out.print("username:");
                username = scanner.nextLine();
                lists.setUsername(username);
                System.out.print("password:");
                password = scanner.nextLine();
                lists.setPassword(password);
            }
        }
        System.out.println("đã cập nhật thành công");
        return null;
    }
}
