import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
@WebServlet("/chino")
//servlet = base de los servicios rest, pequeñas piezas que ensamblan estos servicios complejos (profundizar mas)
public class Servlet extends HttpServlet {
//arrancamos con los metodos http 'do get ' y 'do post'
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	String message = req.getParameter("message");
	PrintWriter out = resp.getWriter();
	out.print("<h1>una prueba de servlet que dice : </h1>" + message);
	out.flush();
	//esto que tenés es un recurso que se usa en el servicio REST 
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
	//ahora viene 'post' e.e
	StringBuffer json = new StringBuffer();
	String line;
	try (BufferedReader reader = req.getReader())
	{
		while((line = reader.readLine())!= null){
			json.append(line);
			}
		}
		System.out.println(json.toString());
	//hasta acá todo bien, el json se envia como corresponde y se envia a la consola, es la primera y la ultima vez
	//que te va tocar hacerlo, ahora la idea es deserializar esto y convertirlo a objetos, esa es la idea de la 
	//librería Jackson e.e
		
	ObjectMapper mapper = new ObjectMapper();
	//ObjectMapper = objeto de jackson para deserializar (sea json o xml)
	Message message = mapper.readValue(json.toString(), Message.class);
	System.out.println("message size" + message.getSize());
	}
}
