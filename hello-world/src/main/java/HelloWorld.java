/**
 * File: HelloWorld
 * Project: hello-world
 * File Created: 30/11/2021 17:11
 * Author: compadrejunior
 * Copyright (c) 2021 OAT Solutions, OAT Solutions. All rights reserved.
 */
import org.apache.commons.lang3.StringUtils;

public class HelloWorld {

    private String message;

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("hello world!");
        System.out.println(helloWorld.getMessage());
        helloWorld.setMessage("hello world!", "capitalize");
        System.out.println(helloWorld.getMessage());
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setMessage(String message, String options) {
        if (options.equals("capitalize")) {
            setMessage(StringUtils.capitalize(message));
        }
        setMessage(message);
    }
}
