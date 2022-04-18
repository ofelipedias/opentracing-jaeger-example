package br.com.felipesilva.opentracing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OpentracingJaegerExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpentracingJaegerExampleApplication.class, args);
    }

}
