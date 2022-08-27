package com.etherum.ether;

import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.spi.FunctionEncoderProvider;

public class TupleFunctionEncoderProvider implements FunctionEncoderProvider {
    @Override
    public FunctionEncoder get() {
        return new TupleFunctionEncoder();
    }
}
