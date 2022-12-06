package entidad;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Tonna/SA FR34K
 */
/*En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Amarre se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.*/
public class Amarre {

    protected String nombre;
    protected Integer DNI;
    protected Date fechainicio;
    protected Date fechafinal;
    protected Integer posicion;
    protected Integer matricula;
    protected Double eslora;
    protected Integer ano;
    protected Double alquiler;
    protected Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Amarre() {
    }

    public Amarre(String nombre, Integer DNI, Date fechainicio, Date fechafinal, Integer posicion, Integer matricula, Double eslora, Integer ano, Double alquiler) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fechainicio = fechainicio;
        this.fechafinal = fechafinal;
        this.posicion = posicion;
        this.matricula = matricula;
        this.eslora = eslora;
        this.ano = ano;
        this.alquiler = alquiler;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public Date getFechafinal() {
        return fechafinal;
    }

    public void setFechafinal(Date fechafinal) {
        this.fechafinal = fechafinal;
    }

    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Double getEslora() {
        return eslora;
    }

    public void setEslora(Double eslora) {
        this.eslora = eslora;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Double getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(Double alquiler) {
        this.alquiler = alquiler;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

   

    @Override
    public String toString() {
        return "Amarre{" + "nombre=" + nombre + ", DNI=" + DNI + ", fechainicio=" + fechainicio + ", fechafinal=" + fechafinal + ", posicion=" + posicion + ", matricula=" + matricula + ", eslora=" + eslora + ", ano=" + ano + '}';
    }

    public void Alquiler() {
        System.out.println("Ingrese nombre: ");
        nombre=leer.next();
        System.out.println("Ingrese su DNI: ");
        DNI=leer.nextInt();
        System.out.println("Ingrese la fecha de comienzo del alquiler: ");
        System.out.println("dia: ");
        int dia=leer.nextInt();
        System.out.println("mes: ");
        int mes=leer.nextInt();
        System.out.println("año: ");
        int ano2=leer.nextInt();
        fechainicio=new Date(ano2-1900,mes-1,dia);
        System.out.println("Ingrese la fecha de finalizacion del alquiler: ");
        System.out.println("dia: ");
        int dia1=leer.nextInt();
        System.out.println("mes: ");
        int mes1=leer.nextInt();
        System.out.println("año: ");
        int ano1=leer.nextInt();
        fechafinal=new Date(ano1-1900,mes1-1,dia1);
        System.out.println("Ingrese la Matricula de la embarcacion: ");
        matricula=leer.nextInt();
        System.out.println("Ingrese la eslora de la embarcacion: ");
        eslora=leer.nextDouble();
        System.out.println("Ingrese el año de la embarcacion: ");
        ano=leer.nextInt();
        
    }
    public void CalculoAlquiler(){
        int dias=fechafinal.getDay()-fechainicio.getDay();
        double calculo=eslora*10;
        alquiler=dias*calculo;
    }
    
    public void Mostrar(){
        System.out.println("Matricula: "+matricula);
        System.out.println("Eslora: "+eslora);
        System.out.println("Año: "+ano);
        System.out.println("Precio Amarre: "+alquiler);
    }
    
}
