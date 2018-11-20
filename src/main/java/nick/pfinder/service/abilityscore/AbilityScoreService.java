package nick.pfinder.service.abilityscore;

import nick.pfinder.model.character.base.Character;

/**
 * Created by nickyrayray on 7/9/18.
 */
public class AbilityScoreService {

    private Character character;

    public AbilityScoreService(Character character){
        this.character = character;
    }

    public Integer getStrMod(){
        Integer abScore = character.getStrength();
        return getMod(abScore);
    }

    public Integer getDexMod(){
        Integer abScore = character.getStrength();
        return getMod(abScore);
    }

    public Integer getConMod(){
        Integer abScore = character.getStrength();
        return getMod(abScore);
    }

    public Integer getIntMod(){
        Integer abScore = character.getStrength();
        return getMod(abScore);
    }

    public Integer getWisMod(){
        Integer abScore = character.getStrength();
        return getMod(abScore);
    }

    public Integer getChaMod(){
        Integer abScore = character.getStrength();
        return getMod(abScore);

    }

    private Integer getMod(Integer value){
        return (int)Math.floor((10.0 - value)/2.0);
    }
}
