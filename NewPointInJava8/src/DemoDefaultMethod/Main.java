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
public class Main {

    public static void main(String[] args) {
        Animal tiger = new Tiger();
        System.out.print("How does tiger eat: ");
        tiger.eatable();
        System.out.print("\nHow tiger slepp: ");
        tiger.sleepable();
        System.out.println("--------------------------");
        String howTigerKill = tiger.killAnother();
        System.out.println(howTigerKill);
        System.out.println("--------------------------");
        System.out.println("Tiger can jump? : " + tiger.jump());
        System.out.println("--------------------------");
        System.out.print("Tiger closes with people: ");
        tiger.closedWithPeople();
//
        Cat tiger2 = new Tiger();
        System.out.println(tiger2.jump());
        
    }
}
