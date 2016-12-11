package dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import dao.IRepository;
import domain.model.Seller;

public class SellerMapper implements IMapResultSetIntoEntity<Seller> {

private IRepository<Seller> sellerRepo;
	
	public IRepository<Seller> getSellerRepo() {
		return sellerRepo;
	}
	public Seller map(ResultSet rs) throws SQLException {
		Seller seller = new Seller();
		seller.setId(rs.getInt("id"));
		seller.setName(rs.getString("name"));
		seller.setSurname(rs.getString("surname"));
		seller.setTel_number(rs.getInt("tel_number"));
		seller.setMail(rs.getString("mail"));
		seller.setTown(rs.getString("town"));
		seller.setPost_code(rs.getString("post_code"));
		return seller;
	}

	public void setSellerRepo(IRepository<Seller> sellerRepo) {
		this.sellerRepo = sellerRepo;
	}
	
}