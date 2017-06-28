package storage;

/**
 * Created by Hivison N Moura on 28/06/2017.
 */
public class StorageFileNotFoundException extends  StorageException {
    public StorageFileNotFoundException(String message) {
        super(message);
    }

    public StorageFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
