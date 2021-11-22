package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DAO {
	
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/criarnome?useTimezone=true&serverTimezone=UTC";
	
	private String user = "root";
	private String password = "CARlos799";
	
	//metodo de conexão
	
	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println("Conexão não executada" + e);
			return null;
		}
	}
	
	//testa conexão
	
	/*public void testaConexao () {
		try {
			Connection con = conectar();
			System.out.println(con);
		} catch (Exception e) {
			System.out.println(e);
		}
	}*/
	
	//Inserir no bd
	
	public void inserirDado(JavaBeans dados) {
		String create = "insert into nome(nome) values (?)";
		
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(create);
			
			pst.setString(1, dados.getNome());
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println("deu ruim " + e);
		}
	}
	

	
}
