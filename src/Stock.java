package src;

public class Stock {

    public String getDate() {
        return date;
    }

    public Stock(String date, float value) {
        this.date = date;
        this.value = value;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    private String date;
    private float value;
}
