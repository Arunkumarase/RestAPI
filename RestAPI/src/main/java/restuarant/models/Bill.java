package restuarant.models;

public class Bill extends BaseModel {
    private double totalAmount;
    private double gst;
    private double serviceCharge;

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getGst() {
        return gst;
    }

    public void setGst(double gst) {
        this.gst = gst;
    }

    public double getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public double getAmountToBePaid() {
        return totalAmount + gst + serviceCharge;
    }
}
