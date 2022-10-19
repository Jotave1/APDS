package dominio;

public class Sala {
	private PortaSala PortaEntrada;
	private Porta PortaAuxiliar;
	private float MetragemQuadrada;
	
	public PortaSala getPortaEntrada() {
		return PortaEntrada;
	}
	
	public void setPortaEntrada(PortaSala portaEntrada) {
		PortaEntrada = portaEntrada;
	}
	
	public Porta getPortaAuxiliar() {
		return PortaAuxiliar;
	}
	
	public void setPortaAuxiliar(Porta portaAuxiliar) {
		PortaAuxiliar = portaAuxiliar;
	}
	
	public float getMetragemQuadrada() {
		return MetragemQuadrada;
	}
	
	public void setMetragemQuadrada(float metragemQuadrada) {
		MetragemQuadrada = metragemQuadrada;
	}
	
}
