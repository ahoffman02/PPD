package Repository;

import Model.Vanzare;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class VanzareRepo {


    public List<Vanzare> getVanzari(){
        List<Vanzare> list=new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/vanzari.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                List<String> splitted_line= List.of(line.split(" "));
                List<Integer> sold_list=new ArrayList<>();
                for(String s:List.of(splitted_line.get(4).split(","))){
                    sold_list.add(Integer.parseInt(s));
                }

                Vanzare vanzare=new Vanzare(Integer.parseInt(splitted_line.get(0)), Integer.parseInt(splitted_line.get(1)),splitted_line.get(2),Integer.parseInt(splitted_line.get(3)),
                        sold_list,Double.parseDouble(splitted_line.get(5)));
                list.add(vanzare);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }

    public void insertVanzare(Vanzare vanzare) throws IOException {
        String sold_tikets="";
        for(Integer loc:vanzare.getLista_locuri_vandute()){
            sold_tikets=sold_tikets+loc.toString()+",";
        }
        String res=sold_tikets.substring(0,sold_tikets.length()-1);
        String lineToAdd=vanzare.getId_spectacol().toString()+" "+ vanzare.getData_vanzare()+" "+ vanzare.getNr_bilete_vandute().toString()+" "+res+" "
                +vanzare.getSuma().toString()+"\n";
        Writer output;
        output = new BufferedWriter(new FileWriter("src/main/java/vanzari.txt", true));
        output.append(lineToAdd);
        output.close();
    }

}
