package Model;

import java.util.List;

public class Sala {
    private Integer id_sala;
    private List<Integer> lista_spectacole;
    private List<Integer> lista_vanzari;


    public Sala(Integer id_sala, List<Integer> lista_spectacole, List<Integer> lista_vanzari) {
        this.id_sala = id_sala;
        this.lista_spectacole = lista_spectacole;
        this.lista_vanzari = lista_vanzari;
    }

    public Integer getId_sala() {
        return id_sala;
    }

    public void setId_sala(Integer id_sala) {
        this.id_sala = id_sala;
    }

    public List<Integer> getLista_spectacole() {
        return lista_spectacole;
    }

    public void setLista_spectacole(List<Integer> lista_spectacole) {
        this.lista_spectacole = lista_spectacole;
    }

    public List<Integer> getLista_vanzari() {
        return lista_vanzari;
    }

    public void setLista_vanzari(List<Integer> lista_vanzari) {
        this.lista_vanzari = lista_vanzari;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "id_sala=" + id_sala +
                ", lista_spectacole=" + lista_spectacole +
                ", lista_vanzari=" + lista_vanzari +
                '}';
    }
}
