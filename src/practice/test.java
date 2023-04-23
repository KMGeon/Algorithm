package practice;

import java.util.Objects;

public class test {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car();

        System.out.println("car.equals(car2) = " + car.equals(car2));
    }
}

class Car{
    private int num;
    private String name;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return num == car.num && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return 50;
    }
}
