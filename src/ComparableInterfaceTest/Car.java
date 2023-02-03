package ComparableInterfaceTest;

public class Car implements Comparable{
    int speed;
    int price;
    String model;
    String color;

    public Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }

    @Override
    public int compareTo(Object o) {
        int temp = this.speed - ((Car)o).speed;
        if (temp == 0) {
            temp = this.price - ((Car)o).price;
            if (temp == 0) {
                temp = this.model.compareTo(((Car)o).model);
                if (temp == 0) {
                    temp = this.color.compareTo(((Car) o).color);
                }
            }
        }
        return temp;
    }
}
