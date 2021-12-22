package Repository;

import Model.Spectacol;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SpectacolRepo {

    public SpectacolRepo() {
    }

    public List<Spectacol> getSpectacole(){
        List<Spectacol> list=new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/spectacole.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                List<String> splitted_line= List.of(line.split(" "));
                List<Integer> sold_list=new ArrayList<>();
                for(String s:List.of(splitted_line.get(4).split(","))){
                    sold_list.add(Integer.parseInt(s));
                }

                Spectacol spectacol=new Spectacol(Integer.parseInt(splitted_line.get(0)),splitted_line.get(1),splitted_line.get(2),Double.parseDouble(splitted_line.get(3)),
                       sold_list,Double.parseDouble(splitted_line.get(5)) );
                list.add(spectacol);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }
}
