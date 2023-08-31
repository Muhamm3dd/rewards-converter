import java.text.DecimalFormat;

public class RewardValue {
    double cashValue;
    int mileValue;
    private static final double CONVERSION_RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.mileValue = (int) (cashValue / CONVERSION_RATE);
    }

    public RewardValue(int mileValue) {
        this.mileValue = mileValue;
        this.cashValue = mileValue * CONVERSION_RATE;
    }

    public double getCashValue() {
//    cashValue = mileValue * CONVERSION_RATE;


        return cashValue;
    }
    public int getMilesValue() {

        return mileValue;
    }
}

/**
public class RewardValue {
    private double cashValue;
    private int milesValue;
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / 0.0035);
    }
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035;
    }
    public double getCashValue() {
        return cashValue;
    }
    public int getMilesValue() {
        return milesValue;
    }
}
 **/