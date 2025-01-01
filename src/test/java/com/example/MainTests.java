package src.test.java.com.example;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MainTests {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testReadRoot() {
        ResponseEntity<String> response = restTemplate.getForEntity("/", String.class);
        assertThat(response.getBody()).contains("Hello, world!");
    }

    @Test
    public void testReadItem() {
        ResponseEntity<String> response = restTemplate.getForEntity("/square/4", String.class);
        assertThat(response.getBody()).contains("\"square\":16");
    }
}
