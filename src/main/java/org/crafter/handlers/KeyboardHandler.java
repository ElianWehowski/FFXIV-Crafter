package org.crafter.handlers;

import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;

public class KeyboardHandler {

    Robot keyBoardHandlerBot = new Robot();

    public KeyboardHandler() throws AWTException {
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
