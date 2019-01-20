package com.toutjuste.kataconfig;

import com.toutjuste.kataconfig.config.YAMLConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KataconfigApplication implements CommandLineRunner  {

    @Autowired
    private YAMLConfig myConfig;

	public static void main(String[] args) {
//        SpringApplication.run(KataconfigApplication.class, args);
        SpringApplication app = new SpringApplication(KataconfigApplication.class);
        app.run();

    }

    public void run(String[] args) {
        System.out.println("using environment: " + myConfig.getEnvironment());
        System.out.println("name: " + myConfig.getName());
    }

}

