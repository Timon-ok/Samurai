package org.TD;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import org.TD.screens.MainScreen;

public class SamuraiBuild extends Game {
    public SpriteBatch batch;

    @Override
    public void create() {
        batch = new SpriteBatch();
        this.setScreen(new MainScreen(this)); // Startet mit dem MainScreen
    }

    @Override
    public void render() {
        super.render(); // Rendert den aktuellen Screen
    }

    @Override
    public void dispose() {
        batch.dispose(); // Speicher aufräumen
    }
}
