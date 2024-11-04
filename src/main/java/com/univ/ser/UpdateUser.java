package com.univ.ser;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.univ.dao.StudentRegDAO;
import com.univ.dto.RegistrationDTO;

/**
 * Servlet implementation class UpdateUser
 */
@WebServlet("/UpdateUser")
public class UpdateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  RegistrationDTO rdto=new RegistrationDTO();
	  rdto.setSid(Integer.parseInt(request.getParameter("id")));
	  rdto.setSname(request.getParameter("name"));
		rdto.setSadd(request.getParameter("add"));
		rdto.setSmob(Integer.parseInt(request.getParameter("mob")));
		rdto.setSemail(request.getParameter("email"));
		rdto.setSunm(request.getParameter("unm"));
		rdto.setSpw(request.getParameter("pw"));
		StudentRegDAO cdao=new StudentRegDAO();
		int x=cdao.update(rdto);
		if(x>0) {
			PrintWriter pw=response.getWriter();
			pw.print(x+" data is inserted");
			response.sendRedirect("login.jsp");
		}
		else {
			response.sendRedirect("UpdateUser.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
