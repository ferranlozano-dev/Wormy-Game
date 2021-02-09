package cat.flx.plataformes.game;

import android.graphics.Canvas;
import android.graphics.Color;

import cat.flx.plataformes.engine.Game;
import cat.flx.plataformes.engine.GameObject;
import cat.flx.plataformes.engine.Scene;
import cat.flx.plataformes.engine.Touch;
import cat.flx.plataformes.engine.ui.Button;

public class GameOver extends Scene {
    Button button1, button2;
    // Constructor
    GameOver(Game game) {
        super(game);
        this.setScaleForFit(1000, 1000);
        button1 = new Button(game,  -20, 400, 600, 200, 80.0f, "Tornar a jugar");
        button1.setOnTouchEventListener(new GameObject.OnTouchEventListener() {
            @Override
            public boolean onTouch(GameObject gameObject, Touch touch) {
                Scene01 scene = new Scene01(GameOver.this.game);
                GameOver.this.game.loadScene(scene);
                return false;
            }
        }, true);
        button2 = new Button(game, 500 + 80, 400, 550, 200, 80.0f, "Sortir");
        button2.setOnTouchEventListener(new GameObject.OnTouchEventListener() {
            @Override
            public boolean onTouch(GameObject gameObject, Touch touch) {
                getGameEngine().finish();
                return false;
            }
        }, true);
        this.add(button1);
        this.add(button2);
    }

    // User input processing
    @Override public void processInput() { }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawColor(Color.BLACK);
        super.draw(canvas);
    }
}
