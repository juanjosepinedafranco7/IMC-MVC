package modelo;

import modelo.dto.PersonaDTO;

public class Procesos {

	public PersonaDTO armarPersona(String nombre, String edad, String peso, String estatura) {
		PersonaDTO p = new PersonaDTO();
		p.setNombre(nombre);
		p.setEdad(Integer.parseInt(edad));
		p.setPeso(Double.parseDouble(peso));
		p.setEstatura(Double.parseDouble(estatura));
		calcularIMC(p);
		return p;
	}

	private void calcularIMC(PersonaDTO p) {
		double imc = p.getPeso() / (p.getEstatura() * p.getEstatura());
		p.setImc(imc);
		if (imc < 18.5) p.setClasificacion("Bajo peso");
		else if (imc < 25) p.setClasificacion("Normal");
		else if (imc < 30) p.setClasificacion("Sobrepeso");
		else p.setClasificacion("Obesidad");
	}
}