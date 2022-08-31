public class Main {
    public static void main(String[] args) {
        Cliente cliente= new Cliente();
        cliente.edad= 30;
        cliente.nombre= "maria";
        cliente.numero= 56699;
        cliente.credito= "es confiable";

        System.out.println(cliente.getEdad());
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getNumero());
        System.out.println(cliente.getCredito());
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