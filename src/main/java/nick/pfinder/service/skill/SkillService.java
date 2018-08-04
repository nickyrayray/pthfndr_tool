package nick.pfinder.service.skill;

import nick.pfinder.model.character.base.Character;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by nickyrayray on 7/22/18.
 */
public class SkillService {

    public Integer getSkillScore(Character character, String skill) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        String capitalizedSkillName = skill.substring(0,1).toUpperCase() + skill.substring(1).toLowerCase();
        String methodName = "get" + capitalizedSkillName;
        Method getter = character.getClass().getMethod(methodName);
        Integer ranks = (int)getter.invoke(character);
        return ranks;
    }
}
