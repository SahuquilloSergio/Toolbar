/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.Sauky.Plugin_Toolbar;

import java.awt.Component;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.actions.Presenter;

@ActionID(
        category = "File",
        id = "org.Sauky.Plugin_Toolbar.Google_Action_Listener"
)
@ActionRegistration(
        lazy = false,
        iconBase = "org/Sauky/Plugin_Toolbar/google.png",
        displayName = "NOT-USED"
)
@ActionReference(
        path = "Toolbars/File",
        position = 10)

public final class Google_Action_Listener extends AbstractAction implements Presenter.Toolbar {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
    }
    
    @Override
    public Component getToolbarPresenter(){
        return new Google_Panel();
    }
}
