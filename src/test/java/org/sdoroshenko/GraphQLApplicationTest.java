package org.sdoroshenko;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class GraphQLApplicationTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void appTest() {
        String body = this.restTemplate.getForObject("/graphql/schema.json", String.class);
        assertNotNull(body);
    }
}