package org.example.webClientes;

import org.example.model.Course;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class CourseWebClient {
    String url = "https://api.twelvedata.com/time_series?symbol=AAPL&interval=1day&apikey=demo";
    private final WebClient client;

    public CourseWebClient(WebClient.Builder builder) {
        this.client = builder.baseUrl(url).build();
    }

    public Mono<String> getValute() {

        return this.client
                .get()
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(Course.class)
                .map(Course::toString);
    }
}
