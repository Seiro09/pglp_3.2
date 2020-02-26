package fr.uvsq21504875;

public class Vendeur extends Employe {
  private int commission;

  public Vendeur(int commission, int anciennete) {
    super(anciennete);
    this.commission = commission;
  }

  @Override
  public int calculSalaire() {
    return super.calculSalaire() + commission;
  }

}
