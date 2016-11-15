/**
 * Created by Jaruzzzelski on 2016-11-15.
 */
public class OfferPage {
    OfferFactory factory;

    public OfferPage(OfferFactory factory) {
        this.factory = factory;
    }

    public Offer addOffer(String type) {
    Offer offer;

        offer = factory.addOffer(type);
        offer

    }
}

