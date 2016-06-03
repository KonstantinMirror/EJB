package flight.bean;


import java.io.Serializable;
import java.math.BigDecimal;

public class Payment implements Serializable {
    private BigDecimal amountPaid;
    private String formOfPaymentTypeCode;
    private String currencyCode;
}
