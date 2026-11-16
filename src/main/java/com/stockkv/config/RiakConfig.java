package com.stockkv.config;

import java.net.URI;
import java.net.http.HttpClient;
import java.time.Duration;

public class RiakConfig {
    // host
    private static final String HOST = "localhost";

    // port
    private static final int PORT = 8098;
    private static final String BASE_URL = "https://"+HOST+":"+PORT;

    // Http Client
    private static final HttpClient HTTP_CLIENT =
            HttpClient.newBuilder().
                    connectTimeout(Duration.ofSeconds(10))
                    .build();

    public static HttpClient getHttpClient(){
        return HTTP_CLIENT;
    }

    public static URI getBaseUri(){
        return URI.create(BASE_URL);
    }
}

