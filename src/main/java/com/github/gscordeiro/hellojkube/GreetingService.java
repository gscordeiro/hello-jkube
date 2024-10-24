package com.github.gscordeiro.hellojkube;

public class GreetingService {

    public GreetingModel greet(){

        String msg = System.getenv("HELLO_MSG");
        return new GreetingModel(msg != null ? msg : "Hello from Quarkus REST");

    }
    
}
