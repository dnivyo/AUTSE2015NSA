/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nz.aut.se2015.nsa.servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import nz.aut.se2015.nsa.persist.CredibilityRating;
import nz.aut.se2015.nsa.persist.EvidenceSource;
import nz.aut.se2015.nsa.persist.ResearchDesign;

/**
 *
 * @author erikzweidorff
 */
public class StudyFormServlet extends HttpServlet {
    EvidenceSource evidenceSource;
    CredibilityRating credibilityRating;
    ResearchDesign researchDesign;
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
        System.out.println("StudyFormServlet: doGet");
        httpSession = request.getSession(true);
        
        //Check if there is allready an evidenceSource bean in the session.
        if (httpSession.getAttribute("evidenceSource") == null){
            evidenceSource = new EvidenceSource();
            httpSession.setAttribute("evidenceSource", evidenceSource);
        } else {
            evidenceSource = (EvidenceSource) httpSession.getAttribute("evidenceSource");
        }
        
        //Check if there is allready an credibilityRating bean in the session.
        if (httpSession.getAttribute("credibilityRating") == null){
            credibilityRating = new CredibilityRating();
            httpSession.setAttribute("credibilityRating", credibilityRating);
        } else {
            credibilityRating = (CredibilityRating) httpSession.getAttribute("credibilityRating");
        }
        
        //Check if there is allready an researchDesign bean in the session.
        if (httpSession.getAttribute("researchDesign") == null){
            researchDesign = new ResearchDesign();
            httpSession.setAttribute("researchDesign", researchDesign);
        } else {
            researchDesign = (ResearchDesign) httpSession.getAttribute("researchDesign");
        }
        
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/studyForm.jsp");
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
        System.out.println("StudyFormServlet: doPost");
        httpSession = request.getSession(true);
        
        //Check if there is allready an evidenceSource bean in the session.
        if (httpSession.getAttribute("evidenceSource") == null){
            evidenceSource = new EvidenceSource();
            httpSession.setAttribute("evidenceSource", evidenceSource);
        } else {
            evidenceSource = (EvidenceSource) httpSession.getAttribute("evidenceSource");
        }
        
        //Check if there is allready an credibilityRating bean in the session.
        if (httpSession.getAttribute("credibilityRating") == null){
            credibilityRating = new CredibilityRating();
            httpSession.setAttribute("credibilityRating", credibilityRating);
        } else {
            credibilityRating = (CredibilityRating) httpSession.getAttribute("credibilityRating");
        }
        
        //Check if there is allready an researchDesign bean in the session.
        if (httpSession.getAttribute("researchDesign") == null){
            researchDesign = new ResearchDesign();
            httpSession.setAttribute("researchDesign", researchDesign);
        } else {
            researchDesign = (ResearchDesign) httpSession.getAttribute("researchDesign");
        }
        
        evidenceSource.setBibRef(request.getParameter("bibRef"));
        evidenceSource.setResearchLevel(request.getParameter("researchLevel"));
        credibilityRating.setCredibilityLevel(request.getParameter("credibilityLevel"));
        credibilityRating.setReason(request.getParameter("reason"));
        credibilityRating.setRater(request.getParameter("rater"));
        researchDesign.setQuestion(request.getParameter("question"));
        researchDesign.setMethod(request.getParameter("method"));
        researchDesign.setParticipants(request.getParameter("participants"));
        researchDesign.setMetrics(request.getParameter("metrics"));
        
        httpSession.setAttribute("evidenceSource", evidenceSource);
        httpSession.setAttribute("credibilityRating", credibilityRating);
        httpSession.setAttribute("researchDesign", researchDesign);
        
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/evidenceItemForm.jsp");
        dispatcher.forward(request, response);
        //dispatcher.include(request, response);
    }
}
