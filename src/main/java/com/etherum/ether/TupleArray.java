package com.etherum.ether;

import org.web3j.abi.datatypes.Type;

import java.util.List;

public class TupleArray implements Type<List<Tuple>> {

    private String type;
    protected final List<Tuple> value;

    public TupleArray(List<Tuple> value) {
        this.value = value;
        type = value.get(0).getTypeAsString()+"[]";
    }

    @Override
    public List<Tuple> getValue() {
        return this.value;
    }

    @Override
    public String getTypeAsString() {
        return type;
    }
}
