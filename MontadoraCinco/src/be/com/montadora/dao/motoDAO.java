package be.com.montadora.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import br.com.montadora.beans.Moto;

public class motoDAO {
	
	private Connection con;

	public final Connection getCon() {
		return con;
	}

	public final void setCon(Connection con) {
		this.con = con;
	}

	public motoDAO(Connection con) {
		setCon(con);
	}
	
	public String inserir(Moto moto) {
		String sql = "insert into moto(modelo, capacidadecombustivel, quantidadeadesivos) values (?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, moto.getModelo());
			ps.setInt(2, moto.getCapacidadeCombustivel());
			ps.setInt(3, moto.getQuantidadeAdesivo());
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
