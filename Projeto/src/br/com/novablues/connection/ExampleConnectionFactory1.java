
//package br.com.novablues.connection;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//
//public class ExampleConnectionFactory1 {
//
//    private static final String USERNAME = "root";
//    private static final String PASSWORD = ""; // Lembrar de colocar em branco para os demais;
//    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/projetointegrador_terceiro";
//
//    public static Connection createConnectionToMySql() throws Exception {
//
//        Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
//
//        return connection;
//    }
//
//    public static void main(String[] args) throws Exception {
//
//        Connection con = createConnectionToMySql();
//        if (con != null) {
//
//            System.out.println("CONECTADO!");
//            con.close();
//        }
//    }
//
//}
