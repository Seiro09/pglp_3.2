package fr.uvsq21504875;

public abstract class Employe {

  protected int salaire = 1500;
  protected int anciennete;

  public Employe(int anciennete) {
    this.anciennete = anciennete;
  }

  public int calculSalaire() {
    return salaire + anciennete * 20;
  }

}
