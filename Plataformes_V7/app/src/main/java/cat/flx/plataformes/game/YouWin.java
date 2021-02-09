package cat.flx.plataformes.game;

import android.graphics.Canvas;
import android.graphics.Color;

import cat.flx.plataformes.engine.Game;
import cat.flx.plataformes.engine.GameObject;
import cat.flx.plataformes.engine.Scene;
import cat.flx.plataformes.engine.Touch;
import cat.flx.plataformes.engine.ui.Button;

public class YouWin extends Scene {
    Button button1;

    // Constructor
    YouWin(Game game) {
        super(game);
        this.setScaleForFit(1000, 1000);
        button1 = new Button(game, 500 - 240, 400, 550, 200, 80.0f, "¡Has guanyat!");
        button1.setOnTouchEventListener(new GameObject.OnTouchEventListener() {
            @Override
            public boolean onTouch(GameObject gameObject, Touch touch) {
                Scene01 scene = new Scene01(YouWin.this.game);
                YouWin.this.game.loadScene(scene);
                return false;
            }
        }, true);
        this.add(button1);
    }



// User input processing
@Override
public void processInput(){
        }

@Override
public void draw(Canvas canvas){
        canvas.drawColor(Color.BLACK);
        super.draw(canvas);
        }
        }
