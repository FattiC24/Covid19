package com.fati.controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fati.DAO.ClsBeneficiario;
import com.fati.Negocio.ClsConsultar;
import com.fati.entidades.Personas;

/**
 * Servlet implementation class ControllerMostrarBeneficiario
 */
public class ControllerMostrarBeneficiario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerMostrarBeneficiario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
				HttpSession session = request.getSession(true);
				String soyBeneficiario = request.getParameter("soybeneficiario");
				String noBeneficiario = request.getParameter("nosoybeneficiario");

				String fullname = "";

				if (soyBeneficiario != null || noBeneficiario != null) {
					response.sendRedirect("index.jsp");
					session.invalidate();
				} else {
					String dui = request.getParameter("dui");
					Personas persona = new Personas();
					persona.setDUI(dui);
					ClsConsultar consultaDUI = new ClsConsultar();
					ClsBeneficiario clsBeneficiario = new ClsBeneficiario();

					fullname = clsBeneficiario.VerificarBeneficiario(persona);

					int soybeneficiario = consultaDUI.SoyBeneficiario(persona);

					if (soybeneficiario == 0) {
						response.sendRedirect("NoBeneficiario.jsp");
						session.setAttribute("nobeneficiario", soybeneficiario);

					} else if (soybeneficiario == 1) {

						response.sendRedirect("Beneficiario.jsp");
						session.setAttribute("beneficiario", soybeneficiario);
						session.setAttribute("fullname", fullname);
						System.out.println("Nombre del Beneficiario: " + fullname);
					}
				}
			}

}
