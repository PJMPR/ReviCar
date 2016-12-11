package dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import dao.IRepository;
import domain.model.Offer;

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
		offer.setSeller_id(rs.getInt("mail"));
		offer.setCar_id(rs.getInt("town"));
		return offer;
	}

	public void setOfferRepo(IRepository<Offer> offerRepo) {
		this.offerRepo = offerRepo;
	}
	
}