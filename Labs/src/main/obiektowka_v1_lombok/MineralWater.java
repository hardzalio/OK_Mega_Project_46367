package main.obiektowka_v1_lombok;

import java.util.Objects;

public class MineralWater {

    private String name;
    private double price;
    private double quantity;
    private double volume;
    private int carbonationLevel;
    private int mineralsLevel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getCarbonationLevel() {
        return carbonationLevel;
    }

    public void setCarbonationLevel(int carbonationLevel) {
        this.carbonationLevel = carbonationLevel;
    }

    public int getMineralsLevel() {
        return mineralsLevel;
    }

    public void setMineralsLevel(int mineralsLevel) {
        this.mineralsLevel = mineralsLevel;
    }

    public MineralWater() {
        this.name = "SparklingMineralWater";
        this.price = 0.0;
        this.quantity = 0.0;
        this.volume = 1.0;
        this.carbonationLevel = 100;
        this.mineralsLevel = 100;
    }

    public MineralWater(String name, double price, double quantity, double volume, int carbonationLevel, int mineralsLevel) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.volume = volume;
        this.carbonationLevel = carbonationLevel;
        this.mineralsLevel = mineralsLevel;
    }

    public MineralWater(String name, double price) {
        this(name, price, 0.0, 1.0, 100, 100);
    }

    @Override
    public String toString() {
        return "SparklingMineralWater{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", volume=" + volume +
                ", carbonationLevel=" + carbonationLevel +
                ", mineralsLevel=" + mineralsLevel +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MineralWater that = (MineralWater) o;
        return Double.compare(that.price, price) == 0 && Double.compare(that.quantity, quantity) == 0 && Double.compare(that.volume, volume) == 0 && carbonationLevel == that.carbonationLevel && mineralsLevel == that.mineralsLevel && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, quantity, volume, carbonationLevel, mineralsLevel);
    }
}
