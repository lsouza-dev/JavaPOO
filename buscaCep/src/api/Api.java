package api;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Api {
    private String url;
    private HttpClient client;
    private HttpRequest request;
    private HttpResponse<String> response;

    public HttpClient CreateClient(){
         return this.client = HttpClient.newHttpClient();
    }

    public void Url(String cep){
        this.url = String.format("https://viacep.com.br/ws/%s/json/", cep);
    }

    public HttpRequest CreateRequest(){
        return this.request = HttpRequest.newBuilder().uri(URI.create(url)).build();
    }

    public HttpResponse<String> CreateResponse() throws IOException, InterruptedException {
        return this.response = client.send(request,HttpResponse.BodyHandlers.ofString());
    }

    public String getUrl() {
        return url;
    }

    public HttpClient getClient() {
        return client;
    }

    public HttpRequest getRequest() {
        return request;
    }

    public HttpResponse<String> getResponse() {
        return response;
    }
}
