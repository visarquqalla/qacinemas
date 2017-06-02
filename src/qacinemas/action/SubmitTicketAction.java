package qacinemas.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import qacinemas.exercise2.WednesdayDiscountTicket;

@WebServlet("/submitticketaction")
public class SubmitTicketAction extends HttpServlet {

	public double totalCostSummary = 0.0f;
	public ArrayList<String> ticketPurchases = new ArrayList<>();
	
	public double applyDiscount(double current) {
		double sum = current;
		Calendar cal = Calendar.getInstance();
		boolean wednesday = cal.get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY;
		if (!wednesday) {
			System.out.println("It's wednesday!!");
			WednesdayDiscountTicket ticket = new WednesdayDiscountTicket();
			ticket.loadModifier();
			sum = ticket.apply(sum);
			System.out.println("total price: " + sum);
		} else {
			System.out.println("It's not wednesday!");
		}
		return sum;
	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		if (request.getParameter("button") != null) {
			String ticketSelectionParameter = request.getParameter("ticket");
			if (ticketSelectionParameter != null
					&& !ticketSelectionParameter.equalsIgnoreCase("none")) {
				System.out.println("Yay, clicked button! value: "
						+ ticketSelectionParameter);
				double tempValue = 0;
				switch (ticketSelectionParameter.toLowerCase()) {
				case "oap":
					tempValue += 6.0;
					break;
				case "standard":
					tempValue += 8.0;
					break;
				case "child":
					tempValue += 4.0;
					break;
				case "student":
					tempValue += 6.0;
					break;
				default:
					tempValue += 0.0;
					return;
				}
				tempValue = applyDiscount(tempValue);
				totalCostSummary += tempValue;
				ticketPurchases.add(ticketSelectionParameter);
				request.setAttribute("total_purchase_history", ticketPurchases);
				// Will be available as ${total_cost_summary} in JSP
				request.setAttribute("total_cost_summary", totalCostSummary);
				// Will be available as ${total_cost_summary} in JSP
			}
		} else {
			System.out.println("no");
		}

		request.getRequestDispatcher("/home.jsp").forward(request, response);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	}

}