package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.io.IOException;
import java.util.logging.*;

@SpringBootApplication
@RestController
public class SpringDemoApplication {

    private final static Logger logger = Logger.getLogger(SpringDemoApplication.class.getName());

    public static void main(String[] args) {

        SpringApplication.run(SpringDemoApplication.class, args);
    }

    // this is the url http://localhost:8080/hello
    @RequestMapping("/hello")
    public  String sayHello() throws IOException {
        logger.log(Level.WARNING,"notha message");
        logger.info("whats is going on");
        LogManager.getLogManager().reset();
        logger.setLevel(Level.ALL);
        ConsoleHandler ch = new ConsoleHandler();
        ch.setLevel(Level.INFO);
        logger.addHandler(ch);

        FileHandler fh = new FileHandler("myLog.log",true);
        fh.setLevel(Level.INFO);
        logger.addHandler(fh);
        fh.setFormatter(new SimpleFormatter());

        logger.severe("severe message");

        return "waz up";
    }

    @RequestMapping("/goodbye")
    public String saySomething()
    {
        return "no more can we do this";
    }



}


// resource : https://www.youtube.com/watch?v=bNDnjme8B2o