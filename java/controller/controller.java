package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.DAO;
import models.JavaBeans;


@WebServlet(urlPatterns={"/controller", "/insert", "/cadastro"})
public class controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DAO dao = new DAO();
    JavaBeans dados = new JavaBeans(); 
	
    public controller() {
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();
		if(action.equals("/cadastro")) {
			response.sendRedirect("cadastro.html");
		}else if(action.equals("/insert")) {
			inserirDados(request, response);
		}
		System.out.println(action);
	}
	
	protected void inserirDados(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		dados.setNome(request.getParameter("nome"));
		
		dao.inserirDado(dados);
		
		response.sendRedirect("index.html");
	}

}
