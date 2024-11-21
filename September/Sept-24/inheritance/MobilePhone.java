package inheritance;

public class MobilePhone extends Phone {
    int imeiNumber;
    MobilePhone(int imeiNumber) {
        super(model, imeiNumber)
        this.imeiNumber = imeiNumber;
    }
}
