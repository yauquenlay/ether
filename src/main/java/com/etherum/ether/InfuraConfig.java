package com.etherum.ether;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties("infura")
public class InfuraConfig {

    private String url;

    private String projectId;

    private String projectSecret;
}
