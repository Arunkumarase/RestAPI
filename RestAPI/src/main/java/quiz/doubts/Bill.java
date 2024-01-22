package quiz.doubts;

public class Bill extends BaseModel{
    private double amount;
    private double gst;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getGst() {
        if (this.amount > 0) {
            System.out.println("amount is more");
        }
        return gst;
    }

    public void setGst(double gst) {
        this.gst = gst;
    }
}
