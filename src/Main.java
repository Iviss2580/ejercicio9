public class Main {
    public static void main(String[] args) {
        Cliente cliente= new Cliente();
        Trabajador trabajador= new Trabajador();
        cliente.edad= 30;
        cliente.nombre= "maria";
        cliente.numero= 56699;
        cliente.credito= "es confiable";

        System.out.println("Soy nuevo cliente, me presento "+cliente.getEdad()+" me llamo "+ cliente.getNombre()+" mi numero es "+ cliente.getNumero()+ "en tema credito todos me dicen "+ cliente.getCredito());
        trabajador.edad= 25;
        trabajador.nombre= "Jose";
        trabajador.numero= 2333;
        trabajador.salario= 123999;
        System.out.println("Soy el nuevo, me presento "+trabajador.getEdad()+" me llamo "+ trabajador.getNombre()+" mi numero es "+ trabajador.getNumero()+" voy a percibir "+ trabajador.getSalario());
    }
}
class Persona {
    int edad;
    String nombre;
    int numero;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }
}
class Cliente extends Persona{
    String credito;

    public void setCredito(String credito) {
        this.credito = credito;
    }

    public String getCredito() {
        return credito;
    }
}
class Trabajador extends Persona{
    int salario;

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }
}