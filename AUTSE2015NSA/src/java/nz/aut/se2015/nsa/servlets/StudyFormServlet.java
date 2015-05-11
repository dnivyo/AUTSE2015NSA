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
import nz.aut.se2015.nsa.persist.EvidenceItem;
import nz.aut.se2015.nsa.persist.EvidenceSource;
import nz.aut.se2015.nsa.persist.Method;
import nz.aut.se2015.nsa.persist.Methodology;
import nz.aut.se2015.nsa.persist.ResearchDesign;

/**
 *
 * @author erikzweidorff
 */
public class StudyFormServlet extends HttpServlet {
    EvidenceSource evidenceSource;
    CredibilityRating credibilityRating;
    ResearchDesign researchDesign;
    EvidenceItem evidenceItem;
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
    public void setAllParameters(HttpServletRequest request){
        //Check if there is allready an evidenceSource bean in the session.
        if (httpSession.getAttribute("evidenceSource") == null){
            evidenceSource = new EvidenceSource();
            httpSession.setAttribute("evidenceSource", evidenceSource);
        } else {
            evidenceSource = (EvidenceSource) httpSession.getAttribute("evidenceSource");
            evidenceSource.setBibRef(request.getParameter("bibRef"));
            evidenceSource.setResearchLevel(request.getParameter("researchLevel"));
            httpSession.setAttribute("evidenceSource", evidenceSource);
        }
        
        //Check if there is allready an credibilityRating bean in the session.
        if (httpSession.getAttribute("credibilityRating") == null){
            credibilityRating = new CredibilityRating();
            httpSession.setAttribute("credibilityRating", credibilityRating);
        } else {
            credibilityRating = (CredibilityRating) httpSession.getAttribute("credibilityRating");
            credibilityRating.setCredibilityLevel(request.getParameter("credibilityLevel"));
            credibilityRating.setReason(request.getParameter("reason"));
            credibilityRating.setRater(request.getParameter("rater"));
            httpSession.setAttribute("credibilityRating", credibilityRating);
        }
        
        //Check if there is allready an researchDesign bean in the session.
        if (httpSession.getAttribute("researchDesign") == null){
            researchDesign = new ResearchDesign();
            httpSession.setAttribute("researchDesign", researchDesign);
            httpSession.setAttribute("researchDesign", researchDesign);
        } else {
            researchDesign = (ResearchDesign) httpSession.getAttribute("researchDesign");
            researchDesign.setQuestion(request.getParameter("question"));
            researchDesign.setMethod(request.getParameter("method"));
            researchDesign.setParticipants(request.getParameter("participants"));
            researchDesign.setMetrics(request.getParameter("metrics"));
        }
        
        //Check if there is allready an evidenceItem bean in the session.
        if (httpSession.getAttribute("evidenceItem") == null) {
            evidenceItem = new EvidenceItem();
            httpSession.setAttribute("evidenceItem", evidenceItem);
        } else {
            evidenceItem = (EvidenceItem) httpSession.getAttribute("evidenceItem");
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
        }
        
        //Check if there is allready an method bean in the session.
        if (httpSession.getAttribute("method") == null){
            method = new Method();
            httpSession.setAttribute("method", method);
        } else{
            method = (Method) httpSession.getAttribute("method");
            method.setName(request.getParameter("methodName"));
            method.setDescription(request.getParameter("methodDescription"));
            httpSession.setAttribute("method", method);
        }
        
        //Check if there is allready an methodology bean in the session.
        if (httpSession.getAttribute("methodology") == null){
            methodology = new Methodology();
            httpSession.setAttribute("methodology", methodology);
        } else{
            methodology = (Methodology) httpSession.getAttribute("methodology");
            methodology.setName(request.getParameter("methodologyName"));
            methodology.setDescription(request.getParameter("methodologyDescription"));
            httpSession.setAttribute("methodology", methodology);
        }
}
}

