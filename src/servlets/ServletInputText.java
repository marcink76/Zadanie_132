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

        PrintWriter writer = response.getWriter();

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        writer.print("Ilość znaków w podanym tekscie: " + TextAnalyzator.lenghtCalc(request.getParameter("text")) + " \n<br>");
        writer.print("Ilość znaków bez spacji: " + TextAnalyzator.lenghtWithoutWhiteChar(request.getParameter("text")) + " \n<br>");
        writer.print("Ilość słów: " + TextAnalyzator.wordCounting(request.getParameter("text")) + " \n<br>");
        writer.print("Tekst jest palindromem? " + TextAnalyzator.palindromeCheck(request.getParameter("text")) + "<br>");
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}