package com.jsplec.bbs.com;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.bbs.dao.SDao;
import com.jsplec.bbs.dto.SDto;

public class SMenListCommand implements SCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
				SDao dao = new SDao();
				
				ArrayList<SDto> dtos = dao.menList();
				request.setAttribute("list", dtos);
	}

}
