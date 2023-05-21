package Models;

public class Cargo {

    private String descricao;
    private Double salarioBase;
    private Nivel nivel;

//    public Cargo(){
//
//    }
    public Cargo(String descricao, Double salarioBase, Nivel nivel) {
        this.descricao = descricao;
        this.salarioBase = salarioBase;
        this.nivel = nivel;
    }
    public String getDescricao() { return descricao; }

    public void setDescricao(String descricao) { this.descricao = descricao; }

    public Double getSalarioBase() { return salarioBase; }

    public void setSalarioBase(Double salarioBase) { this.salarioBase = salarioBase; }

    public Nivel getNivel() { return nivel; }

    public void setNivel(Nivel nivel) { this.nivel = nivel; }

    @Override
    public String toString() {
        return "Cargo{" +
                "descricao='" + descricao + '\'' +
                ", salarioBase=" + salarioBase +
                ", nivel=" + nivel +
                '}';
    }
}
