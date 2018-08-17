package nick.pfinder.service.skill;

import nick.pfinder.model.character.base.Character;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by nickyrayray on 7/22/18.
 */
public class SkillService {

    public Integer getSkillScore(Character character, String skill) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        String methodName = getMethodNameFromSkillString(skill);
        Method getter = character.getClass().getMethod(methodName);
        return (int)getter.invoke(character);
    }

    private String getMethodNameFromSkillString(String skillName){
        String skillNameFormatted = "get";
        for(String s : skillName.split(" ")){
            String capitalizedPart= s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
            skillNameFormatted += capitalizedPart;
        }
        return skillNameFormatted;
    }

    private boolean isSkillAClassSkill(Character character, String skill){

    }
}
