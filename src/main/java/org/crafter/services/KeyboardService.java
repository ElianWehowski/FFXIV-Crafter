package org.crafter.services;

import java.awt.*;

public class KeyboardService {

    Robot keyBoardHandlerBot = new Robot();

    public KeyboardService() throws AWTException {
    }


    public void pressKey(int keyPressed) throws InterruptedException {
        keyBoardHandlerBot.keyPress(keyPressed);
        Thread.sleep(10);
        keyBoardHandlerBot.keyRelease(keyPressed);
        Thread.sleep(10);
    }

    public void pressKeyNewCraft(int keyPressed) throws InterruptedException {
        keyBoardHandlerBot.keyPress(keyPressed);
        Thread.sleep(10);
        keyBoardHandlerBot.keyRelease(keyPressed);
        Thread.sleep(10);
        keyBoardHandlerBot.keyPress(keyPressed);
        Thread.sleep(10);
        keyBoardHandlerBot.keyRelease(keyPressed);
        Thread.sleep(10);
        keyBoardHandlerBot.keyPress(keyPressed);
        Thread.sleep(10);
        keyBoardHandlerBot.keyRelease(keyPressed);
        Thread.sleep(10);
        keyBoardHandlerBot.keyPress(keyPressed);
        Thread.sleep(10);
        keyBoardHandlerBot.keyRelease(keyPressed);
        Thread.sleep(10);
    }
}
