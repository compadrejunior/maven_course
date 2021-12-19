import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * File: HelloWorldTest
 * Project: hello-world
 * File Created: 18/12/2021 17:28
 * Author: compadrejunior
 * Copyright (c) 2021 OAT Solutions, OAT Solutions. All rights reserved.
 */
public class HelloWorldTest {

    @Test
    public void testMain() {
        HelloWorld.main(null);
    }

    @Test
    public void testGetMessage() {
        HelloWorld helloWorld = new HelloWorld();
        assertNull(helloWorld.getMessage());
    }

    @Test
    public void testSetMessage() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("hello world");
        assertEquals(helloWorld.getMessage(), "hello world");
    }

    @Test
    public void testSetMessageWithOptions() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("hello world", "capitalize");
        assertEquals(helloWorld.getMessage(), "hello world");
    }

    @Test
    public void testSetMessageWithoutOptions() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("hello world", "test");
        assertEquals(helloWorld.getMessage(), "hello world");
    }
}