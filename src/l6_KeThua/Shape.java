package l6_KeThua;

public class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        this.color = "xanh la cay";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        if (this.filled) {
            return String.format("hinh nay co mau %s va duoc to kin", this.color);
        } else {
            return String.format("hinh nay co mau %s va khong duoc to kin", this.color);
        }
    }
}
