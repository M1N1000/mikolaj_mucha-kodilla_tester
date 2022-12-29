package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String name;
    private double width ;
    private double length;
    private boolean stamp;



    public Stamp(String name, double width, double length, boolean stamp ) {
        this.name = name;
        this.stamp = stamp;
        this.width = width;
        this.length = length;
    }
    public String getName() {
        return name;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public boolean getStamp() {
        return stamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp1 = (Stamp) o;
        return Double.compare(stamp1.width, width) == 0 && Double.compare(stamp1.length, length) == 0 && Objects.equals(name, stamp1.name) && Objects.equals(stamp, stamp1.stamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, width, length, stamp);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", length=" + length +
                ", stamp='" + stamp + '\'' +
                '}';
    }
}
