package bus.sena.lab;

public class Bus {
	private String placa;
	private Integer capacidadPasajeros;
	private double precioPasaje ;
	private Integer pasajerosActuales;
	private Integer totalPasajeros;
	
	
	public Bus() {
		super();
	}


	


	public Bus(String placa, Integer capacidadPasajeros, double precioPasaje, Integer pasajerosActuales,
			Integer totalPasajeros) {
		super();
		this.placa = placa;
		this.capacidadPasajeros = capacidadPasajeros;
		this.precioPasaje = precioPasaje;
		this.pasajerosActuales = pasajerosActuales;
		this.totalPasajeros = totalPasajeros;
	}





	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public Integer getCapacidadPasajeros() {
		return capacidadPasajeros;
	}


	public void setCapacidadPasajeros(Integer capacidadPasajeros) {
		this.capacidadPasajeros = capacidadPasajeros;
	}


	public double getPrecioPasaje() {
		return precioPasaje;
	}


	public void setPrecioPasaje(double precioPasaje) {
		this.precioPasaje = precioPasaje;
	}


	public Integer getPasajerosActuales() {
		return pasajerosActuales;
	}


	public void setPasajerosActuales(Integer pasajerosActuales) {
		this.pasajerosActuales = pasajerosActuales;
	}


	public Integer getTotalPasajeros() {
		return totalPasajeros;
	}


	public void setTotalPasajeros(Integer totalPasajeros) {
		this.totalPasajeros = totalPasajeros;
	}
	
	 public void subirPasajeros(int pasajeros) {
		 
		int maximo = this.capacidadPasajeros - this.pasajerosActuales;
		if (pasajeros <= maximo) {
			this.pasajerosActuales = this.pasajerosActuales +pasajeros;
			this.totalPasajeros = this.totalPasajeros + pasajeros;
			
		}else {
			
			this.pasajerosActuales = this.pasajerosActuales +maximo;
			this.totalPasajeros = this.totalPasajeros + maximo;
		}
		
	}
	 
	 public double getDineroAcumulado() {
		 return this.precioPasaje * this.totalPasajeros;
	 }
	 public void bajarPasajeros(int pasajeros) {
		 if (pasajeros<= this.pasajerosActuales) {
			 this.pasajerosActuales = this.pasajerosActuales - pasajeros;
			
		}else{
			
			this.pasajerosActuales = 0;
		}
		
		 
	 }
	

}
