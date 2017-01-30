package web;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.model.Car;
import domain.model.Offer;
import domain.model.Seller;


@WebServlet("/offerServlet")
public class offerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();

		Offer offer = new Offer();
		offer.setTitle(request.getParameter("title"));
		offer.setDesc(request.getParameter("desc"));
		offer.setUploaded(Date.valueOf(request.getParameter("uploaded")));
		
		session.setAttribute("offer", offer);
		response.sendRedirect("final.jsp");

	}

}
