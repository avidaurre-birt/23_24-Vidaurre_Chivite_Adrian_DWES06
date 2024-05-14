package birt.dwes.apirest.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import birt.dwes.apirest.entity.Carrera;

@Service
public class ServicioCarrera {
	@Autowired
	private RestTemplate restTemplate;
	
	private final String API_URL = "http://localhost/dwes06/actividadesD/public/carrerabyid/";

	public Carrera getCarreraById(int id) {
		String url = API_URL + id;
		ResponseEntity<Carrera> respuesta = restTemplate.getForEntity(url, Carrera.class);
		return respuesta.getBody();
		
	}
}
