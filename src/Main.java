import ejercioAnimales.*;

public class Main {

    public static void main(String[] args) {
        Perro perro = new Perro("Goffy", 35.5D, 3, "Perro");
        Pato pato = new Pato("Donald", 4D, 1,"Pato");
        Pez pez = new Pez("Flounders", 0.5D,1 ,"Pez");

        Animal[] animales = {perro, pez, pato};
        Nadador[] nadadores = {perro, pez, pato};
        Corredor[] corredores = {perro, pato};
        Volador[] voladores = {pato};

        for(int i = 0; i < animales.length; i++) {
            animales[i].darInfo();
        }
        for(int i = 0; i < nadadores.length; i++) {
            System.out.println("Nadadores");
            nadadores[i].nadar();
        }
        for(int i = 0; i < voladores.length; i++) {
            System.out.println("Voladores");
            voladores[i].volar();
        }
        for(int i = 0; i < corredores.length; i++) {
            System.out.println("Corredores");
            corredores[i].correr();
        }



    }
}
