import javax.xml.transform.Result;
import java.sql.*;

public class JDBC_Query_1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // 1-  Kullanılacak veritabanı için doğru sürücüyü ekle
            Class.forName("com.mysql.cj.jdbc.Driver");

        //2-  Veritabani ile iletişimi başlat
        Connection con = DriverManager.getConnection("jdbc:mysql://194.140.198.209/heallife_hospitaltraining",
                "heallife_hospitaltraininguser",
                "PI2ZJx@9m^)3");

        //3-  SQL sorgularını yapabilmek için suite hazırla
        Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        //Insensitive ile data içerisinde her yöne hareket edebiliyoruz, Concur Read ile tüm datayı okuyabiliyoruz


        //4-  SQL ifadeleri oluştur ve çalıştır (Select, Insert/update/delete)

        String query = "SELECT * FROM heallife_hospitaltraining.staff;";
        ResultSet rs = st.executeQuery(query);

        rs.next();
        System.out.println(rs.getString("name"));
        //4-  Gelen sonuçları işle, kaydet vb.





        //5-  Veritabanı bağlantısını bitir.
    }
}
