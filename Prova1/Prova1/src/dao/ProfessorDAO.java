package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Professor;

public class ProfessorDAO {

	private Connection conexao;

	public ProfessorDAO(Connection conexao) {
		this.conexao = conexao;
	}

	public ArrayList<Professor> getConta(int idprofessor) {

		String query = "SELECT * FROM faculdade.professor ";
		ArrayList<Professor> resultado = new ArrayList<Professor>();

		PreparedStatement ps = null;
		ResultSet rs = null;

		try {

			ps = conexao.prepareStatement(query);

			ps.setInt(1, idprofessor);

			rs = ps.executeQuery();
			
			while(rs.next()) {
				resultado.add(new Professor(rs.getString("nome"), rs.getString("datanasc"), rs.getString("nomemae"), rs.getInt("titulacao"), rs.getInt("idprofessor")));
			}

			rs.close();
			ps.close();

		} catch (Exception e) {

		}

		return resultado;

	}

}