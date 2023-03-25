package com.arisusantolie.running.docker.executable.applicationrunner;


import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import java.io.PrintStream;
import java.time.LocalDate;

@Component
@Slf4j
public class ExecutableServiceRunner implements ApplicationRunner {

    @Autowired
    private ConfigurableApplicationContext context;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("=== Executable Service Starting ===");
        if (args.getOptionValues("programName") != null) {
            String programName = args.getOptionValues("programName").get(0);
            log.info("programName = "+programName);

        }
        log.info("=== Executable Service Ended ===");

        context.close();

    }
}
