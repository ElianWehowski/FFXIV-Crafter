package org.crafter;

import org.crafter.handlers.KeyboardHandler;
import org.crafter.handlers.MouseHandler;

import java.awt.*;

public class Main {
    static KeyboardHandler keyboardHandler;
    static MouseHandler mouseHandler;

    static {
        try {
            keyboardHandler = new KeyboardHandler();
            mouseHandler = new MouseHandler();

        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
    }

    public Main() throws AWTException {
    }

    public static void main(String[] args) throws AWTException, InterruptedException {
        Thread.sleep(1000);
     handleCraft();
    }
    public static void handleCraft() throws InterruptedException {
        for (int i = 0; i < 50; i++) {
            mouseHandler.leftClick();
            startNewCraft();
            Thread.sleep(2000);
            pressKeyBeginMacro();
            Thread.sleep(40000);
            mouseHandler.leftClick();
        }
    }

    public static void startNewCraft() throws InterruptedException {
        keyboardHandler.pressKeyNewCraft(96);
    }

    public static void pressKeyBeginMacro() throws InterruptedException {
        keyboardHandler.pressKeyNewCraft(70);
    }
}