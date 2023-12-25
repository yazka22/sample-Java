import java.io.*;

class  CitireFisier{
    public static void citesteFisier(String fis) {
        FileReader f = null;
        try {
            System.out.println(" Deschidem fisierul" + fis);
            f = new FileReader(fis);
            int c; 
            while ((c=f.read())!=-1) System.out.print((char)c);
        } catch (FileNotFoundException e) {
            System.err.println("Fisierul nu a fost gasit");
            System.err.println("Exceptie: "+ e.getMessage());
            System.exit(1);
        } catch (IOException e) {
            System.out.println("Eroare la citirea din fisier");
            e.printStackTrace();
        } finally {
            if(f !=null) {
                System.out.println("inchidem fisierul");
                try {
                    f.close();
                } catch ( IOException e) {
                    System.err.println("Fisierul nu poate fi inchis");
                    e.printStackTrace();
                }
            }
        }
    }
}

public class hello {
    public static void citesteFisier(String fis) {
        FileReader f = null;
        try {
            System.out.println(" Deschidem fisierul" + fis);
            f = new FileReader(fis);
            int c; 
            while ((c=f.read())!=-1) System.out.print((char)c);
        } catch (FileNotFoundException e) {
            System.err.println("Fisierul nu a fost gasit");
            System.err.println("Exceptie: "+ e.getMessage());
            System.exit(1);
        } catch (IOException e) {
            System.out.println("Eroare la citirea din fisier");
            e.printStackTrace();
        } finally {
            if(f !=null) {
                System.out.println("inchidem fisierul");
                try {
                    f.close();
                } catch ( IOException e) {
                    System.err.println("Fisierul nu poate fi inchis");
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        // System.out.println("Hello, World");
        if(args.length >0) {
            citesteFisier(args[0]);
        } else {
            System.out.println("Lipseste numele fisierului");
        }
    }
}