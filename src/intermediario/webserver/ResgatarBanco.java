package intermediario.webserver;

import intermediario.jdbc.Contato;
import intermediario.jdbc.ContatoDAO;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class ResgatarBanco extends ProcessarRequisicao {

	@Override
	public void processa(InputStream inputStream, OutputStream outputStream)
			throws IOException {
		PrintStream ps = new PrintStream(outputStream);
		ContatoDAO dao = new ContatoDAO();
		ps.println(cabecalho());
		ps.println("<html>");
		ps.println("<head><title>Contatos</title></head>");
		ps.println("<body><ul>");
		for(Contato contato : dao.listar()){
			ps.println(String.format("<li>%s</li>", contato));
		}
		ps.println("</ul></body>");
		ps.println("</html>");
	}

}
