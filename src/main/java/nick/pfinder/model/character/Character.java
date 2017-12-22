package nick.pfinder.model.character;

import java.util.UUID;

/**
 * Created by nickyrayray on 8/18/17.
 */
public interface Character {

    UUID getCacheId();

    void setCacheId(UUID id);

}
