package com.hrchallenges;
import java.net.http.HttpRequest;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;
import java.util.concurrent.CompletableFuture;

public class AsyncHttp{

    //private ExecutorService executor = Executors.newFixedThreadPool(6);
    private HttpClient httpClient = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_2)
            .build();


    public void testAyncHttp(){

        List<String> myUrls = List.of("https://jsonplaceholder.typicode.com/posts", "https://jsonplaceholder.typicode.com/comments", "https://jsonplaceholder.typicode.com/photos");
        List<CompletableFuture<String>> myResponses = myUrls.stream()
                .map(url -> HttpRequest.newBuilder().uri(URI.create(url)).build())
                .map(request ->
                    this.httpClient.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                        .thenApply(HttpResponse::body))
                .collect(Collectors.toList());

        List<String> myResponseStrings = myResponses.stream()
                .map(CompletableFuture::join)
                .collect(Collectors.toList());
        System.out.println(myResponseStrings);
    }
}