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
			seller.setName("Kuba");
			seller.setSurname("Piórkowski");
			seller.setTel_number(698754856);
			seller.setMail("kubamotors@dmail.ne"); 
			seller.setTown("Władysławowo");
			seller.setPost_code("84-100");
			
			Car car = new Car();
			car.setVehtype("SUV");
			car.setMake("Maserati");
			car.setModel("Levante S");
			car.setYear(2016);
			
			Offer offer = new Offer();
			offer.setTitle("New Maserati Levante S");
			offer.setDesc("New car, straight from Modena, ideal gift. For more info email me.");
			offer.setUploaded(new Date(2016-12-23));
			offer.setSeller_id(1);
			offer.setCar_id(1);
			
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
