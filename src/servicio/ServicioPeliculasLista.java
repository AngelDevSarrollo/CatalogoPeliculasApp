package servicio;

import dominio.Pelicula;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;

public class ServicioPeliculasLista implements IServicioPeliculas{

    private final List<Pelicula> peliculas;

    public ServicioPeliculasLista(){
        this.peliculas = new ArrayList<>();
    }

    @Override
    public void listarPeliculas() {
        System.out.println("Listado de Peliculas...");
        peliculas.forEach(System.out::println);
    }

    @Override
    public void agregarPelivula(Pelicula pelicula) {
        peliculas.add(pelicula);
        System.out.println(pelicula + " - Pelicula agregada a la lista");
    }

    @Override
    public void buscarPelicula(Pelicula pelicula) {
        //Regresa el indice de la pelicula encontrada en la lista
        var indice = peliculas.indexOf(pelicula);
        if(indice ==-1)
            System.out.println("No se encontro la pelicula: " + pelicula);
        else
            System.out.println("Pelicula encontrada en el indice " + indice);
    }

    public static void main(String[] args) {
        //Creamos algunos objetos de tipo pelicula
        var pelicula1 = new Pelicula("Batman");
        var pelicula2 = new Pelicula("Superman");
       //Creamos el servicio(patron de diseño service)
        IServicioPeliculas servicioPeliculas = new ServicioPeliculasLista();
        //Agregamos las peliculas a la lista
        servicioPeliculas.agregarPelivula(pelicula1);
        servicioPeliculas.agregarPelivula(pelicula2);
        //Listamos las peliculas
        servicioPeliculas.listarPeliculas();
        //Buscamos una Pelicula
        //Se debe implementar el metodo de equals y hashCode
        servicioPeliculas.buscarPelicula(pelicula1);
        
    }
}
