package org.itmo.lab2.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Status;

public class Facade extends PhysicalMove{
  public Facade() {
    super(Type.NORMAL, 70., 100.);
  }
  @Override
  protected double calcCriticalHit(Pokemon att, Pokemon def) {
    if (def.getCondition() == Status.BURN || def.getCondition() == Status.PARALYZE || def.getCondition() == Status.POISON) {
      return 2.;
    }
    return 1.;
  }
  @Override
  protected String describe() {
    return "делает обычный удар";
  }
}

