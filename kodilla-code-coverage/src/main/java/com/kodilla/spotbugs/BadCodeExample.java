package com.kodilla.spotbugs;

import java.util.Objects;

public class BadCodeExample {
    public BadCodeExample(String type) {
        this.type = type;
    }
    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    private String type;

    public static double getPi() {
        return Math.PI;
    }

    public String getType(String type) {
        this.type = type;
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BadCodeExample badCodeExample = (BadCodeExample) o;

        return type != null ? type.equals(badCodeExample.type) : badCodeExample.type == null;
    }
}

