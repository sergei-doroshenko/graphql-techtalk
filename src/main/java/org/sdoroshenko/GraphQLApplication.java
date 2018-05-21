package org.sdoroshenko;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.sdoroshenko.model.Car;
import org.sdoroshenko.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GraphQLApplication {

    @Bean
    public GraphQLQueryResolver query() {
        return new GraphQLQueryResolver() {
            @Autowired
            CarRepository carRepository;

            public Iterable<Car> findAllCars() {
                return carRepository.findAll();
            }
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(GraphQLApplication.class, args);
    }
}
