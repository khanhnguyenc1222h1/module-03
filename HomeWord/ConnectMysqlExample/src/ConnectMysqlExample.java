import java.beans.Customizer;
import java.sql.*;

public class ConnectMysqlExample {
    private static String DB_URL = "jdbc:mysql://localhost:3306/testdb";
    private static String USER_NAME = "root";
    private static String PASSWORD = "123456";
    private static final String INSERT_USERS_SQL = "INSERT INTO student VALUES (?, ?, ?);";

    public static void main(String args[]) {
        try {
            // connnect to database 'testdb'
            Connection conn = getConnection(DB_URL, USER_NAME, PASSWORD);
            // crate statement
            Statement stmt = conn.createStatement();

            //insert data
            PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO student VALUES (?, ?, ?);");


            preparedStatement.setInt(1,6);
            preparedStatement.setString(2,"Có");
            preparedStatement.setString(3,"BinhDuong");
            preparedStatement.execute();
            System.out.println(preparedStatement);
            preparedStatement.setInt(1,7);
            preparedStatement.setString(2,"Có");
            preparedStatement.setString(3,"BinhDuong");
            preparedStatement.execute();
            System.out.println(preparedStatement);
            int kp = preparedStatement.executeUpdate();
            System.out.println("ket qua : "+ kp);
            System.out.println("=============");
            // get data from table 'student'
            ResultSet rs = stmt.executeQuery("select * from student");

            // show data
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "  " + rs.getString("name")
                        + "  " + rs.getString("address"));
            }
             //close connection
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static Connection getConnection(String dbURL, String userName,
                                           String password) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, userName, password);
            System.out.println("connect successfully!");
        } catch (Exception ex) {
            System.out.println("connect failure!");
            ex.printStackTrace();
        }
        return conn;
    }
}