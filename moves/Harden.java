package org.itmo.lab2.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;

public class Harden extends StatusMove{
  public Harden() {
    super(Type.NORMAL, 0., 100.);
  }
  @Override
  protected void applySelfEffects(Pokemon p) {
    p.setMod(Stat.DEFENSE, 1);
  }
  @Override
  protected String describe() {
    return "встает в защитную стойку";
  }
}

