package ar.edu.unlam.pb2.git.tdd;

public class DiscoRigido {
	private String marca;
	private Integer almacenamientoEnTB;
	private final Integer conversionDeUnidad;
	private final Double almacenamientoDeUnDVDEnGB;
	private final Double almacenamientoDeUnBlueRayEnGB;
	

	public DiscoRigido(String marca, Integer almacenamientoEnTB) {
		this.marca = marca;
		this.almacenamientoEnTB = almacenamientoEnTB;
		this.conversionDeUnidad = 1024;
		this.almacenamientoDeUnDVDEnGB = 4.5;
		this.almacenamientoDeUnBlueRayEnGB = 15.0;
	}

	public Integer calcularLaCantidadDeDVD() {
		Integer cantidadDeDVD = (int)Math.ceil(almacenamientoEnTB * this.conversionDeUnidad / this.almacenamientoDeUnDVDEnGB);
		return cantidadDeDVD;
	}
	
	

}
