package com.office.ex;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("*.mem")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public MemberController() {
    }

	//
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String RequstURL = request.getRequestURL().toString();
//		System.out.println("RequstURL: " + RequstURL);
		
//	    String RequstURI = request.getRequestURI();
//	    System.out.println("RequstURI: " + RequstURI);
//	    
//	    /*
//	     * RequstURI: /firstpjt/signup.mem 이렇게 들어온다 
//	     * RequstURI: /firstpjt/signin.mem 
//	     * 앞에 컨테스트넥스는 필요가 없으니 그걸 없애야 한다. signin.mem 이것만필요
//	     */
//	    
//	    String contextPath = request.getContextPath();
//	    System.out.println("contextPath: " + contextPath);
//	    
//	    /*
//	     * firstpft
//	     */
//	    ///firstpjt/signup.mem 이게 리퀘스트 uri인데 여기에 substring 이 문자를 잘라내는거 contextPath만큼 잘라내고 반환
//	    
//	    String command = RequstURI.substring(contextPath.length()); 
//	    System.out.println("command: " + command);
	    
	    String RequstURI = request.getRequestURI();
	    String contextPath = request.getContextPath();
	    String command = RequstURI.substring(contextPath.length()); 
	    
	   MemberService memberService = null;
	   String nextPage = null;
	    
	    switch (command) {
		case "/signup.mem": 
			nextPage = "View/member/signup_form.jsp";
			break;
			
		case "signup_confirm.mem":
			memberService = new MemberService();
			
			memberService.si
			break;
			
        case "/signin.mem": 
			
			break;
		}
		
	    RequestDispatcher requestDispatcher = request.getRequestDispatcher(nextPage);
	    requestDispatcher.forward(request, response);
	    
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doGet(request, response);
	}

}
