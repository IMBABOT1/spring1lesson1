package ru.geekbrains.spring1.lesson1;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


// http://localhost:8080/client2/first_servlet
public class ProductServlet extends HttpServlet {

    private Product[] products;

    @Override
    public void init() throws ServletException {
        products = new Product[10];
        products[0] = new Product(1l, "First", 10);
        products[1] = new Product(2l, "Second", 200);
        products[2] = new Product(3l, "Second", 200);
        products[3] = new Product(4l, "Second", 200);
        products[4] = new Product(5l, "Second", 200);
        products[5] = new Product(6l, "Second", 200);
        products[6] = new Product(7l, "Second", 200);
        products[7] = new Product(8l, "Second", 200);
        products[8] = new Product(9l, "Second", 200);
        products[9] = new Product(10l, "Second", 200);


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().printf("<html><body>");
        for (int i = 0; i < products.length; i++) {
            resp.getWriter().printf("<h1>Product " +
                    products[i].getId() + " " +
                    products[i].getTitle() + " " +
                    products[i].getCost() + "</h1>");
        }
        resp.getWriter().printf("</body></html>");
        resp.getWriter().close();
    }


}
