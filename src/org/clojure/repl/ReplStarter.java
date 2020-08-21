/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.clojure.repl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "Tool",
        id = "org.clojure.repl.ReplStarter"
)
@ActionRegistration(
        iconBase = "org/clojure/repl/clojure-dark-blue-icon-terminal-16.png",
        displayName = "#CTL_ReplStarter"
)
@ActionReferences({
    @ActionReference(path = "Menu/Tools", position = 195),
    @ActionReference(path = "Toolbars/Build", position = 312),
    @ActionReference(path = "Shortcuts", name = "D-R")
})
@Messages("CTL_ReplStarter=Start Repl")
public final class ReplStarter implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
    }
}
