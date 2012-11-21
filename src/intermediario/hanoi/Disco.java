package intermediario.hanoi;

class Disco {
	int raio;

	public Disco(int raio) {
		this.raio = raio;
	}

	public String toString() {
		return String.format("<%d>", raio);
	}
}
