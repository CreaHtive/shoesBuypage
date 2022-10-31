package com.jsplec.bbs.com;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.jsplec.bbs.dao.SDao;
import com.jsplec.bbs.dto.SDto;

public class SDetailCommand implements SCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String pId = request.getParameter("id");
		SDao dao = new SDao();
		SDto dto = dao.contentView(pId);
		
		request.setAttribute("detail_view", dto);

	}

}
