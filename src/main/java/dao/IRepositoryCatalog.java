package dao;

public interface IRepositoryCatalog {

	public ICarRepository cars();
	public ISellerRepository sellers();
	public IOfferRepository offers();
	
	public void saveAndClose();
	
}
