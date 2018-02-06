package io.pengyuc.priceservice;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;

import javax.inject.Inject;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = PriceServiceApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestBase {
    @Inject
    WebApplicationContext context;

    @Before
    public void setupWebContext() {
        RestAssuredMockMvc.webAppContextSetup(context);
    }
}
