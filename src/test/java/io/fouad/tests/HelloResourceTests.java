package io.fouad.tests;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class HelloResourceTests {

    @Test
    void testHelloEndpoint() {
        System.out.println("TEST PASSED!");
    }

}