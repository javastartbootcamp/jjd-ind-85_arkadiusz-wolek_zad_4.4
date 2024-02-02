package pl.javastart.services;

public class CustomerService {
    public void payoutOffer(Offer offer) {
        if (offer.valid) {
            System.out.printf("Wypłacono %.2f zł\n", offer.value);
            System.out.printf("Do zwrotu będzie %.2f zł\n", (offer.percentage + 1) * offer.value);
        } else {
            System.out.println("Odmowa wypłaty");
        }
    }
}
