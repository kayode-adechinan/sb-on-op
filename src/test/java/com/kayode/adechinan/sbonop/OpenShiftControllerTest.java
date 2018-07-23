package com.kayode.adechinan.sbonop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class OpenShiftControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void shouldReturnHelloOpenShift(){
        String response = testRestTemplate.getForObject("/", String.class );

        assertThat(response).isEqualTo("hello openshift");
    }
}
