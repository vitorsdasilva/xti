package br.com.cursoxti.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IncluirDados {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/db_xti?useTimezone=true&serverTimezone=UTC";
		//String sql = "insert into pessoa values (3, 'Caio', 'M', 'caio@xti.com.br')";
		String sql = "insert into pessoa values (?,?,?,?)";
		String[] pessoas = {"Sandra","Beatriz","Juliana","Fatima","Veranda","Tereza","Leila"};
		try(Connection con = DriverManager.getConnection(url,"xti","xti123")){
				
				
			try(PreparedStatement stm = con.prepareStatement(sql)){
				
				for (int i = 0; i < pessoas.length; i++) {
					stm.setInt(1, i+4);
					stm.setString(2, pessoas[i]);
					stm.setString(3, "F");
					stm.setString(4, pessoas[i].toLowerCase() + "@xti.com.br");
					stm.addBatch();
				}
				//stm.executeUpdate();
				stm.executeBatch();
			} catch (SQLException e){}
		
			sql = "select nome, email from pessoa";
			PreparedStatement stm2 = con.prepareStatement(sql);
			ResultSet rs = stm2.executeQuery();
			while(rs.next()){
				System.out.println(rs.getString("nome")+ ":" + rs.getString("email"));
				
			}
		}
		
	}

}
