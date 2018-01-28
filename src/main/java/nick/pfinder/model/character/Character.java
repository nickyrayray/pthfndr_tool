package nick.pfinder.model.character;

import nick.pfinder.model.character.attributes.Alignment;
import nick.pfinder.model.character.attributes.Size;

import java.util.UUID;

/**
 * Created by nickyrayray on 8/18/17.
 */
public interface Character {

    UUID getCacheId();

    void setCacheId(UUID id);

    String getName();
    String getPlayerName();
    Alignment getAlignment();
    Integer getLevel();
    String getDeity();
    String getRace();
    Size getSize();
    String getGender();
    Integer getAge();

    void setName(String name);
    void setPlayerName(String playerName);
    void setAlignment(Alignment alignment);
    void setLevel(Integer level);
    void setDeity(String deity);
    void setRace(String race);
    void setSize(Size size);
    void setGender(String gender);
    void setAge(Integer age);

}
