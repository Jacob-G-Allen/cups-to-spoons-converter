package MeasurementConverter.model;

public abstract class Conversions {

    private double originalUnit;

    private double conversion;
    private String measurementName;

    public double getConversion() {
        return conversion;
    }

    public String getMeasurementName() {
        return measurementName;
    }
}
