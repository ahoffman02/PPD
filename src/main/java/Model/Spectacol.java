package Model;

import java.util.List;

public class Spectacol {
    private Integer id_spectacol;
    private String data_spectacol;
    private String titlu;
    private Double pret_bilet;
    private List<Integer> lista_locuri_vandute;
    private Double sold;


    public Spectacol(Integer id_spectacol, String data_spectacol, String titlu, Double pret_bilet, List<Integer> lista_locuri_vandute, Double sold) {
        this.id_spectacol = id_spectacol;
        this.data_spectacol = data_spectacol;
        this.titlu = titlu;
        this.pret_bilet = pret_bilet;
        this.lista_locuri_vandute = lista_locuri_vandute;
        this.sold = sold;
    }

    public void setId_spectacol(Integer id_spectacol) {
        this.id_spectacol = id_spectacol;
    }

    public void setData_spectacol(String data_spectacol) {
        this.data_spectacol = data_spectacol;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public void setPret_bilet(Double pret_bilet) {
        this.pret_bilet = pret_bilet;
    }

    public void setLista_locuri_vandute(List<Integer> lista_locuri_vandute) {
        this.lista_locuri_vandute = lista_locuri_vandute;
    }

    public void setSold(Double sold) {
        this.sold = sold;
    }

    public Integer getId_spectacol() {
        return id_spectacol;
    }

    public String getData_spectacol() {
        return data_spectacol;
    }

    public String getTitlu() {
        return titlu;
    }

    public Double getPret_bilet() {
        return pret_bilet;
    }

    public List<Integer> getLista_locuri_vandute() {
        return lista_locuri_vandute;
    }

    public Double getSold() {
        return sold;
    }

    @Override
    public String toString() {
        return "Spectacol{" +
                "id_spectacol=" + id_spectacol +
                ", data_spectacol='" + data_spectacol + '\'' +
                ", titlu='" + titlu + '\'' +
                ", pret_bilet=" + pret_bilet +
                ", lista_locuri_vandute=" + lista_locuri_vandute +
                ", sold=" + sold +
                '}';
    }
}
