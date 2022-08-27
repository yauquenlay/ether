package com.etherum.ether;

import org.web3j.abi.datatypes.*;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Tuple<T extends Type> implements Type<List<T>> {

    private String type;
    protected final List<T> value;

    public Tuple(List<T> value) {
        this.value = value;
        type = value.stream().map(e -> e.getTypeAsString()).collect(Collectors.joining(",", "(", ")"));
    }

    @Override
    public List<T> getValue() {
        return this.value;
    }

    @Override
    public String getTypeAsString() {
        return type;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Tuple<?> tuple = (Tuple)o;
            return !this.type.equals(tuple.type) ? false : Objects.equals(this.value, tuple.value);
        } else {
            return false;
        }
    }

    public int hashCode() {
        int result = this.type.hashCode();
        result = 31 * result + (this.value != null ? this.value.hashCode() : 0);
        return result;
    }


}
