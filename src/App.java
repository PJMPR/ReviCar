

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import dao.ClientRepository;
import dao.OffersRepository;
import domain.model.Client;
import domain.model.Offer;

public class App 
{
    public static void main( String[] args )
    {
    	String url = "jdbc:hsqldb:hsql://localhost/workdb";
    	try {
			Connection connection = DriverManager.getConnection(url);
			ClientRepository repo = new ClientRepository(connection);
			OffersRepository accountRepo = new OffersRepository(connection);

			
			Client janek = new Client();
			janek.setName("Jan");
			janek.setSurname("Kowalski");
			
			Offer macan = new Offer();
			macan.setVehtype("Car");
			macan.setMake("Mercedes-Benz");
			macan.setModel("C 300");
			macan.setYear(2016);
			macan.setPrice(229000);



	        System.out.println( "zapisuje nowe ogloszenie" );
			repo.add(janek);
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
        System.out.println( "Koniec" );
        
    }
}
