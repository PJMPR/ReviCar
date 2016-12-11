package dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import dao.IRepository;
import domain.model.Car;

public class CarMapper implements IMapResultSetIntoEntity<Car> {

private IRepository<Car> carRepo;
	
	public IRepository<Car> getCarRepo() {
		return carRepo;
	}
	public Car map(ResultSet rs) throws SQLException {
		Car car = new Car();
		car.setId(rs.getInt("id"));
		car.setVehtype(rs.getString("vehtype"));
		car.setMake(rs.getString("make"));
		car.setModel(rs.getString("model"));
		car.setYear(rs.getInt("year"));
		return car;
	}

	public void setCarRepo(IRepository<Car> carRepo) {
		this.carRepo = carRepo;
	}
	
}
