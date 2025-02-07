package Streams;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author andre
 */
public class AtualizaCaixa {

    public static void main(String[] args) {
        String insert = null;
Connection connection = null;
try {
    connection = DriverManager.getConnection("jdbc:sqlite:C:/Java/Java.db");
    Statement statement = connection.createStatement();
    statement.setQueryTimeout(10);  // Espera só por 10 segundos para conectar
    ResultSet rs = statement.executeQuery("SELECT * FROM tbl_nfe_sitef_log WHERE  ORDER BY id_seq ASC");
    while(rs.next()) {
    // Ler os dados inseridos
  
    System.out.println ("Regra Caixa banco principal: "+rs);
    }
} catch (SQLException ex) {
System.out.println ("Regra Caixa banco principal: ");
}
    }
}
 
