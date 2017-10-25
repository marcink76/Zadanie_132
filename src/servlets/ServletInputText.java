package servlets;

import app.TextAnalyzator;
import app.TextAnalyzator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/ServletInputText")
public class ServletInputText extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String text = request.getParameter("text");
        PrintWriter writer = response.getWriter();


        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");

        writer.print("<p>" + text + "</p><br>");
        writer.print("<h2>Ilość znaków w podanym tekscie: " + TextAnalyzator.lenghtCalc(text) + " <h2><br>");
        writer.print("<h2>Ilość znaków bez spacji: " + TextAnalyzator.lenghtWithoutWhiteChar(text) + " <h2><br>");
        writer.print("<h2>Ilość słów: " + TextAnalyzator.wordCounting(text) + " <h2><br>");
        writer.print("<h2>Tekst jest palindromem? " + TextAnalyzator.palindromeCheck(text) + "<h2><br>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}