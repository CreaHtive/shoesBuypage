package com.jsplec.bbs.com;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.jsplec.bbs.dao.SDao;

import com.jsplec.bbs.dto.SDto;

public class SListCommand implements SCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		SDao dao = new SDao();
		ArrayList<SDto> dtos = dao.list();
		request.setAttribute("list", dtos);
				
		
	}

}
