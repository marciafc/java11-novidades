package br.com.marcia.java11;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

public class PrincipalHttpRequest {

    public static void main(String[] args) {

        callURI();

    }

    private static void callURI() {

        // Troca do pacote jdk.incubator.http por java.net.http
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://atitudereflexiva.wordpress.com/"))
                .build();

        HttpResponse.BodyHandler<String> bodyHandler = HttpResponse.BodyHandlers.ofString();

        HttpClient client = HttpClient.newHttpClient();

        // Modelo não blocante de comunicação: sendAsync
        CompletableFuture<HttpResponse<String>> future = client.sendAsync(request, bodyHandler);

        future.thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();
    }

}
