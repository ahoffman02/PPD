package Repository;

import Model.Sala;
import Model.Spectacol;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SalaRepo {

    public SalaRepo() {
    }

    public List<Sala> getSala(){
        List<Sala> list=new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/Sala.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                List<String> splitted_line= List.of(line.split(" "));
                List<Integer> lista_spectacole=new ArrayList<>();
                List<Integer> lista_vanzari=new ArrayList<>();
                for(String s:List.of(splitted_line.get(1).split(","))){
                    lista_spectacole.add(Integer.parseInt(s));
                }

                for(String s:List.of(splitted_line.get(2).split(","))){
                    lista_vanzari.add(Integer.parseInt(s));
                }
                Sala sala=new Sala(Integer.parseInt(splitted_line.get(0)),lista_spectacole, lista_vanzari);
                list.add(sala);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }


}
