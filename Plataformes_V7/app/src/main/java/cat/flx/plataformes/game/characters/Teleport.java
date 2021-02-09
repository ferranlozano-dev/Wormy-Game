package cat.flx.plataformes.game.characters;

import cat.flx.plataformes.engine.Game;
import cat.flx.plataformes.engine.GameObject;
import cat.flx.plataformes.engine.SpriteSequence;

public class Teleport extends GameObject {

    private final int x1, y1;

    // Constructor
    public Teleport(Game game, int x0, int y0, int x1, int y1) {
        super(game, x0, y0);
        this.x1 = x1;
        this.y1 = y1;
        this.addTag("teleport");
    }

    public int getDestinationX() { return x1; }
    public int getDestinationY() { return y1; }

    @Override public void physics(long deltaTime) { }

    @Override public void updateCollisionRect() {
        collisionRect.set(x, y, x + 16, y + 16);
    }
}
