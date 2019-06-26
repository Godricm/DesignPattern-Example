package org.buding;

import java.util.List;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-26 13:38
 * @description:标准
 **/
public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
