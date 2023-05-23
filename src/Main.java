import Models.Cargo;
import Models.Colaborador;
import Models.Nivel;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

import static Models.Colaborador.*;

public class Main {

    static ArrayList<Colaborador> colaboradores = new ArrayList<>();
    static ArrayList<Cargo> cargos = new ArrayList<>();

    public static void main(String[] args) {

        //Exercicio 03
        cargos.add(new Cargo("Desenvolvedor Python", 5500.0, Nivel.JUNIOR));
        cargos.add(new Cargo("Desenvolvedor Python", 7500.0, Nivel.PLENO));
        cargos.add(new Cargo("Desenvolvedor Fullstack", 8000.0, Nivel.PLENO));
        cargos.add(new Cargo("Desenvolvedor Front-End", 9500.0, Nivel.SENIOR));
        cargos.add(new Cargo("Desenvolvedor Back-End", 4500.0, Nivel.JUNIOR));
        cargos.add(new Cargo("Desenvolvedor Back-End", 6500.0, Nivel.PLENO));

        colaboradores.add(new Colaborador("Mônica",new Date(),cargos.get(0)));
        colaboradores.add(new Colaborador("Sérgio",new Date(),cargos.get(1)));
        colaboradores.add(new Colaborador("Julia",new Date(),cargos.get(1)));
        colaboradores.add(new Colaborador("Denise",new Date(),cargos.get(2)));
        colaboradores.add(new Colaborador("Pedro",new Date(),cargos.get(0)));

        //colaboradorSemDesligamento(colaboradores);
        //listarColaboradorPorCargo(cargos, colaboradores);

        //Exercicio 7
        //adicionarColaborador(novoColaborador());
//        Colaborador colaborador = novoColaborador();
//        if (colaborador != null){
//            adicionarColaborador(colaborador);
//        }

        //Exercicio 8
        //desligarColaborador();

        //Exercicio 9
        //promoverColaboradorCargo(cargos, colaboradores);

        //Exercicio 10
        ordemDecrescenteSalario(colaboradores);
        colaboradores.forEach(System.out::println);
    }

    public static Colaborador novoColaborador(){
        String nome = JOptionPane.showInputDialog(null, "Digite o nome do novo colaborador:");
        Date dtAdmissao = new Date();
        Cargo cargo = (Cargo) JOptionPane.showInputDialog(
                null,
                "Selecione um cargo",
                "Seleção do cargo",
                JOptionPane.PLAIN_MESSAGE,
                null,
                cargos.toArray(),
                cargos.get(0)
        );
        Colaborador colaborador = new Colaborador(nome, dtAdmissao, cargo);
        System.out.println("Novo colaborador " + colaborador.getNome() + " foi adicionado com sucesso!");
        return colaborador;
    }
    public static void adicionarColaborador(Colaborador colaborador){
        colaboradores.add(colaborador);
    }
    public static void desligarColaborador(){
        JOptionPane.showMessageDialog(null, "Desligar próximo colaborador");
        Colaborador colaborador = (Colaborador) JOptionPane.showInputDialog(
                null,
                "Selecione o colaborador",
                "Seleção do Caloborador",
                JOptionPane.PLAIN_MESSAGE,
                null,
                colaboradores.toArray(),
                colaboradores.get(0)
        );
        colaborador.setDtDesligamento(new Date());
        System.out.println("Colaborador descadastrado com sucesso em " + colaborador.getDtDesligamento());
    }

    public static void promoverColaboradorCargo(ArrayList<Cargo> cargos, ArrayList<Colaborador> colaboradores){
        Cargo cargo = (Cargo) JOptionPane.showInputDialog(
                null,
                "Selecione um cargo",
                "Seleção do cargo",
                JOptionPane.PLAIN_MESSAGE,
                null,
                cargos.toArray(),
                cargos.get(0)
        );
        Colaborador colaborador = (Colaborador) JOptionPane.showInputDialog(
                null,
                "Selecione o colaborador",
                "Seleção do Caloborador",
                JOptionPane.PLAIN_MESSAGE,
                null,
                colaboradores.toArray(),
                colaboradores.get(0)
        );
        if (cargo.getSalarioBase() < colaborador.getSalario()){
            System.out.println(colaborador.getNome() + " foi promovido para o cargo de "
                    + cargo.getDescricao() + ".");
        }
//        System.out.println(cargo.getSalarioBase());
//        System.out.println(colaborador.getSalario());
    }

    public static void ordemDecrescenteSalario(ArrayList<Colaborador> colaboradores){
        Collections.sort(colaboradores, new Comparator<Colaborador>() {
            @Override
            public int compare(Colaborador o1, Colaborador o2) {
                return  o2.getSalario().compareTo(o1.getSalario());
            }

        });

    }



}