package org.itmo.lab2.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;

public class DoubleTeam extends StatusMove{
  public DoubleTeam() {
    super(Type.NORMAL, 0., 100.);
  }
  @Override
  protected void applySelfEffects(Pokemon p) {
    p.setMod(Stat.EVASION, 1);
  }
  @Override
  protected String describe() {
    return "становится увертлевей";
  }
}

