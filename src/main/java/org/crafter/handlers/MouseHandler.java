package org.crafter.handlers;

import java.awt.*;
import java.awt.event.MouseEvent;

public class MouseHandler extends MouseEvent {
    public MouseHandler(Component source, int id, long when, int modifiers, int x, int y, int clickCount, boolean popupTrigger, int button) {
        super(source, id, when, modifiers, x, y, clickCount, popupTrigger, button);
    }
}
