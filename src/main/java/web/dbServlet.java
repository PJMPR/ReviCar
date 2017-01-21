package web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.IRepositoryCatalog;
import dao.RepositoryCatalog;
import dao.uow.UnitOfWork;
import domain.model.Car;
import domain.model.Offer;
import domain.model.Seller;

@WebServlet("/dbServlet")
public class dbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		try {
			Connection connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/workdb");
			IRepositoryCatalog catalog = new RepositoryCatalog(new UnitOfWork(connection), connection);
			HttpSession session = request.getSession();
			Seller seller = (Seller) session.getAttribute("seller");
			Car car = (Car) session.getAttribute("car");
			Offer offer = (Offer) session.getAttribute("offer");
			catalog.sellers().add(seller);
			catalog.cars().add(car);
			catalog.offers().add(offer);
			catalog.saveAndClose();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}

}
