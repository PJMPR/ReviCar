package dao;

import java.util.List;

import domain.model.Seller;

public interface ISellerRepository extends IRepository<Seller> {

	public List<Seller> withTown(String town);
	
}
