package com.etherum.ether;

import org.web3j.abi.FunctionReturnDecoder;
import org.web3j.abi.spi.FunctionReturnDecoderProvider;

public class TupleFunctionReturnDecoderProvider implements FunctionReturnDecoderProvider {
    @Override
    public FunctionReturnDecoder get() {
        return new TupleFunctionReturnDecoder();
    }
}
