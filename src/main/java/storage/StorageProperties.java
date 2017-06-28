package storage;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by Hivison N Moura on 28/06/2017.
 */
@ConfigurationProperties("storage")
public class StorageProperties {

    private String location = "upload-dir";

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
