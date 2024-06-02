package org.crafter;

import org.crafter.services.KeyboardService;
import org.crafter.services.MouseService;

import java.awt.*;

public class Main {
    static KeyboardService keyboardService;
    static MouseService mouseService;

    static {
        try {
            keyboardService = new KeyboardService();
            mouseService = new MouseService();

        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
    }

    public Main() {
    }

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(1000);
     handleCraft();
    }
    public static void handleCraft() throws InterruptedException {
        for (int i = 0; i < 16; i++) {
            mouseService.leftClick();
            startNewCraft();
            Thread.sleep(2000);
            pressKeyBeginMacro();
            Thread.sleep(40000);
            mouseService.leftClick();
        }
    }

    public static void startNewCraft() throws InterruptedException {
        keyboardService.pressKeyNewCraft(96);
    }

    public static void pressKeyBeginMacro() throws InterruptedException {
        keyboardService.pressKeyNewCraft(70);
    }
}