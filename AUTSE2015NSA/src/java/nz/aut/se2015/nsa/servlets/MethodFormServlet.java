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
import nz.aut.se2015.nsa.persist.ConfidenceRating;
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
public class MethodFormServlet extends HttpServlet {

    EvidenceSource evidenceSource;
    CredibilityRating credibilityRating;
    ResearchDesign researchDesign;
    ConfidenceRating confidenceRating;
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
        System.out.println("MethodFormServlet: doGet");
        httpSession = request.getSession(true);
        this.setAllParameters(request);
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
        this.setAllParameters(request);

        // Check if next or previous was clicked
        String url = "/WEB-INF/evidenceItemForm.jsp";
        if (request.getParameter("previous") != null) {
            url = "/WEB-INF/studyForm.jsp";
        }

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }

    public void setAllParameters(HttpServletRequest request) {
        //Check if there is allready an evidenceSource bean in the session.
        if (httpSession.getAttribute("evidenceSource") == null) {
            evidenceSource = new EvidenceSource();
            httpSession.setAttribute("evidenceSource", evidenceSource);
        } else {
            evidenceSource = (EvidenceSource) httpSession.getAttribute("evidenceSource");
            if (request.getParameter("bibRef") != null) {
                evidenceSource.setBibRef(request.getParameter("bibRef"));
                evidenceSource.setResearchLevel(request.getParameter("researchLevel"));
                evidenceSource.setAuthor(request.getParameter("author"));
                evidenceSource.setJournal(request.getParameter("journal"));
                evidenceSource.setPublishingYear(request.getParameter("publishingYear"));
                evidenceSource.setTitle(request.getParameter("title"));
                httpSession.setAttribute("evidenceSource", evidenceSource);
            }
        }

        //Check if there is allready an credibilityRating bean in the session.
        if (httpSession.getAttribute("credibilityRating") == null) {
            credibilityRating = new CredibilityRating();
            httpSession.setAttribute("credibilityRating", credibilityRating);
        } else {
            credibilityRating = (CredibilityRating) httpSession.getAttribute("credibilityRating");
            if (request.getParameter("credibilityLevel") != null) {
                credibilityRating.setCredibilityLevel(request.getParameter("credibilityLevel"));
                credibilityRating.setReason(request.getParameter("reason"));
                credibilityRating.setRater(request.getParameter("rater"));
                httpSession.setAttribute("credibilityRating", credibilityRating);
            }

        }

        //Check if there is allready an researchDesign bean in the session.
        if (httpSession.getAttribute("researchDesign") == null) {
            researchDesign = new ResearchDesign();
            httpSession.setAttribute("researchDesign", researchDesign);

        } else {
            researchDesign = (ResearchDesign) httpSession.getAttribute("researchDesign");
            if (request.getParameter("question") != null) {
                researchDesign.setQuestion(request.getParameter("question"));
                researchDesign.setMethod(request.getParameter("method"));
                researchDesign.setParticipants(request.getParameter("participants"));
                researchDesign.setMetrics(request.getParameter("metrics"));
                httpSession.setAttribute("researchDesign", researchDesign);
            }

        }
        
                //Check if there is allready a confidenceRating bean in the session
        if (httpSession.getAttribute("confidenceRating") == null) {
            confidenceRating = new ConfidenceRating();
            httpSession.setAttribute("confidenceRating", confidenceRating);
        } else {
            confidenceRating = (ConfidenceRating) httpSession.getAttribute("confidenceRating");
            if (request.getParameter("confidenceRatingConfidenceLevel") != null) {
                confidenceRating.setConfidenceLevel(request.getParameter("confidenceRatingConfidenceLevel"));
                confidenceRating.setRater(request.getParameter("confidenceRatingRater"));
                confidenceRating.setReason(request.getParameter("confidenceRatingReason"));
                httpSession.setAttribute("confidenceRatinng", confidenceRating);
            }
        }

        //Check if there is allready an evidenceItem bean in the session.
        if (httpSession.getAttribute("evidenceItem") == null) {
            evidenceItem = new EvidenceItem();
            httpSession.setAttribute("evidenceItem", evidenceItem);
        } else {
            evidenceItem = (EvidenceItem) httpSession.getAttribute("evidenceItem");
            if (request.getParameter("contextHow") != null) {
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

        }

        //Check if there is allready an method bean in the session.
        if (httpSession.getAttribute("method") == null) {
            method = new Method();
            httpSession.setAttribute("method", method);
        } else {
            method = (Method) httpSession.getAttribute("method");
            if (request.getParameter("methodName") != null) {
                method.setName(request.getParameter("methodName"));
                method.setDescription(request.getParameter("methodDescription"));
                httpSession.setAttribute("method", method);
            }
        }

        //Check if there is allready an methodology bean in the session.
        if (httpSession.getAttribute("methodology") == null) {
            methodology = new Methodology();
            httpSession.setAttribute("methodology", methodology);
        } else {
            methodology = (Methodology) httpSession.getAttribute("methodology");
            if (request.getParameter("methodologyName") != null) {
                methodology.setName(request.getParameter("methodologyName"));
                methodology.setDescription(request.getParameter("methodologyDescription"));
                httpSession.setAttribute("methodology", methodology);
            }
        }
    }
}
