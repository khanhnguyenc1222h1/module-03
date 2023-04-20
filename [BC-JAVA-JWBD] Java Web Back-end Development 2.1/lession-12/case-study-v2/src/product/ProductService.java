package product;

import user.User;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements InterfaceProduct{
    public static List<Product> list = new ArrayList<>();
    static {
        list.add(new Product("Nike","red",32,83000,1));
        list.add(new Product("Adidas","red",42,32000,2));
        list.add(new Product("Vans","green",38,57000,3));
        list.add(new Product("Balenciaga","yellow",43,43000,4));
        list.add(new Product("Valentino","red",23,24000,3));
    }
    Scanner scanner = new Scanner(System.in);

    public void addProduct() {
        System.out.println("Thêm tên thương hiệu sản phẩm");
        String brand = scanner.nextLine();
        System.out.println("Thêm màu sắc sản phẩm");
        String color = scanner.nextLine();
        System.out.println("Thêm kích thước sản phẩm");
        int size = Integer.parseInt(scanner.nextLine());
        System.out.println("Thêm giá sản phẩm");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Thêm số lượng sản phẩm");
        int quatity = Integer.parseInt(scanner.nextLine());
        list.add(new Product(brand, color, size, price , quatity));
        System.out.println("đã xong");
    }

    public void readFile() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("F:\\Codegym\\Bootcamp 2.0\\Course\\Module-02\\[BC-JAVA-APJ] Advanced Programming with Java 2.1\\case-study-v2\\src\\data\\product.csv"));
            String line = "";
            String[] obj = line.split(",");
            for (int i = 0; i < obj.length; i += 5) {
                list.add(new Product(obj[i], obj[i + 1], Integer.parseInt(obj[i + 2]), Integer.parseInt(obj[i + 3]),Integer.parseInt(obj[i + 4])));
            }
            while((line = reader.readLine())!=null){
                System.out.println(printDetail(parseCsvLine(line)));
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void writeFile(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("F:\\Codegym\\Bootcamp 2.0\\Course\\Module-02\\[BC-JAVA-APJ] Advanced Programming with Java 2.1\\case-study-v2\\src\\data\\product.csv"));
            String line;
            while((line = reader.readLine())!=null){
                System.out.print(printDetail(parseCsvLine(line)));
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void buyProduct() {
        System.out.println("Thương hiệu muốn mua");
        String brand = scanner.nextLine();
        System.out.println("Màu sắc muốn mua");
        String color = scanner.nextLine();
        System.out.println("Kích thước muốn mua");
        int size = Integer.parseInt(scanner.nextLine());
        System.out.println("Số lượng muốn mua");
        int quatity = Integer.parseInt(scanner.nextLine());
        if (!list.isEmpty()) {
            for (Product lists : list) {
                if (lists.getBrand().equalsIgnoreCase(brand) && lists.getColor().equalsIgnoreCase(color) && lists.getSize() == size) {
                        if (lists.getQuatity() > 0) {
                            if(quatity <= lists.getQuatity()){
                                for(int i=0 ; i<quatity ; i++){
                                        lists.setQuatity(1);
                                    }
                                try{
                                    String str = "\t\tCảm ơn bạn đã đặc mua sản phẩm"+"\n"+"Thương hiệu: "+lists.getBrand()+"\t\t"+"Màu sắc: "+lists.getColor()+
                                            "\t\t"+"Kích Thước: "+lists.getSize()+"\t"+"Số lượng: "+quatity+"\n"+"\tSản phẩm của bạn sớm sẻ được nhận trong thời gian sớm nhất"+"\n"+"\tChúc bạn có một ngày tốt lành";
                                    FileWriter fileWriter = new FileWriter("invoice.csv");//không tự động xuất file
                                    for(int i=0 ; i<str.length();i++){
                                        fileWriter.write(str.charAt(i));
                                    }
                                    fileWriter.close();
                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            System.out.println("Hoàn tất");
                                }else{
                                System.out.println("============");
                                System.out.println("Nhập lại");
                                System.out.println("============");
                            }
                        }else if(lists.getQuatity() == 0){
                            System.out.println("Sản phẩm đã hết hàng");
                        }
                    }
            }
        } else {
            System.out.println("Giang hàng trống");
        }
    }
    public void changeQuatityProduct(){
            System.out.println("Nhập tên thương hiệu");
            String brand = scanner.nextLine();
            System.out.println("Nhập màu sắc");
            String color = scanner.nextLine();
            System.out.println("Nhập kích thước");
            int size = Integer.parseInt(scanner.nextLine());
            System.out.println("Số lượng muốn thêm");
            int quatity = Integer.parseInt(scanner.nextLine());
            for (Product lists : list) {
                if (lists.getBrand().equalsIgnoreCase(brand) && lists.getColor().equalsIgnoreCase(color) && lists.getSize() == size) {
                    if(lists.getQuatity() >= 0){
                        for(int i=0 ; i<quatity ; i++){
                            lists.setQuatity(-1);
                        }
                        System.out.println("Đã thêm xong");
                    }
                }
            }
    }
    public void removeProduct(){
            System.out.println("Nhập tên thương hiệu");
            String brand = scanner.nextLine();
            System.out.println("Nhập màu sắc");
            String color = scanner.nextLine();
            System.out.println("Nhập kích thước");
            int size = Integer.parseInt(scanner.nextLine());
            for (int i=0 ; i<list.size(); i++) {
                if (list.get(i).getBrand().equalsIgnoreCase(brand) && list.get(i).getColor().equalsIgnoreCase(color) && list.get(i).getSize() == size) {
                    list.remove(list.get(i));
                    System.out.println("Đã xóa xong");
                }
            }
    }
    public static String printDetail(List<String> list){
        return list.get(0)+","+list.get(1)+","+list.get(2)+","+list.get(3)+","+list.get(4)+"\n";
    }
    public static List<String> parseCsvLine(String csvLine){
        List<String> result = new LinkedList<>();
        if(csvLine!=null){
            String[] splitData = csvLine.split(",");
            for(int i=0 ; i<splitData.length; i++){
                result.add(splitData[i]);
            }
        }
        return result;
    }
    public void viewProductList(){
        for(Product productLists : list){
            System.out.println(productLists);
        }
    }
    public Product toString(int num) {
        return list.get(num);
    }
}
