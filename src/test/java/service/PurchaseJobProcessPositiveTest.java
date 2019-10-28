package service;

import model.Purchase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import status.PurchaseStatus;

public class PurchaseJobProcessPositiveTest {

    private PurchaseJob purchaseJob;
    private Purchase purchase;

    @Before
    public void setUp(){
        purchaseJob = new PurchaseJob();
        purchase = new Purchase(1L, PurchaseStatus.COMPLETED);
    }

    @Test
    public void processPurchase_returnsTrue(){

        Assert.assertTrue(purchaseJob.process(purchase));
    }
}
