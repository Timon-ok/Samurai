package org.TD.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Array;

public class Player {
    private Animation<TextureRegion> idleAnimation;
    private float stateTime;
    private Texture[] idleFramesTextures;
    private float x, y; // Position des Spielers
    private float speed = 200f; // Geschwindigkeit des Spielers

    public Player() {
        idleFramesTextures = new Texture[14];
        TextureRegion[] idleFrames = new TextureRegion[14];

        for (int i = 0; i < 14; i++) {
            idleFramesTextures[i] = new Texture(Gdx.files.internal("textures/sprites.Samurai #3 2D/Sprites/IDLE/IDLE_" + (i + 1) + ".png"));
            idleFrames[i] = new TextureRegion(idleFramesTextures[i]);
        }

        idleAnimation = new Animation<>(0.1f, idleFrames);
        stateTime = 0f;

        x = 100; // Startposition
        y = 100;
    }

    public void update(float delta, boolean moving) {
        stateTime += delta;
        if (!moving) {
            // Keine Bewegung, zeige Idle-Animation
            return;
        }
    }

    public void moveUp() {
        y += speed * Gdx.graphics.getDeltaTime();
    }

    public void moveDown() {
        y -= speed * Gdx.graphics.getDeltaTime();
    }

    public void moveLeft() {
        x -= speed * Gdx.graphics.getDeltaTime();
    }

    public void moveRight() {
        x += speed * Gdx.graphics.getDeltaTime();
    }

    public void render(Batch batch) {
        TextureRegion currentFrame = idleAnimation.getKeyFrame(stateTime, true);
        batch.draw(currentFrame, x, y);
    }

    public void dispose() {
        for (Texture texture : idleFramesTextures) {
            texture.dispose();
        }
    }
}
