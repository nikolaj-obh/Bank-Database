package dk.nikolaj.webbanking.currency;

import java.util.Objects;

public class Currency {

    private final String from;
    private final String to;

    public Currency(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Currency currency = (Currency) o;
        return Objects.equals(from, currency.from) && Objects.equals(to, currency.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to);
    }
}
