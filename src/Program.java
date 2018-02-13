import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

    public static void main(String[] args) throws IOException {

        Product[] tab= new Product[3];


        tab[0]=new Product("Książka", 45, "Prod1");
        tab[1]=new Product("Długopis", 5, "Prod2");
        tab[2]=new Product("Stół", 1200, "Prod3");



        FileWriter file= new FileWriter("plik.cvs");
        BufferedWriter bf = new BufferedWriter(file);

        for (int i=0; i<tab.length; i++) {
            String text=tab[i].getNazwa()+"; "+tab[i].getCena()+"; "+tab[i].getProducent();
            bf.write(text);
            bf.newLine();
        }
         bf.close();

    }
}
