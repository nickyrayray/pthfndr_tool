package nick.pfinder.service.abilityscore;

import nick.pfinder.model.character.base.Character;

/**
 * Created by nickyrayray on 7/9/18.
 */
public class AbilityScoreService {

    public Integer getStrMod(Character character){
        Integer abScore = character.getStrength();
        return getMod(abScore);
    }

    public Integer getDexMod(Character character){
        Integer abScore = character.getStrength();
        return getMod(abScore);
    }

    public Integer getConMod(Character character){
        Integer abScore = character.getStrength();
        return getMod(abScore);
    }

    public Integer getIntMod(Character character){
        Integer abScore = character.getStrength();
        return getMod(abScore);
    }

    public Integer getWisMod(Character character){
        Integer abScore = character.getStrength();
        return getMod(abScore);
    }

    public Integer getChaMod(Character character){
        Integer abScore = character.getStrength();
        return getMod(abScore);

    }

    private Integer getMod(Integer value){
        return (int)Math.floor((10.0 - value)/2.0);
    }
}
