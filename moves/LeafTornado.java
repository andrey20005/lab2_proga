package org.itmo.lab2.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;

public class LeafTornado extends PhysicalMove{
  public LeafTornado() {
    super(Type.GRASS, 65., 90.);
  }
  @Override
  protected void applyOppEffects(Pokemon p) {
    if(Math.random() < 0.3) {      
      p.setMod(Stat.ACCURACY, -1);
    }
  }
  @Override
  protected String describe() {
    return "атакует лиственным торнадо";
  }
}

