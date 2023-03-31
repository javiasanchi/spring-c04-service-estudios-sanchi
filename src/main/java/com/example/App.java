package com.example;

import com.example.entities.Peliculas;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

@SpringBootApplication
public class App {


	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		Peliculas pel1 = new Peliculas();
		pel1.setNombre("Avatar");

		Peliculas pel2 = Peliculas.builder().nombre("Dune").duracion(155).estreno(LocalDate.of(2021, Month.OCTOBER, 22)).activa(true).build();
		Peliculas pel3 = new Peliculas(null,"xXx Reactivated","Tras incendiarse, un satélite se sale de órbita" +
				" y cae sobre la Tierra. No es un accidente: el culpable es un peligroso dispositivo que pronto" +
				" es puesto bajo custodia de la CIA... sólo para ser robado poco después. La agente Jane Marke " +
				"decide entonces buscar a Xander Cage.",102,LocalDate.of(2017, Month.JANUARY, 20),true);
	}

}
