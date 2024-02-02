package pl.javastart.task;

import pl.javastart.services.Offer;
import pl.javastart.services.CustomerService;
import pl.javastart.services.SalesRepresentative;

public class Main {
    public static void main(String[] args) {
        SalesRepresentative salesRepresentative = new SalesRepresentative();

        // to nie powinno być możliwe
        // salesRepresentative.config.minRequiredEarnings = 0;

        Offer offer = salesRepresentative.createLoanOffer(1_000_000, 1000);

        // to również nie powinno być możliwe
        // offer.valid = true;
        // offer.percentage = -0.5;
        // offer.value = 2_000_000;

        CustomerService customerService = new CustomerService();
        customerService.payoutOffer(offer);
        offer = salesRepresentative.createLoanOffer(500_000, 2000);
        customerService.payoutOffer(offer);
        offer = salesRepresentative.createLoanOffer(500_000, 1500);
        customerService.payoutOffer(offer);
    }
}