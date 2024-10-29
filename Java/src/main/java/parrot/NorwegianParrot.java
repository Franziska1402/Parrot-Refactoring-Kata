package parrot;

public class NorwegianParrot extends Parrot {
    protected final double voltage;
    protected boolean isNailed;

    protected NorwegianParrot(double voltage, boolean isNailed) {
        super();
        this.voltage = voltage;
        this.isNailed = isNailed;

    }

    @Override
    public double getSpeed() {
        return (isNailed) ? 0 : getBaseSpeed(voltage);
    }

    @Override
    public String getCry() {
        return voltage > 0 ? "Bzzzzzz" : "...";
    }

    protected double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage * getBaseSpeed());
    }
}
