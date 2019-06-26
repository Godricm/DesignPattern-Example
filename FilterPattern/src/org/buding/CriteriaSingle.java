package org.buding;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-26 13:48
 * @description:
 **/
public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons=new ArrayList<>();
        for (Person person :persons){
            if(person.getMatitalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }

        return singlePersons;
    }
}
