package out.SelfStudy.flipgrid;

public class Atom {


    //Non-Static variables
    public int protonNumber;
    public int neutronNumber;
    public int electronNumber;


    //Static variables
    public static double atomicMassOfAProton;
    public static double atomicMassOfAnElectron;


    static { //Static block
        atomicMassOfAProton= 1; //Math.pow(10,-27)*1.67262192;
        atomicMassOfAnElectron =atomicMassOfAProton/1836;
    }

    public Atom(int protonNumber, int neutronNumber, int electronNumber) { // constructor
        this.protonNumber = protonNumber;
        this.neutronNumber = neutronNumber;
        this.electronNumber = electronNumber;

    }

    //non-static methods
    public int massNumber(){
        return protonNumber+neutronNumber;
    }

    public int calcCharge(){
        return protonNumber-electronNumber;
    }

    public boolean isIsotope(Atom atom){
        if (!(this.protonNumber==atom.protonNumber && this.protonNumber!= atom.neutronNumber)){
            return false;
        }
        return true;
    }


    //static method
    public static void displayAtomicMass(){
        System.out.println("Atomic mass of a proton or neutron is "+atomicMassOfAProton);
        System.out.println("Atomic mass of an electron is "+ atomicMassOfAnElectron+".\nIt is too small compared to mass of a proton or a neutron.Therefore, it is negligible in many calculations");
    }


        //static class
    static class Metals{
        public static void method(){
            System.out.println("This is the Metal class inside the Atom class.");

            displayAtomicMass();


        }


    }
}
