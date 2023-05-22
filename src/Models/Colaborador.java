package Models;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;

public class Colaborador {
    private String nome;
    private Date dtAdmissao;
    private Date dtDesligamento;
    private Cargo cargo;
    private Double salario;

    public Colaborador(String nome, Date dtAdmissao, Cargo cargo) {
        this.nome = nome;
        this.dtAdmissao = dtAdmissao;
        this.cargo = cargo;
        this.salario = cargo.getSalarioBase();
    }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public Date getDtAdmissao() { return dtAdmissao; }
    public void setDtAdmissao(Date dtAdmissao) { this.dtAdmissao = dtAdmissao; }
    public Date getDtDesligamento() { return dtDesligamento; }
    public void setDtDesligamento(Date dtDesligamento) { this.dtDesligamento = dtDesligamento; }
    public Cargo getCargo() { return cargo; }
    public void setCargo(Cargo cargo) { this.cargo = cargo; }
    public Double getSalario() { return salario; }
    public void setSalario(Double salario) { this.salario = salario; }
    @Override
    public String toString() {
        return "Colaborador{" +
                "nome='" + nome + '\'' +
                ", dtAdmissao=" + dtAdmissao +
                ", dtDesligamento=" + dtDesligamento +
                ", cargo=" + cargo +
                ", salario=" + salario +
                '}';
    }

    //Faça um método para listar colaboradores da lista de colaboradores que não possuem data de desligamento.
    public static void colaboradorSemDesligamento(ArrayList<Colaborador> colaboradores){
        for (Colaborador colaborador : colaboradores){
            if (colaborador.getDtDesligamento() == null){
                System.out.println(colaborador);
            }
        }
    }

    public static void listarColaboradorPorCargo(ArrayList<Cargo> cargos, ArrayList<Colaborador> colaboradores){
        for (Cargo cargo : cargos){
            for (Colaborador colaborador : colaboradores){
                if (colaborador.getCargo() == cargo){
                    System.out.println(colaborador);
                }
            }
        }
    }

}
