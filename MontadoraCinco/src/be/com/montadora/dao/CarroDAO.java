package be.com.montadora.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.montadora.beans.Carro;


public class CarroDAO {
	
	private Connection con;

	public final Connection getCon() {
		return con;
	}

	public final void setCon(Connection con) {
		this.con = con;
	}

	public CarroDAO(Connection con) {
		setCon(con);
	}
	
	public String inserir(Carro carro) {
		String sql = "insert into carro(modelo, capacidadecombustivel, quantidadedejanelas) values (?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, carro.getModelo());
			ps.setInt(2, carro.getCapacidadeCombustivel());
			ps.setInt(3, carro.getQuantidadeJanela());
			if (ps.executeUpdate() > 0) {
				return "Inserido com sucesso.";
			} else {
				return "Erro ao inserir.";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}

	}
	
}
