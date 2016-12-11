package dao;

import java.util.List;

import domain.model.Car;

public interface ICarRepository extends IRepository<Car> {

	public List<Car> withYear(int year);
	
}
