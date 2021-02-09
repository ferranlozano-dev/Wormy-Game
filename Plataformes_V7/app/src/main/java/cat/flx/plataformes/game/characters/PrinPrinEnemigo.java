package cat.flx.plataformes.game.characters;

import cat.flx.plataformes.engine.Game;
import cat.flx.plataformes.engine.GameObject;

public class PrinPrinEnemigo extends Enemy {
    // PrinPrin specific attributes
    private final int x0, x1;
    private int incX;

    // Constructor
    public PrinPrinEnemigo(Game game, int x0, int x1, int y) {
        super(game, x0, y);
        this.x0 = x0;
        this.x1 = x1;
        this.incX = 1;
        this.addTag("prinprinEnemigo");
        this.addSpriteSequence(0, 8105);    // WALKING RIGHT
        this.addSpriteSequence(1, 8104);    // WALKING LEFT
    }

    // PrinPrin moves horizontally between x0 and x1
    @Override public void physics(long deltaTime) {
        this.x += incX;
        if (x <= x0) {
            incX = 1;
            this.changeState(0);
        }
        if (x >= x1) {
            incX = -1;
            this.changeState(1);
        }
    }

    // The collision rect around the coin
    @Override public void updateCollisionRect() {
        collisionRect.set(x, y, x + 16, y + 30);
    }
}