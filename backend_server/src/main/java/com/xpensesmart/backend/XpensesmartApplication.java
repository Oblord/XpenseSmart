package com.xpensesmart.backend;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class XpensesmartApplication extends Application<XpensesmartConfiguration>{

    public static void main(String[] args) throws Exception {
        new XpensesmartApplication().run(args);
    }

    @Override
    public String getName() {
        return "Xpensesmart";
    }

    @Override
    public void initialize(Bootstrap<XpensesmartConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(XpensesmartConfiguration configuration, Environment environment) throws Exception {

    }
}
