import java.util.Objects;

public class Car {

    String name;
    int yearOfProdaction;
    int price;
    int weight;
    Color color;
    private int distance = 0;
    protected int distanceOnService = 0;

    public Car(String name, int yearOfProdaction, int price, int weight, Color color) {
        this.name = name;
        this.yearOfProdaction = yearOfProdaction;
        this.price = price;
        this.weight = weight;
        this.color = color;
    }



    public void addDistance(int additionalDistance) {
        distance += additionalDistance;
        distanceOnService += additionalDistance;


    }


    public void addDistance(double additionalDistance) {
        distance += additionalDistance;
        distanceOnService += additionalDistance;

    }

    public void service() {
        if (distanceOnService > 10000) {
            distanceOnService = distanceOnService % 10000;
        }
    }

    public boolean isReadyToSevice() {
        if (distanceOnService > 10000) {
            return true;
        }
        return false;
    }


    public int getDistance() {
        return distance;
    }

    public int distanceOnService() {
        return distanceOnService;
    }



    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", yearOfProdaction=" + yearOfProdaction +
                ", price=" + price +
                ", weight=" + weight +
                ", color=" + color +
                ", distance=" + distance +
                ", distanceOnService=" + distanceOnService +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfProdaction == car.yearOfProdaction && price == car.price && weight == car.weight && Objects.equals(name, car.name) && color == car.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfProdaction, price, weight, color);
    }


}

