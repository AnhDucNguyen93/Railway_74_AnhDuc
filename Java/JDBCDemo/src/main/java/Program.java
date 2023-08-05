import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class Program {

    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
        Properties properties = new Properties();
        //Nhu này là fix thi ok
        //properties.load(new FileInputStream("C:\\Users\\Duc Nguyen Anh\\Desktop\\Railway_74\\Java\\JDBCDemo\\src\\main\\resources/database.properties"));

        File file = new File("src/main/resources");
        File[] ls = file.listFiles();
        properties.load(new FileInputStream("src/main/resources"));

        String url = properties.getProperty("url");
        String userName = properties.getProperty("username");
        String password = properties.getProperty("password");
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url,userName,password);
       // connection.setAutoCommit(false);
        System.out.println("thanh cong");

        //String sql = "{CALL GetALLQuestion}";
        //CallableStatement callableStatement = connection.prepareCall(sql);

//        String dbUrl = "jdbc:mysql://localhost:3306/testingsystem";
//        String user = "root";
//        String pass = "root";
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        Connection connection = DriverManager.getConnection(dbUrl,user,pass);
//        //System.out.println("Connect success!");
//        Statement statement = connection.createStatement();
//        ResultSet sql = statement.executeQuery("SELECT * FROM question");
    }
}