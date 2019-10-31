package br.com.cursoxti.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContaCRUD {

	public void criar(Connection con, Conta conta) throws SQLException {
		String sql = "insert into conta values (?,?,?)";
		try (PreparedStatement stm = con.prepareStatement(sql)) {
			stm.setInt(1, conta.numero);
			stm.setString(2, conta.cliente);
			stm.setDouble(3, conta.saldo);
			stm.executeUpdate();
		}
	}
	
	
	public void alterar(Connection con, Conta conta) throws SQLException {
		String sql = "update conta set cliente=?, saldo=? where numero=?";
		try (PreparedStatement stm = con.prepareStatement(sql)) {
			stm.setString(1, conta.cliente);
			stm.setDouble(2, conta.saldo);
			stm.setInt(3, conta.numero);
			stm.executeUpdate();
		}
	}
	
	public void excluir(Connection con, Conta conta) throws SQLException {
		String sql = "delete from conta where numero=?";
		try (PreparedStatement stm = con.prepareStatement(sql)) {
			stm.setInt(1, conta.numero);
			stm.executeUpdate();
		}
	}
	
	public List<Conta> ler(Connection con) throws SQLException{
		List<Conta> lista = new ArrayList<>();
		String sql = "select numero,cliente,saldo from conta";
		try (PreparedStatement stm = con.prepareStatement(sql);
			 ResultSet rs = stm.executeQuery()){
			while(rs.next()){
				lista.add(new Conta(rs.getInt(1), rs.getString(2), rs.getDouble(3)));
			}
		}
		
		return lista;
	}
	
	public static void main(String[] args) throws SQLException{
		String url = "jdbc:mysql://localhost:3306/db_xti?useTimezone=true&serverTimezone=UTC";
		try(Connection con = DriverManager.getConnection(url,"xti","xti123")){
			ContaCRUD crud = new ContaCRUD();
			
			
			Conta conta1 = new Conta(1, "Vitor", 1000.30);
			//conta1.saldo = 9000.99;
			//crud.alterar(con, conta1);
			
			Conta conta2 = new Conta(2, "Luciana", 2000.30);
			//crud.excluir(con, conta2);
			
			
			Conta conta3 = new Conta(3, "Isaac", 3000.30);
			//crud.excluir(con, conta3);
			
			
			crud.criar(con, conta1);
			crud.criar(con, conta2);
			crud.criar(con, conta3);
			
			
			
			List <Conta> contas =  crud.ler(con);
			
			for (Conta conta : contas){
				System.out.println(conta);
				
			}
			
		}
		
	}
	
	

}
