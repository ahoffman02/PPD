import Model.Vanzare;
import Repository.SalaRepo;
import Repository.SpectacolRepo;
import Repository.VanzareRepo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello");
        SpectacolRepo spectacolRepo=new SpectacolRepo();
        spectacolRepo.getSpectacole().forEach(e -> System.out.println(e.toString()));

        VanzareRepo vanzareRepo=new VanzareRepo();
        vanzareRepo.getVanzari().forEach(e-> System.out.println(e.toString()));

        SalaRepo salaRepo=new SalaRepo();
        salaRepo.getSala().forEach(e-> System.out.println(e.toString()));

    }
}
