package visao;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.awt.Rectangle;

public class Principal {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        String path = "C:\\Users\\Pluto\\OneDrive\\Documents\\Projetos\\Java\\APDS PROVA JOSENALDE\\apdsQ5\\in4.txt";
        
        try (BufferedReader arquivo = new BufferedReader(new FileReader(path))) {
            String[] pontos = arquivo.readLine().split(" ");
            Rectangle retA = new Rectangle(
                Integer.parseInt(pontos[0]),
                Integer.parseInt(pontos[1]),
                Integer.parseInt(pontos[2]),
                Integer.parseInt(pontos[3])
            );
            pontos = arquivo.readLine().split(" ");
            Rectangle retB = new Rectangle(
                Integer.parseInt(pontos[0]),
                Integer.parseInt(pontos[1]),
                Integer.parseInt(pontos[2]),
                Integer.parseInt(pontos[3])
            );
            if (detectarColisao(retA, retB)) {
                System.out.println("Colidiu");
            } else {
                System.out.println("Não colidiu");
            }
            ler.close();
            arquivo.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static boolean detectarColisao(Rectangle retA, Rectangle retB) {
        return retA.intersects(retB);
    }
}