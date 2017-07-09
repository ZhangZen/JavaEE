/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoDefaultMethod;

/**
 *
 * @author Zhang
 */
public interface Animal {

    void eatable();

    void drinkable();

    void movingAbility();

    default void sleepable() {
        System.out.println("Some animals can sleep.... (interface)");
//        Object.getClass(); => loi, 1 method default se khong duoc cai de bat ki phuong thuc nao trong class Object (based class)
    };
    
    default String killAnother() {
        return "Maybe";
    };
    
    default String jump() {
        return "Maybe";
    };
    default void closedWithPeople() {
        System.out.println("Maybe");
    };
}
