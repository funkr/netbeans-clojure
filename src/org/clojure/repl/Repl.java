/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.clojure.repl;
import org.openide.modules.OnStart;

@OnStart
public class Repl implements Runnable{
   @Override
    public void run() {
        //new CarService().process("Runnable Honda");
    }
}
