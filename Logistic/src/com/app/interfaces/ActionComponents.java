package com.app.interfaces;

import java.awt.Component;

@FunctionalInterface
public interface ActionComponents {

    public void execute(Component obj);

    static void deactive(Component obj) {
        obj.setEnabled(false);
    }
    
    static void active(Component obj){
        obj.setEnabled(true);
    }
}
