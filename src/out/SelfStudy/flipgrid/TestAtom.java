package out.SelfStudy.flipgrid;

public class TestAtom {
    public static void main(String[] args) {

        Atom uranium = new Atom(92,146,92);

        Atom uranium236 = new Atom(92,144,92);

        boolean isIsotope= uranium.isIsotope(uranium236);

        System.out.println("isIsotope = " + isIsotope);

        System.out.println("Charge: "+uranium.calcCharge());

        System.out.println("MassNumber: "+uranium.massNumber());


        Atom.displayAtomicMass();




        Atom.Metals.method();



    }





}
