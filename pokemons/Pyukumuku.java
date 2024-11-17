package org.itmo.lab2.pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import org.itmo.lab2.moves.Confide;
import org.itmo.lab2.moves.Tickle;
import org.itmo.lab2.moves.Harden;
import org.itmo.lab2.moves.VenomDrench;


public class Pyukumuku extends Pokemon{
  public Pyukumuku() {
    super();
    double hp = 55;
    double att = 60;
    double def = 130;
    double spAtt = 30;
    double spDef = 130;
    double speed = 5;
    setStats(hp, att, def, spAtt, spDef, speed);
    addType(Type.WATER);
    addMove(new Confide());
    addMove(new Tickle());
    addMove(new Harden());
    addMove(new VenomDrench());
  }

  public Pyukumuku(java.lang.String name, int level) {
    super(name, level);
    double hp = calcStat(55, 314, level);
    double att = calcStat(60, 240, level);
    double def = calcStat(130, 394, level);
    double spAtt = calcStat(30, 174, level);
    double spDef = calcStat(130, 394, level);
    double speed = calcStat(5, 119, level);
    setStats(hp, att, def, spAtt, spDef, speed);
    addType(Type.WATER);
    addMove(new Confide());
    addMove(new Tickle());
    addMove(new Harden());
    addMove(new VenomDrench());
  }

  public double calcStat(double minStat, double maxStat, int level) {
    return (maxStat - minStat) * level / 100 + minStat;
  }
}

