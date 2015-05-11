/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nz.aut.se2015.nsa.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import nz.aut.se2015.nsa.persist.EvidenceItem;
import nz.aut.se2015.nsa.persist.Method;
import nz.aut.se2015.nsa.persist.Methodology;

/**
 *
 * @author erikzweidorff
 */
public class MethodFormServlet extends HttpServlet {

    Method method;
    Methodology methodology;
    HttpSession httpSession;

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("MethodFormServlet: doGet");
        httpSession = request.getSession(true);
        
        //Check if there is allready an method bean in the session.
        if (httpSession.getAttribute("method") == null){
            method = new Method();
            httpSession.setAttribute("method", method);
        } else{
            method = (Method) httpSession.getAttribute("method");
        }
        
        //Check if there is allready an methodology bean in the session.
        if (httpSession.getAttribute("methodology") == null){
            methodology = new Methodology();
            httpSession.setAttribute("methodology", methodology);
        } else{
            methodology = (Methodology) httpSession.getAttribute("methodology");
        }
        
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/methodForm.jsp");
        dispatcher.forward(request, response);
        //dispatcher.include(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("MethodFormServlet: doPost");
        httpSession = request.getSession(true);
        
        //Check if there is allready an method bean in the session.
        if (httpSession.getAttribute("method") == null){
            method = new Method();
            httpSession.setAttribute("method", method);
        } else{
            method = (Method) httpSession.getAttribute("method");
        }
        
        //Check if there is allready an methodology bean in the session.
        if (httpSession.getAttribute("methodology") == null){
            methodology = new Methodology();
            httpSession.setAttribute("methodology", methodology);
        } else{
            methodology = (Methodology) httpSession.getAttribute("methodology");
        }
        
        method.setName(request.getParameter("methodName"));
        method.setDescription(request.getParameter("methodDescription"));
        methodology.setName(request.getParameter("methodologyName"));
        methodology.setDescription(request.getParameter("methodologyDescription"));
        
        httpSession.setAttribute("method", method);
        httpSession.setAttribute("methodology", methodology);
        
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/studyForm.jsp");
        dispatcher.forward(request, response);
        //dispatcher.include(request, response);
    }
}
