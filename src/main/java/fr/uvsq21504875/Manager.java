package fr.uvsq21504875;

public class Manager extends Employe{
    private int NbPersonnesDirigees;

    public Manager(int NbPersonnesDirigees, int anciennete){
        super(anciennete);
        this.anciennete=anciennete;
    }

    @Override
    public int calculSalaire(){
        return super.calculSalaire()+NbPersonnesDirigees*100;
    }
}
