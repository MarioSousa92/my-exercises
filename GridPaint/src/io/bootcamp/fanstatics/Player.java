package io.bootcamp.fanstatics;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Player implements KeyboardHandler {

    private Rectangle playerRect;
    private Keyboard keyboard;
    private Grid grid;
    private int playerX = 0;
    private int playerY = 0;

    public Player() {
        playerRect = new Rectangle(40, 40, 20, 20);
        playerRect.setColor(Color.RED);
        playerRect.fill();

        keyboard = new Keyboard(this);
        initkeyboard();
        }

        private void initkeyboard() {

        KeyboardEvent up = new KeyboardEvent();
        up.setKey(KeyboardEvent.KEY_UP);
        up.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(up);

        KeyboardEvent down = new KeyboardEvent();
        down.setKey(KeyboardEvent.KEY_DOWN);
        down.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(down);

        KeyboardEvent right = new KeyboardEvent();
        right.setKey(KeyboardEvent.KEY_RIGHT);
        right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(right);

        KeyboardEvent left = new KeyboardEvent();
        left.setKey(KeyboardEvent.KEY_LEFT);
        left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(left);
        }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
           switch (keyboardEvent.getKey()) {
               case KeyboardEvent.KEY_UP:
                   if (playerRect.getX() != grid.) {

                   }
                   playerRect.translate(0, -playerRect.getHeight());


                   break;

               case KeyboardEvent.KEY_DOWN:
                   playerRect.translate(0, playerRect.getHeight());
                   break;

               case KeyboardEvent.KEY_RIGHT:
                   playerRect.translate(playerRect.getWidth(), 0);
                   break;

               case KeyboardEvent.KEY_LEFT:
                   playerRect.translate(-playerRect.getWidth(), 0);
                   break;
           }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}