package cat.flx.plataformes.game.characters;

import cat.flx.plataformes.engine.Game;
import cat.flx.plataformes.engine.GameObject;
import cat.flx.plataformes.engine.SpriteSequence;

// A coin to be collected by the player
public class Vida extends GameObject {

    // Constructor
    public Vida(Game game, int x, int y) {
        super(game, x, y);
        this.addTag("vida");
        this.addSpriteSequence(0, 6000);
        SpriteSequence spriteSequence = getCurrentSpriteSequence();
        spriteSequence.randomizeSprite();
    }

    // A coin doesn't move
    @Override public void physics(long deltaTime) { }

    // The collision rect around the coin
    @Override public void updateCollisionRect() {
        collisionRect.set(x, y, x + 7, y + 7);
    }
}

