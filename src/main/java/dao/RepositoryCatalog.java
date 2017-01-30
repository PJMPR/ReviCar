package dao;

import java.sql.Connection;
import java.sql.SQLException;

import dao.mappers.CarMapper;
import dao.mappers.OfferMapper;
import dao.mappers.SellerMapper;
import dao.uow.IUnitOfWork;

public class RepositoryCatalog implements IRepositoryCatalog{

	IUnitOfWork uow;
	Connection connection;
	
	
	public RepositoryCatalog(IUnitOfWork uow, Connection connection) {
		super();
		this.uow = uow;
		this.connection = connection;
	}

	public ICarRepository cars() {
		return new CarRepository(connection, new CarMapper(), uow);
	}
	
	public ISellerRepository sellers() {
		return new SellerRepository(connection, new SellerMapper(), uow);
	}
	
	public IOfferRepository offers() {
		return new OfferRepository(connection, new OfferMapper(), uow);
	}

	public void saveAndClose() {
		try{
			uow.commit();
		}catch(SQLException ex){
			ex.printStackTrace();
		}
		
	}

}
