class Disk {
    private String nume = "";
    private int capacitate = 0;

    public Disk(String nume, int capacitate) {
        this.nume = nume;
        this.capacitate = capacitate;
    }

    public void afisareDisk() {
        System.out.println("Disk-ul "+nume+" de capacitate "+capacitate);
    }
}

class Discheta extends Disk {
    
    private Boolean writeProtected = true;

    public Discheta(String nume, int capacitate) {
        super(nume, capacitate);
        this.writeProtected=true;
    }

    public Discheta(String nume, int capacitate, Boolean writeProtected) {
        this(nume, capacitate);
        this.writeProtected = writeProtected;
    }
    
    public void afisareDischeta() {
        afisareDisk();
        System.out.println("Model discheta - write protected "+ writeProtected);
    }

    public void flipflop() {
        this.writeProtected = !this.writeProtected;
    }

}

class HardDisk extends Disk {
    private String controler = "";

    public HardDisk(String nume, int capacitate) {
        super(nume, capacitate);
        this.controler="N/A";
    }

    public HardDisk(String nume, int capacitate, String controler) {
        this(nume, capacitate);
        this.controler = controler;
    }

    public void afisareHardDisk(){
        afisareDisk();
        System.out.println("Model HardDisk - controler "+controler);
    }

}

public class hello {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        // System.out.println("Hello, World");

        HardDisk hdd = new HardDisk("Hard 1", 1000, "SCSI");
        hdd.afisareHardDisk();

        Discheta floppy = new Discheta("Discheta 1", 100, false);
        floppy.afisareDischeta();
        System.out.println("fliping floppy");
        floppy.flipflop();
        floppy.afisareDischeta();

    }
}