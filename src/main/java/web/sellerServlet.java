package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.model.Seller;


@WebServlet("/sellerServlet")
public class sellerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Seller seller = new Seller();
		seller.setName(request.getParameter("name"));
		seller.setSurname(request.getParameter("surname"));
		seller.setTel_number(Integer.parseInt(request.getParameter("tel_number")));
		seller.setMail(request.getParameter("mail"));
		seller.setTown(request.getParameter("town"));
		seller.setPost_code(request.getParameter("post_code"));
		HttpSession session = request.getSession();
		session.setAttribute("seller", seller);
		response.sendRedirect("addCar.html");

	}

}
