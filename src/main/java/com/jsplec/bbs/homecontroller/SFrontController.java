package com.jsplec.bbs.homecontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.bbs.com.SBuyCommand;
import com.jsplec.bbs.com.SCartCommand;
import com.jsplec.bbs.com.SCommand;
import com.jsplec.bbs.com.SDetailCommand;
import com.jsplec.bbs.com.SKidsListCommand;
import com.jsplec.bbs.com.SListCommand;
import com.jsplec.bbs.com.SMenListCommand;
import com.jsplec.bbs.com.SPaymentCommand;
import com.jsplec.bbs.com.SWomenListCommand;



/**
 * Servlet implementation class AFrontController
 */
@WebServlet("*.do")
public class SFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SFrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		actionDo(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actionDo(request,response);
	}
	
	protected void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		
		String viewPage = null;
		SCommand command = null;
		
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());
		
		switch(com) {
		
		//전체 내용 검색
		case("/list.do"):
			command = new SListCommand();
			command.execute(request, response);
			viewPage = "list.jsp";
			break;
			
		case("/menlist.do"):
			command = new SMenListCommand();
			command.execute(request, response);
			viewPage = "list.jsp";
			break;
			
		case("/womenlist.do"):
			command = new SWomenListCommand();
			command.execute(request, response);
			viewPage = "list.jsp";
			break;
			
		case("/kidslist.do"):
			command = new SKidsListCommand();
			command.execute(request, response);
			viewPage = "list.jsp";
			break;
		
		case("/detail_view.do"):
			command = new SDetailCommand();
			command.execute(request, response);
			viewPage = "detail_view.jsp";
			
			
			//카트에 정보 담기
		case("/cart.do"):
			command = new SCartCommand();
		command.execute(request, response);
		viewPage = "buy.do";
		
			//정보를 담고 buy.do 실행
			
			
			
		case("/buy.do"):
			command = new SBuyCommand();
		command.execute(request, response);
		viewPage = "buy.jsp";
		
		
		
		//결제하기 누르면 order에 insert해주는 command
		case("/payment.do"):
			command = new SPaymentCommand();
		
		command.execute(request, response);
		viewPage = "list.jsp";
		
	
			
		}//switch
		
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
		
	}

}//-------------------------
