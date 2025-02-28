package org.TD.screens;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import org.TD.SamuraiBuild;
import org.TD.SamuraiBuild;

public class MainScreen implements Screen {
    private SamuraiBuild game;

    public MainScreen(SamuraiBuild game) {
        this.game = game;
    }

    @Override
    public void show() {
        // Initialisierungscode
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT); // Bildschirm löschen
        game.batch.begin();
        // Zeichenlogik hier
        game.batch.end();
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
    public void dispose() {}
}
