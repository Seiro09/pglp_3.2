package fr.uvsq21504875;

public class Manager extends Employe {
  private int nbPersonnesDirigees;

  public Manager(int nbPersonnes, int anciennete) {
    super(anciennete);
    this.nbPersonnesDirigees = nbPersonnes;
  }

  @Override
  public int calculSalaire() {
    return super.calculSalaire() + nbPersonnesDirigees * 100;
  }
}
