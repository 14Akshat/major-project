package com.univ.ser;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.univ.dao.StudentRegDAO;
import com.univ.dto.RegistrationGetterSetter;

/**
 * Servlet implementation class Registration_student
 */
@WebServlet("/Registration_student")
public class Registration_student extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration_student() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		RegistrationGetterSetter reg=new RegistrationGetterSetter();
		reg.setName(request.getParameter("name"));
		reg.setEmail(request.getParameter("email"));
		reg.setEnrollmentNo(request.getParameter("enrollNo"));
		reg.setMobileNo(Integer.parseInt(request.getParameter("phoneNo")));
		reg.setYear(Integer.parseInt(request.getParameter("year")));
		reg.setPassword(request.getParameter("password"));
		//reg.setConfirmPassword(request.getParameter("confirmPassword"));
		StudentRegDAO cdao=new StudentRegDAO();
		//ExecutorService service = Executors.newFixedThreadPool(10);
		int x=cdao.insert(reg);
		if(x>0) {
		   
			response.sendRedirect("student_login.jsp");
		}
		else {

			response.sendRedirect("student_login.jsp");
		}
	}

}
