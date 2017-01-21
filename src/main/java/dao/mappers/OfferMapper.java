package dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import dao.IRepository;
import domain.model.Car;
import domain.model.Offer;
import domain.model.Seller;

public class OfferMapper implements IMapResultSetIntoEntity<Offer> {

private IRepository<Offer> offerRepo;
	
	public IRepository<Offer> getOfferRepo() {
		return offerRepo;
	}
	public Offer map(ResultSet rs) throws SQLException {
		Offer offer = new Offer();
		offer.setId(rs.getInt("id"));
		offer.setTitle(rs.getString("title"));
		offer.setDesc(rs.getString("desc"));
		offer.setUploaded(rs.getDate("uploaded"));
		return offer;
	}

	public void setOfferRepo(IRepository<Offer> offerRepo) {
		this.offerRepo = offerRepo;
	}
	
}