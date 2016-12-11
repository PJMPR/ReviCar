package dao;

import java.util.List;

import domain.model.Offer;

public interface IOfferRepository extends IRepository<Offer> {

	public List<Offer> withPrice(int price);
	
}
