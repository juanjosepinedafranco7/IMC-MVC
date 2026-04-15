package modelo;

public class Validaciones {

	public boolean validarDatos(String nombre, String edad, String peso, String estatura) {
		
		if (nombre.trim().isEmpty() || edad.trim().isEmpty() || peso.trim().isEmpty() || estatura.trim().isEmpty()) {
			return false;
		}

		try {
			int edadNum = Integer.parseInt(edad);
			if (edadNum <= 0 || edadNum > 120) {
				return false;
			}

			double pesoNum = Double.parseDouble(peso);
			double estaturaNum = Double.parseDouble(estatura);

			if (pesoNum <= 0 || pesoNum > 500 || estaturaNum <= 0 || estaturaNum > 2.80) {
				return false;
			}

			return true;

		} catch (NumberFormatException e) {
			return false;
		}
	}
}