package com.univ.ser;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.univ.dao.CoordinatorRegDAO;
import com.univ.dao.StudentRegDAO;

/**
 * Servlet implementation class AdminLogin
 */
@WebServlet("/AdminLogin")
public class Login_coordinator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login_coordinator() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String coordinatorId=request.getParameter("coordinatorId");
		String password=request.getParameter("password");
		//HttpSession hs=null;
		CoordinatorRegDAO cdao=new CoordinatorRegDAO();
		boolean b=cdao.checkDetails(coordinatorId,password);
		if(b) {
//			hs=request.getSession(false);
//			if(hs!=null) {
//				hs.invalidate();
//				hs=null;
//			}
//			hs=request.getSession(true);
//			hs.setAttribute("unm",unm);
			response.sendRedirect("coordinator_home.jsp");
		}
		else {
			response.sendRedirect("placement_cor_login.jsp");
		}	
	}

}
