package org.wallerlab.dso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.wallerlab.config.BatchConfig;

import java.io.IOException;



@SpringBootApplication
@Import(BatchConfig.class)
public class Main {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(Main.class);
    }

}