package Com.karthik.Zt_Jersey;

import org.glassfish.jersey.server.ResourceConfig;

public class MyApplication extends ResourceConfig {
    public MyApplication() {
        packages("Com.karthik.Zt_Jersey");
        register(org.glassfish.jersey.jackson.JacksonFeature.class);
    }
}
