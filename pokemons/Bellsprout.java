package org.itmo.lab2.pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import org.itmo.lab2.moves.SweetScent;
import org.itmo.lab2.moves.Swagger;

public class Bellsprout extends Pokemon{
  public Bellsprout() {
    super();
    double hp = 50;
    double att = 75;
    double def = 35;
    double spAtt = 70;
    double spDef = 30;
    double speed = 40;
    setStats(hp, att, def, spAtt, spDef, speed);
    addType(Type.GRASS);
    addMove(new SweetScent());
    addMove(new Swagger());
  }

  public Bellsprout(java.lang.String name, int level) {
    super(name, level);
    double hp = calcStat(50, 304, level);
    double att = calcStat(75, 273, level);
    double def = calcStat(35, 185, level);
    double spAtt = calcStat(70, 262, level);
    double spDef = calcStat(30, 174, level);
    double speed = calcStat(40, 196, level);
    setStats(hp, att, def, spAtt, spDef, speed);
    addType(Type.GRASS);
    addMove(new SweetScent());
    addMove(new Swagger());
  }

  public double calcStat(double minStat, double maxStat, int level) {
    return (maxStat - minStat) * level / 100 + minStat;
  }
}

