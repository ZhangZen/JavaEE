/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoLambda;

/**
 *
 * @author Zhang
 */
public class ThreadUsingLambdaExpression {

    public static void main(String[] args) {
        //in a normal way
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("I'm a thread");
            }
        });
        thread.start();
        // using lambda expression
        Thread thread1 = new Thread(() -> {
            System.out.println("I'm another thread");
        });
        thread1.start();
    }
}
