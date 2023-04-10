package org.acme;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class CustomMain {

    public static void main(String[] args) {
        Quarkus.run(CustomApp.class, args);
    }

    public static class CustomApp implements QuarkusApplication {

        @Override
        public int run(String... args) throws Exception {
            System.out.println("Running main from custom app");
            Quarkus.waitForExit();
            return 0;
        }
    }

}
