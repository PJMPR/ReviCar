
public class OfferFactory {

    Public Offer MakeOffer(String type) {

        if(type.equals("car")) {
            Offer = new CarOffer();
        } else if (type.equals("motorbike")) {
            Offer = new MotorbikeOffer();
        } else if (type.equals("boat")) {
            Offer = new BoatOffer();
        }
        return Offer;
        }
    }




