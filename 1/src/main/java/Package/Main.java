package Package;

import java.util.Scanner;
/**import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import Package.Extraction;*/
/**
 * Пример запроса/ответа<br>
 * Запрос: http://localhost:8080/func?a=9<br>
 * Ответ: { “error”:0, “result”:3 }
 *
 * Пример запроса/ответа – ошибка «отрицательное число»<br>
 * Запрос: http://localhost:8080/func?a=-9<br>
 * Ответ: { “error”:1 }
 */
public class Main {
	public static void main(String args[]) {
		/**int port = 8080;

		Server server = new Server(port);

		ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
		context.setContextPath("/");

		// http://localhost:8080/func
		context.addServlet(new ServletHolder(new Extraction()), "/func");

		HandlerList handlers = new HandlerList();
		handlers.setHandlers(new Handler[] { context });
		server.setHandler(handlers);

		try {
			server.start();
			System.out.println("Listening port: " + port);

			server.join();
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("Введите число, из которого требуется вычислить квадратный корень.");
		double BaseNumber = input.nextDouble();
		if (BaseNumber < 0)
		{
			System.out.println("Невозможно вычислить корень из отрицательного числа");
			System.exit(0);
		}
		Extraction ext = new Extraction();
		System.out.println("Ответ: " + ext.Square_Root(BaseNumber));
	}
}
