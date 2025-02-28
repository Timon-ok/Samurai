package org.TD;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;

public class Samurai {
    public static void main (String[] arg) {
        Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
        config.setTitle("Samurai Game"); // Titel des Fensters
        // config.setWindowedMode(1280, 720); // Fenstergröße
        config.setMaximized(true); // Vollbild
        config.setResizable(true); // Ob das Fenster veränderbar ist
        config.useVsync(true); // VSync aktivieren

        new Lwjgl3Application(new SamuraiBuild(), config);
    }
}
