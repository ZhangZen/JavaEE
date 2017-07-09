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
public class DemoDefaultMethod {
    public interface Test {
      public void setup();
      public default void run () {
        System.out.println("Hello Tester");
      }
    }

    public static void main(String[] args) {
      Test test = new Test() {
        @Override
        public void setup() {
          System.out.println("Setup environment in here");
        }
      };
      test.run();
    }
}
