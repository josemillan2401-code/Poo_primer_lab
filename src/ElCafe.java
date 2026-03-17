public class ElCafe {

    private String nombre;
    private String tamano;
    private Double precio;

    public ElCafe(String nombre, String tamano, Double precio) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.precio = precio;
          mostrarticket();
    }

    public void mostrarticket(){
        System.out.println("nombre"+nombre);
        System.out.println("tamano"+tamano);
        System.out.println("precio"+precio);

    }
}

