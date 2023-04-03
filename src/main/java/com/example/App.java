package com.example;

import com.example.entities.Peliculas;
import com.example.repositories.PeliculasRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.List;

@SpringBootApplication
public class App {
	static ApplicationContext context;


	public static void main(String[] args) {
		context = SpringApplication.run(App.class, args);

		datosDemo();

		PeliculasRepository peliculasRepo = context.getBean(PeliculasRepository.class);

	}

	private static void datosDemo(){
		PeliculasRepository peliculasRepo = context.getBean(PeliculasRepository.class);


		Peliculas pel1 = new Peliculas();
		pel1.setNombre("Avatar");
		pel1.setDuracion(162);
		pel1.setEstreno(LocalDate.of(2009, 2, 18));
		pel1.setActiva(true);
		pel1.setDescripcion("Avatar es una franquicia de medios estadounidense creada por " +
				"James Cameron, que consiste en una serie planificada de películas épicas de " +
				"ciencia ficción producidas por Lightstorm Entertainment y distribuidas por " +
				"20th Century Studios, así como productos relacionados, videojuegos y " +
				"atracciones de parques temáticos. ");

		Peliculas pel2 = Peliculas.builder().nombre("Dune").duracion(155).estreno(LocalDate.of(2021, Month.OCTOBER, 22)).activa(true).build();
		Peliculas pel3 = new Peliculas(null,"xXx Reactivated","Tras incendiarse, un satélite se sale de órbita" +
				" y cae sobre la Tierra. No es un accidente: el culpable es un peligroso dispositivo que pronto" +
				" es puesto bajo custodia de la CIA... sólo para ser robado poco después. La agente Jane Marke " +
				"decide entonces buscar a Xander Cage.",102,LocalDate.of(2017, Month.JANUARY, 20),true);

			peliculasRepo.saveAll(List.of(pel1,pel2,pel3));

	}

}
