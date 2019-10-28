package service;

import model.Purchase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import status.PurchaseStatus;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class PurchaseJobProcessNegativeTest {

    @Parameterized.Parameters
    public static Iterable<? extends Object> dataProvider() {
        final Purchase purchaseConfirmed = new Purchase(1L, PurchaseStatus.CONFIRMED);
        final Purchase purchaseFailed = new Purchase(2L, PurchaseStatus.FAILED);
        final Purchase purchasePending = new Purchase(3L, PurchaseStatus.PENDING);
        return Arrays.asList(purchaseConfirmed, purchaseFailed, purchasePending);
    }

    private PurchaseJob purchaseJob;

    @Parameterized.Parameter(0)
    public Purchase purchase;


    @Before
    public void setUp() {
        purchaseJob = new PurchaseJob();
    }

    @Test
    public void processPurchase_returnsFalse() {

        Assert.assertFalse(purchaseJob.process(purchase));
    }
}