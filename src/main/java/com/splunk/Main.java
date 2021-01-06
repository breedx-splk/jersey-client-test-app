package com.splunk;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.logging.LoggingFeature;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {

    private final Client client;

    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        Client client = ClientBuilder.newClient(new ClientConfig()
                .register(LoggingFeature.class)
                .register(JacksonFeature.class)
        );
        Main worker = new Main(client);
        executor.scheduleAtFixedRate(worker::doWork, 0, 1, TimeUnit.SECONDS);
    }

    public Main(Client client) {
        this.client = client;
    }

    void doWork() {
        try {
            System.out.println("Let's fetch a snack...");
            WebTarget webTarget = client.target("http://localhost:8000/").path("snacks/jerky.json");
            Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);
            Response response = invocationBuilder.get();
            Snack snack = response.readEntity(Snack.class);
            System.out.println("Fetched a delicious snack: " + snack);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
