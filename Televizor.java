class Televizor {
    private String marca = "";
    private int diagonala = 51;
    private int an_fabricatie = 2001;

    public Televizor(String marca) {
        this.marca = marca;
    }

    public Televizor(String marca, int diagonala, int an_fabricatie) {
        this.marca = marca;
        this.diagonala = diagonala;
        this.an_fabricatie = an_fabricatie;
    }

    int getAnFrabricatie() {
        return an_fabricatie;
    }

    int getDiagonala() {
        return diagonala;
    }

    String getMarca() {
        return marca;
    }
}

class TelevizorColor extends Televizor {
    private Boolean color = false;

    public TelevizorColor(Boolean color, String marca) {
        super(marca);
        this.color = color;
    }

    public void afiseazaTV() {
        System.out.print("TV Model "+ getMarca() + " Diagonala "+getDiagonala()+" an fab "+ getAnFrabricatie());
        if(this.color) {
            System.out.println(" este color!");
        } else {
            System.out.println(" nu este color!");
        }
    }
}

public class hello {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        // System.out.println("Hello, World");

        Televizor lg = new Televizor("LG", 101, 2018);
        TelevizorColor samsung = new TelevizorColor(false, "samsung");

        samsung.afiseazaTV();
    }
}