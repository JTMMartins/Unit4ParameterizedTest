package service;

import model.Purchase;
import status.PurchaseStatus;

public class PurchaseJob {

    public boolean process(final Purchase purchase) {

        return PurchaseStatus.COMPLETED.equals(purchase.getStatus());
    }
}
