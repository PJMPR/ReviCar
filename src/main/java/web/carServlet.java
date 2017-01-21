package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.model.Car;


@WebServlet("/carServlet")
public class carServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Car car = new Car();
		car.setVehtype(request.getParameter("vehtype"));
		car.setMake(request.getParameter("make"));
		car.setModel(request.getParameter("model"));
		car.setYear(Integer.parseInt(request.getParameter("year")));

		HttpSession session = request.getSession();
		session.setAttribute("car", car);
		response.sendRedirect("addOffer.html");

	}

}
