import Models.Cargo;
import Models.Colaborador;
import Models.Nivel;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        ArrayList<Colaborador> colaboradores = new ArrayList<>();
        ArrayList<Cargo> cargos = new ArrayList<>();

        cargos.add(new Cargo("Desenvolvedor Python", 5500.0, Nivel.JUNIOR));
        cargos.add(new Cargo("Desenvolvedor Fullstack", 7500.0, Nivel.PLENO));
        cargos.add(new Cargo("Desenvolvedor Front-End", 9500.0, Nivel.SENIOR));

        colaboradores.add(new Colaborador("Mônica",new Date(),cargos.get(0)));
        colaboradores.add(new Colaborador("Sérgio",new Date(),cargos.get(1)));
        colaboradores.add(new Colaborador("Julia",new Date(),cargos.get(2)));




    }

}