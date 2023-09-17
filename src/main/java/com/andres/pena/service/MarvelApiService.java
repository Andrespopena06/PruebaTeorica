package com.andres.pena.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.andres.pena.model.Responses.MarvelApiResponse;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Service
public class MarvelApiService {
    @Value("${marvel.api.base-url}")
    private String baseUrl;

    @Value("${marvel.api.public-key}")
    private String publicKey;

    @Value("${marvel.api.private-key}")
    private String privateKey;

    private RestTemplate restTemplate = new RestTemplate();

    public MarvelApiResponse fetchMarvelCharacters() {
        String timestamp = String.valueOf(System.currentTimeMillis());
        String hash = generateMD5Hash(timestamp + privateKey + publicKey);

        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(baseUrl)
                .queryParam("ts", timestamp)
                .queryParam("apikey", publicKey)
                .queryParam("hash", hash);

        return restTemplate.getForObject(builder.toUriString(), MarvelApiResponse.class);
    }

    private String generateMD5Hash(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            StringBuilder hexString = new StringBuilder();

            for (byte b : messageDigest) {
                hexString.append(String.format("%02x", b));
            }

            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error generando el hash MD5", e);
        }
    }
}

