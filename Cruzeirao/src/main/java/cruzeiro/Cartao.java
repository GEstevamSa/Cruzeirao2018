package cruzeiro;

public class Cartao extends PartidasFutebol {
	
	private Inscricao inscrito;
	private int tempo;
	public Inscricao getInscrito() {
		return inscrito;
	}
	public void setInscrito(Inscricao inscrito) {
		this.inscrito = inscrito;
	}
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
}
