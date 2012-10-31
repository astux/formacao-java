package intermediario.threads;

public class Tarefa implements Runnable {
	private int id;

	public Tarefa(int id) {
		this.id = id;
	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.printf("Tarefa %d, valor %d\n", id, i);
		}

	}
	
	public static void main(String[] args) {
		new Thread(new Tarefa(1)).start();
		System.out.println("testando uma thread");
		//new Thread(new Tarefa(2)).start();
	}

}
