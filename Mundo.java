public class Mundo {
    int edad;
    String nombre;
    int dias;

    public Mundo(int edad,String nombre,int dias){
        this.edad = edad;
        this.nombre = nombre;
        this.dias = dias;
    }
    public static void main(String[] args) {
        Mundo Tierra = new Mundo(1000,"Tierrra",352);
        System.out.println("EL planeta "+Tierra.GetNombre()+" tiene "+Tierra.Getdias()+" dias");
    }

    public int Getdias(){
        return this.dias;
    }

    public String GetNombre(){
        return this.nombre;
    }
}
