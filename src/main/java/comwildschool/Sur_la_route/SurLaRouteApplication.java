package comwildschool.Sur_la_route;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

@Controller
@SpringBootApplication
public class SurLaRouteApplication {

	public static void main(String[] args) {
		SpringApplication.run(SurLaRouteApplication.class, args);
	}

	@RequestMapping(value = "/doctor/{numero}")
	@ResponseBody
	public doctor nameDoctor1(@PathVariable int numero){
		doctor d;
		if(numero >=1&& numero<=8){
			throw new ResponseStatusException(HttpStatus.SEE_OTHER, "See other doctor");

		}

		switch (numero)
		{

			case 9:
				d=new doctor("Christopher Eccleston",numero);
				return d;
			case 10:
				d=new doctor("David Tennant",numero);
				return d;

			case 11:
				d=new doctor("Matt Smith",numero);
				return d;

			case 12:
			d=new doctor("Peter Capaldi" ,numero);
				return d;

			case 13:
				d=new doctor("Jodie Whittaker" ,numero);
				return d;


		}
		throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Impossible de récupérer l'incarnation "+ numero);

	}

}
