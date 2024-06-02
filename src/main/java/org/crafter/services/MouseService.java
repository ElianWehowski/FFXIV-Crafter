package org.crafter.services;

import java.awt.*;
import java.awt.event.InputEvent;

public class MouseService {

    Robot mouseHandlerBot = new Robot();

    public MouseService() throws AWTException {
    }


    public void leftClick() throws InterruptedException {
        mouseHandlerBot.delay(100);
        mouseHandlerBot.mouseMove(1681, 660);
        mouseHandlerBot.delay(100);
        mouseHandlerBot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        mouseHandlerBot.delay(100);
        mouseHandlerBot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        mouseHandlerBot.delay(100);
    }


}
