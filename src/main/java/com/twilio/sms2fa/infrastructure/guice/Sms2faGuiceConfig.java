package com.twilio.sms2fa.infrastructure.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;

public class Sms2faGuiceConfig extends GuiceServletContextListener {

    @Override
    protected Injector getInjector() {
        return Guice.createInjector(
                new Sms2faPropertiesModule(),
                new Sms2faRepositoryModule(),
                new Sms2faServiceModule(),
                new Sms2faServletModule());
    }

}
