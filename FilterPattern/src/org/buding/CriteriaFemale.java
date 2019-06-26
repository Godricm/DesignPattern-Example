package org.buding;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-26 13:39
 * @description:
 **/
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
       List<Person> femalePersons=new ArrayList<>();
       for (Person person :persons){
           if(person.getGender().equalsIgnoreCase("FEMALE")){
               femalePersons.add(person);
           }
       }
       return femalePersons;
    }
}
