package org.itmo.lab2.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Effect;

public class VenomDrench extends StatusMove{
  public VenomDrench() {
    super(Type.POISON, 0., 100.);
  }
  @Override
  protected void applyOppEffects(Pokemon p) {
    if(p.getCondition() == Status.POISON) {
      p.setMod(Stat.ATTACK, -1);
      p.setMod(Stat.SPECIAL_ATTACK, -1);
      p.setMod(Stat.SPEED, -1);
    }
  }
  @Override
  protected String describe() {
    return "увеличивает последствия от яда";
  }
}

