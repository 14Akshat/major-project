package com.univ.ser;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.univ.dao.StudentRegDAO;

/**
 * Servlet implementation class Login_student
 */
@WebServlet("/Login_student")
public class Login_student extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login_student() {
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
		String enrollmentNo=request.getParameter("enrollmentNo");
		String password=request.getParameter("password");
		//HttpSession hs=null;
		StudentRegDAO cdao=new StudentRegDAO();
		boolean b=cdao.checkDetails(enrollmentNo,password);
		if(b) {
//			hs=request.getSession(false);
//			if(hs!=null) {
//				hs.invalidate();
//				hs=null;
//			}
//			hs=request.getSession(true);
//			hs.setAttribute("unm",unm);
		    
			response.sendRedirect("student_home.jsp");
		}
		else {
			response.sendRedirect("student_login.jsp");
		}
	}
	}


