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
        System.out.println("EvidenceItemFormServlet: doGet");
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
        System.out.println("EvidenceItemFormServlet: doPost");
        httpSession = request.getSession(true);
        
        //Check if there is allready an evidenceItem bean in the session.
        if (httpSession.getAttribute("evidenceItem") == null) {
            evidenceItem = new EvidenceItem();
            httpSession.setAttribute("evidenceItem", evidenceItem);
        } else {
            evidenceItem = (EvidenceItem) httpSession.getAttribute("evidenceItem");
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
        
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/methodItemForm.jsp");        
        dispatcher.forward(request, response);
        //dispatcher.include(request, response);
    }
}
