package domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Date;

import dao.IRepositoryCatalog;
import dao.RepositoryCatalog;
import dao.uow.UnitOfWork;
import domain.model.Car;
import domain.model.Offer;
import domain.model.Seller;

public class App {
	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/workdb");
			IRepositoryCatalog catalog = new RepositoryCatalog(new UnitOfWork(connection), connection);
			
			Seller seller = new Seller();
			seller.setName("aaa");
			seller.setSurname("aaaaa");
			seller.setTel_number(111222333);
			seller.setMail("aaa@aaa.pl");
			seller.setTown("ttt");
			seller.setPost_code("80-111");
			
			Car car = new Car();
			car.setVehtype("aaa");
			car.setMake("bbb");
			car.setModel("ccc");
			car.setYear(1990);
			
			Offer offer = new Offer();
			offer.setTitle("aaa");
			offer.setDesc("bbb");
			offer.setUploaded(new Date(111-11-11));
			offer.setSeller_id(0);
			offer.setCar_id(0);
			
			catalog.sellers().add(seller);
			catalog.cars().add(car);
			catalog.offers().add(offer);
			
			catalog.saveAndClose();
		}

		catch (SQLException e) {
			e.printStackTrace();
		}

		System.out.println("Koniec");

	}
}
