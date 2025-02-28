package org.TD.assets.input;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import org.TD.game.Player;

public class InputHandler implements InputProcessor {
    private final Player player;
    private boolean moving = false;

    public InputHandler(Player player) {
        this.player = player;
    }

    @Override
    public boolean keyDown(int keycode) {
        moving = true; // Spieler bewegt sich, also nicht im Idle-Zustand
        switch (keycode) {
            case Input.Keys.W:
                player.moveUp();
                break;
            case Input.Keys.A:
                player.moveLeft();
                break;
            case Input.Keys.S:
                player.moveDown();
                break;
            case Input.Keys.D:
                player.moveRight();
                break;
        }
        return true;
    }

    @Override
    public boolean keyUp(int keycode) {
        moving = false; // Bewegung gestoppt
        return true;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(float amountX, float amountY) {
        return false;
    }

    public boolean isMoving() {
        return moving;
    }
}

