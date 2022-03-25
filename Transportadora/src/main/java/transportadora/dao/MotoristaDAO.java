package transportadora.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import transportadora.ConnectionFactory.ConnectionFactory;
import transportadora.model.Funcoes;
import transportadora.model.Motorista;
import transportadora.model.Sexos;
public class MotoristaDAO {
	
	private Connection connection;

	public MotoristaDAO() throws ClassNotFoundException {
		this.connection = new ConnectionFactory().getConnection();
		criarTabelaMotorista();
	}
	 public void criarTabelaMotorista(){
	        try {
	            String sql = "CREATE SEQUENCE IF NOT EXISTS idMotorista_id_seq;";
	            sql += "CREATE TABLE IF not exists motoristas " +
	                    "(idMotorista BIGINT PRIMARY KEY DEFAULT nextval('idMotorista_id_seq'), " +
	                    " Nome VARCHAR(55)  , " +
	                    " Cpf VARCHAR(15)  , " +
	                    " Sexo VARCHAR (20)," +
	                    " Telefone VARCHAR(16)  , " +
	                    " Endereco VARCHAR(100)  , " +
	                    " DtNascimento TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP," +
	                    " Funcao VARCHAR (15)," +
	                    " Obs VARCHAR (100)," +
	                    " fretes_Concluidos INTEGER," +
	                    " Ativo boolean)";
	            Statement statement = connection.createStatement();
	            statement.execute(sql);
	            statement.close();
	        }catch (SQLException e){
	            throw new RuntimeException();
	        }
	 }
	 
	 public void inserirMotorista(Motorista motorista) {
		 try {
			 String sql = "";
			 sql += "INSERT INTO motoristas (Nome, Sexo, Cpf, Telefone, " +
	                    "Endereco, Funcao, Ativo) " +
	                    "VALUES (?,?,?,?,?,?,?)";
			 PreparedStatement st = connection.prepareStatement(sql);
			 st.setString(1, motorista.getNome());
			 st.setString(2, motorista.getSexo().toString());
			 st.setString(3, motorista.getCpf());
			 st.setString(4, motorista.getTelefone());
			 st.setString(5, motorista.getEndereco());
			 st.setString(6, motorista.getFuncao().toString());
			 st.setBoolean(7, motorista.isAtivo());
			 st.execute();
			 st.close();
		 }catch(SQLException e) {
			 throw new RuntimeException();
		 }
	 }
	public ArrayList<Motorista> mostrarMotoristas(){
		try {
			ArrayList<Motorista> motoristas = new ArrayList<Motorista>();
			String sql = "SELECT * FROM motoristas";
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				Sexos sexo = Sexos.valueOf(rs.getString("Sexo"));
				Funcoes funcoes = Funcoes.Motorista;
				Motorista motorista = new Motorista();
				motorista.setId(rs.getInt("idMotorista"));
				motorista.setNome(rs.getString("Nome"));
				motorista.setCpf(rs.getString("Cpf"));
				motorista.setTelefone(rs.getString("Telefone"));
				motorista.setFuncao(funcoes);
				motorista.setSexo(sexo);
				motoristas.add(motorista);
			}
			return motoristas;
			
		}catch(SQLException e) {
			 throw new RuntimeException();
		}
	}
	public Motorista findById(int id) {
		try {
			String sql = "SELECT * FROM motoristas WHERE idMotorista = ? ";
			PreparedStatement st = connection.prepareStatement(sql);
			st.setInt(1, id);
			Motorista motorista = new Motorista();
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				Sexos sexo = Sexos.valueOf(rs.getString("Sexo"));
				Funcoes funcoes = Funcoes.Motorista;
				motorista.setId(rs.getInt("idMotorista"));
				motorista.setNome(rs.getString("Nome"));
				motorista.setCpf(rs.getString("Cpf"));
				motorista.setTelefone(rs.getString("Telefone"));
				motorista.setFuncao(funcoes);
				motorista.setSexo(sexo);
			}
			return motorista;
		}catch(SQLException e) {
			throw new RuntimeException();
		}
	}
	public void deletar(int id) {
		String sql = "DELETE FROM motoristas WHERE idMotorista = ?";
		try {
			PreparedStatement st = connection.prepareStatement(sql);
			st.setInt(1, id);
			st.execute();
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	
