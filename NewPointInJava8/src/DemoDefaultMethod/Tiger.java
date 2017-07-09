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
public class Tiger extends Cat implements Animal, Cretures {

    public Tiger() {
    }

    @Override
    public void eatable() {
        System.out.println("Eating meat");
    }

    @Override
    public void drinkable() {
        System.out.println("Drink water");
    }

    @Override
    public void movingAbility() {
        System.out.println("Moving by runing");
    }

    @Override
    public void sleepable() {
        Animal.super.sleepable(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Lied sleep");
    }

    @Override
    public String jump() {
        Animal.super.jump();
        return "Yes";
    }

    @Override
    public void closedWithPeople() {
//        Animal.super.closedWithPeople();
        System.out.println("No");
    }

    @Override
    public String killAnother() {
        return super.killAnother(); //To change body of generated methods, choose Tools | Templates.
    }

//    @Override
//    public String killAnother() {
//        return Cretures.super.killAnother(); //To change body of generated methods, choose Tools | Templates.
//    }
    // khi 2 interface co chung 1 ham default cung ten, thi class implement interface do chi duoc cai de 1 trong 2 ham,
//    khong duoc cai de ca 2, neu cai de ca 2 se gay ra loi
    @Override
    public void traoDoiChat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
