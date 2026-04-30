abstract class Payment{
    abstract paymentProcess();
    abstract GenerateReceipt();
    double Amount;
}

class CreditCardPayment extends Payment{
    String CardNumber;
}