package pl.javastart.services;

public class SalesRepresentative {

    private Config config;

    public SalesRepresentative() {
        this.config = new Config();
    }

    public Offer createLoanOffer(int requestedAmount, int earnings) {
        Offer offer = new Offer();
        if (earnings >= config.minRequiredEarnings) {
            offer.percentage = config.percentage;
            offer.valid = true;
            offer.value = requestedAmount;
        }
        return offer;
    }

}
