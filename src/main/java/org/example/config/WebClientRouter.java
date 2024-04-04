package org.example.config;

import org.example.handlers.CourseHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.*;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

@Configuration(proxyBeanMethods = false)
public class WebClientRouter {
    // https://api.twelvedata.com/time_series?symbol=AAPL&interval=1day&apikey=demo

    @Bean
    public RouterFunction<ServerResponse> route(CourseHandler courseHandler) {
        return RouterFunctions
                .route(GET("/time_series").and(accept(MediaType.APPLICATION_JSON)), courseHandler::getCourse);
    }
}
