package org.itmo.lab2.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Effect;

public class PoisonPowder extends StatusMove{
  public PoisonPowder() {
    super(Type.NORMAL, 0., 75.);
  }
  @Override
  protected void applyOppEffects(Pokemon p) {
    Effect.poison(p);
  }
  @Override
  protected String describe() {
    return "обескураживает противника";
  }
}

