package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import status.PurchaseStatus;

@AllArgsConstructor
public class Purchase {

    private final long id;
    @Getter
    private PurchaseStatus status;
}
