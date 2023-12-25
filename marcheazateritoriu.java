abstract class Mamifer {
    abstract void MarcheazaTeritoriul();
}

class Om extends Mamifer {
    public void MarcheazaTeritoriul() {
        System.out.println("Marcam teritoriul construind un gard");
    }
}
class Maimuta extends Mamifer {
    public void MarcheazaTeritoriul() {
        System.out.println("Marcam teritoriul cu crengi");
    }
}
class GangMember extends Mamifer {
    public void MarcheazaTeritoriul() {
        System.out.println("Marcheaza teritoriul cu grafiti");
    }
}

public class hello {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        // System.out.println("Hello, World");

        Om liviu = new Om();
        liviu.MarcheazaTeritoriul();

        Maimuta coco = new Maimuta();
        coco.MarcheazaTeritoriul();

        GangMember alex = new GangMember();
        alex.MarcheazaTeritoriul();

    }
}