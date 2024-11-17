package org.itmo.lab2.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Effect;

public class Confide extends StatusMove{
  public Confide() {
    super(Type.NORMAL, 0., 100.);
  }
  @Override
  protected void applyOppEffects(Pokemon p) {
    p.setMod(Stat.ATTACK, -1);
  }
  @Override
  protected String describe() {
    return "уменьшает атаку врага";
  }
}

