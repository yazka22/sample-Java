class Student {
    private String nume ="";
    private int an = 1;
    private int grupa = 1;
    private int nota1 = 0;
    private int nota2 = 0;

    public Student(String nume, int an, int grupa, int nota1, int nota2) {
        this.nume = nume;
        this.an = an;
        this.grupa = grupa;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    private int medie() {
        return ((nota1+nota2)/2);
    }

    public void afisare() {
        System.out.println("Studentul : "+ nume+" anul "+an+" grupa "+grupa);
        System.out.println("Are media de "+medie());
    }

}


public class hello {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        // System.out.println("Hello, World");

        Student liviu = new Student("Liviu", 1, 1, 10, 9);
        liviu.afisare();
        Student alex = new Student("Alex", 2, 2, 5, 9);
        alex.afisare();
    }
}