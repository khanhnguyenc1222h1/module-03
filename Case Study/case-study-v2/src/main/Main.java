package main;

import user.Customer;
import user.Staff;
import product.ProductService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Staff staff = new Staff();
        Customer customer = new Customer();
        ProductService productService = new ProductService();
        while (true){
            System.out.println("1.Bạn là nhân viên");
            System.out.println("2.Bạn là khách hàng");
            switch (scanner.nextInt()){
                case 1:
                    if(staff.checkUser()){
                        productService.viewProductList();
                        while(true){
                            System.out.println("1.Thêm sản phẩm mới");
                            System.out.println("2.Thêm số lượng sản phẩm");
                            System.out.println("3.Xóa sản phẩm");
                            System.out.println("4.Xem danh sách sản phẩm");
                            System.out.println("5.Thoát ra");
                            switch (scanner.nextInt()){
                                case 1:
                                    productService.addProduct();
                                    break;
                                case 2:
                                    productService.changeQuatityProduct();
                                    break;
                                case 3:
                                    productService.removeProduct();
                                    break;
                                case 4:
                                    productService.viewProductList();
                                    break;
                                case 5:
                                    System.exit(5);
                                    break;
                            }
                        }
                    }
                    break;
                case 2:
                    if(customer.checkUser()){
                        productService.viewProductList();
                        while(true){
                            System.out.println("1.Đặt mua sản phẩm");
                            System.out.println("2.Xem danh sách của sản phẩm");
                            System.out.println("3.Thoát ra");
                            switch (scanner.nextInt()){
                                case 1:
                                    productService.buyProduct();
                                    //productService.writeFile();
                                    break;
                                case 2:

                                    productService.viewProductList();
                                    break;
                                case 3:
                                    System.exit(4);
                                    break;
                            }
                        }
                    }
            }
        }
    }
}
