package intermediario.hanoi;

import java.util.Stack;

class Torre {

	private Stack pilha = new Stack();

	public boolean vazia() {
		return pilha.empty();
	}

	public Disco topo() {
		return (Disco) pilha.peek();
	}

	public Disco remove() {
		if (vazia()) {
			throw new IllegalStateException("Disco não pode ser removido");
		}
		return (Disco) pilha.pop();
	}

	public void adiciona(Disco disco) {
		if (vazia()) {
			pilha.push(disco);
		} else if (topo().raio > disco.raio) {
			pilha.push(disco);
		} else {
			throw new IllegalStateException("Disco não pode ser inserido");
		}
	}

	public int total() {
		return pilha.size();
	}

	public String toString() {
		return pilha.toString();
	}

}
