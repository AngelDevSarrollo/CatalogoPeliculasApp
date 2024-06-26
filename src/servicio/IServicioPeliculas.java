package servicio;

import dominio.Pelicula;

public interface IServicioPeliculas {
    public void listarPeliculas();
    public void agregarPelivula(Pelicula pelicula);

    public void buscarPelicula(Pelicula pelicula);
}
