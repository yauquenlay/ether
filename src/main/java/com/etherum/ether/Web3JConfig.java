package com.etherum.ether;

import okhttp3.Credentials;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;

@Component
public class Web3JConfig {

    private final static String DEF_AUTH = "Authorization";

    @Bean
    public Web3j web3j(InfuraConfig infuraConfig){
        HttpService httpService = new HttpService(infuraConfig.getUrl());
        if(StringUtils.isNoneBlank(infuraConfig.getProjectId(),infuraConfig.getProjectSecret())){
            String credential = Credentials.basic(infuraConfig.getProjectId(), infuraConfig.getProjectSecret());
            httpService.addHeader(DEF_AUTH, credential);
        }
        Web3j web3 = Web3j.build(httpService);
        return web3;
    }
}
