package Model;

import java.util.List;

public class Vanzare {
    private Integer id_spectacol;
    private String data_vanzare;
    private Integer nr_bilete_vandute;
    private List<Integer> lista_locuri_vandute;
    private Double suma;

    public Vanzare(Integer id_spectacol, String data_vanzare, Integer nr_bilete_vandute, List<Integer> lista_locuri_vandute, Double suma) {
        this.id_spectacol = id_spectacol;
        this.data_vanzare = data_vanzare;
        this.nr_bilete_vandute = nr_bilete_vandute;
        this.lista_locuri_vandute = lista_locuri_vandute;
        this.suma = suma;
    }

    @Override
    public String toString() {
        return "Vanzare{" +
                "id_spectacol=" + id_spectacol +
                ", data_vanzare='" + data_vanzare + '\'' +
                ", nr_bilete_vandute=" + nr_bilete_vandute +
                ", lista_locuri_vandute=" + lista_locuri_vandute +
                ", suma=" + suma +
                '}';
    }

    public List<Integer> getLista_locuri_vandute() {
        return lista_locuri_vandute;
    }

    public void setLista_locuri_vandute(List<Integer> lista_locuri_vandute) {
        this.lista_locuri_vandute = lista_locuri_vandute;
    }


    public void setId_spectacol(Integer id_spectacol) {
        this.id_spectacol = id_spectacol;
    }

    public void setData_vanzare(String data_vanzare) {
        this.data_vanzare = data_vanzare;
    }

    public void setNr_bilete_vandute(Integer nr_bilete_vandute) {
        this.nr_bilete_vandute = nr_bilete_vandute;
    }

    public void setSuma(Double suma) {
        this.suma = suma;
    }

    public Integer getId_spectacol() {
        return id_spectacol;
    }

    public String getData_vanzare() {
        return data_vanzare;
    }

    public Integer getNr_bilete_vandute() {
        return nr_bilete_vandute;
    }

    public Double getSuma() {
        return suma;
    }
}
