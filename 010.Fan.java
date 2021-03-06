public class Fan {
    private int slow = 1;
    private int medium = 2;
    private int fast = 3;
    private int speed = slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "Blue";

    public Fan() {
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public String toString() {
        String text = "";
        if (on == true) {
            text = "Hız: " + getFast() + " - Açı: " + getRadius() + " - Renk: " + getColor();
        }
        else {
            text = "Renk: " + getColor() + " - Açı: " + getRadius() + " - ON/OF Durumu: " + isOn();
        }
        return text;
    }

    public int getSlow() {
        return slow;
    }

    public void setSlow(int slow) {
        this.slow = slow;
    }

    public int getMedium() {
        return medium;
    }

    public void setMedium(int medium) {
        this.medium = medium;
    }

    public int getFast() {
        return fast;
    }

    public void setFast(int fast) {
        this.fast = fast;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
