import Repository.SpectacolRepo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        SpectacolRepo spectacolRepo=new SpectacolRepo();
        spectacolRepo.getSpectacole().forEach(e -> System.out.println(e.toString()));
    }
}
