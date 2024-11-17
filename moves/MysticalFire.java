package org.itmo.lab2.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;

public class MysticalFire extends SpecialMove{
  public MysticalFire() {
    super(Type.FIRE, 75., 100.);
  }
  @Override
  protected void applyOppEffects(Pokemon p) {
    p.setMod(Stat.SPECIAL_ATTACK, -1);
  }
  @Override
  protected String describe() {
    return "атакует магическим огнем";
  }
}

