package org.TD.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import org.TD.assets.input.InputHandler;
import org.TD.game.Player;

public class GameScreen implements Screen {
    private Player player;
    private SpriteBatch batch;
    private InputHandler inputHandler;

    @Override
    public void show() {
        player = new Player();
        batch = new SpriteBatch();
        inputHandler = new InputHandler(player);
        Gdx.input.setInputProcessor(inputHandler);
    }

    @Override
    public void render(float delta) {
        player.update(delta, inputHandler.isMoving());

        batch.begin();
        player.render(batch);
        batch.end();
    }

    @Override
    public void resize(int width, int height) {}

    @Override
    public void pause() {}

    @Override
    public void resume() {}

    @Override
    public void hide() {}

    @Override
    public void dispose() {
        player.dispose();
        batch.dispose();
    }
}

