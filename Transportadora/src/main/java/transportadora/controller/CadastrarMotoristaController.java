package transportadora.controller;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import transportadora.dao.MotoristaDAO;
import transportadora.model.Funcoes;
import transportadora.model.Motorista;
import transportadora.model.Sexos;

/**
 * Servlet implementation class CadastrarMotoristaController
 */
@WebServlet("/CadastrarMotoristaController")
public class CadastrarMotoristaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastrarMotoristaController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String des = "/WEB-INF/cadastrarMotorista.jsp";
		RequestDispatcher rd = getServletContext().getRequestDispatcher(des);
	    rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		Funcoes funcoes = Funcoes.Motorista;
		Sexos sexo = Sexos.valueOf(request.getParameter("sexo"));
		Motorista motorista = new Motorista();
		motorista.setAtivo(true);
		motorista.setNome(request.getParameter("nome"));
		motorista.setCpf(request.getParameter("cpf"));
		motorista.setEndereco(request.getParameter("endereco"));
		motorista.setSexo(sexo);
		motorista.setTelefone(request.getParameter("telefone"));
		motorista.setFuncao(funcoes);
		try {
			MotoristaDAO motoristaDAO = new MotoristaDAO();
			motoristaDAO.inserirMotorista(motorista);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
