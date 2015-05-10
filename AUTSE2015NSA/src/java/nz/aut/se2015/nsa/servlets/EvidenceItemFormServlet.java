/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nz.aut.se2015.nsa.servlets;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import nz.aut.se2015.nsa.persist.EvidenceItem;
import nz.aut.se2015.nsa.persist.EvidenceItemFacadeLocal;

/**
 *
 * @author Øyvind
 */
public class EvidenceItemFormServlet extends HttpServlet {
    @EJB
    private EvidenceItemFacadeLocal evidenceItemFacade;
    
    EvidenceItem evidenceItem;
    HttpSession httpSession;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        httpSession = request.getSession(true);
        
        //Check if there is allready an evidenceItem bean in the session.
        if (httpSession.getAttribute("evidenceItem") == null){
            evidenceItem = new EvidenceItem();
            httpSession.setAttribute("evidenceItem", evidenceItem);
        } else{
            evidenceItem = (EvidenceItem) httpSession.getAttribute("evidenceItem");
        }
            
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/evidenceItemForm.jsp");
        dispatcher.forward(request, response);
    }

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
        processRequest(request, response);
        httpSession = request.getSession(true);
        
        //Check if there is allready an evidenceItem bean in the session.
        if (httpSession.getAttribute("evidenceItem") == null){
            evidenceItem = new EvidenceItem();
            httpSession.setAttribute("evidenceItem", evidenceItem);
            System.out.println("GET: evidenceItem not found");
        } else{
            System.out.println("GET: evidenceItem found");
            evidenceItem = (EvidenceItem) httpSession.getAttribute("evidenceItem");
        }
            
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/evidenceItemForm.jsp");
        //dispatcher.forward(request, response);
        dispatcher.include(request, response);
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
        processRequest(request, response);
        httpSession = request.getSession(true);
        if (httpSession.getAttribute("evidenceItem") == null) {
            evidenceItem = new EvidenceItem();
            System.out.println("POST: evidenceItem not found");
        } else {
            evidenceItem = (EvidenceItem) httpSession.getAttribute("evidenceItem");
            System.out.println("POST: evidenceItem found");
        }

        evidenceItem.setContextHow(request.getParameter("contextHow"));
        evidenceItem.setContextWhat(request.getParameter("contextWhat"));
        evidenceItem.setContextWhen(request.getParameter("contextWhen"));
        evidenceItem.setContextWhere(request.getParameter("contextWhere"));
        evidenceItem.setContextWho(request.getParameter("contextWho"));
        evidenceItem.setContextWhy(request.getParameter("contextWhy"));
        evidenceItem.setBenefitOutcome(request.getParameter("benefitOutcome"));
        evidenceItem.setEvidenceItemResult(request.getParameter("evidenceItemResult"));
        evidenceItem.setMethodImplementationIntegrity(request.getParameter("methodImplementationIntegrity"));
        
        httpSession.setAttribute("evidenceItem", evidenceItem);
        //evidenceItemFacade.create(evidenceItem);
        //evidenceItemFacade.edit(evidenceItem);
        
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/evidenceItemForm.jsp");
        //dispatcher.forward(request, response);
        dispatcher.include(request, response);
    }

    /**
     *     
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
