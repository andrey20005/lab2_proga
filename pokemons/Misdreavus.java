package org.itmo.lab2.pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import org.itmo.lab2.moves.Facade;
import org.itmo.lab2.moves.Psychic;
import org.itmo.lab2.moves.DoubleTeam;

public class Misdreavus extends Pokemon{
  public Misdreavus() {
    super();
    double hp = 60; 
    double att = 60;
    double def = 60;
    double spAtt = 85;
    double spDef = 85;
    double speed = 85;
    setStats(hp, att, def, spAtt, spDef, speed);
    addType(Type.GRASS);
    addMove(new Facade());
    addMove(new Psychic());
    addMove(new DoubleTeam());
  }

  public Misdreavus(java.lang.String name, int level) {
    super(name, level);
    double hp = calcStat(60, 324, level);
    double att = calcStat(60, 240, level);
    double def = calcStat(60, 240, level);
    double spAtt = calcStat(85, 295, level);
    double spDef = calcStat(85, 295, level);
    double speed = calcStat(85, 295, level);
    setStats(hp, att, def, spAtt, spDef, speed);
    addType(Type.GRASS);
    addMove(new Facade());
    addMove(new Psychic());
    addMove(new DoubleTeam());
  }

  public double calcStat(double minStat, double maxStat, int level) {
    return (maxStat - minStat) * level / 100 + minStat;
  }
}

