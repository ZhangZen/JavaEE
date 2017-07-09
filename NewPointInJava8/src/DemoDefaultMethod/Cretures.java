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
public interface Cretures {

    default String killAnother() {
        return "Maybe";
    };
    
    void traoDoiChat();
}
