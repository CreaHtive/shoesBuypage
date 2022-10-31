package com.jsplec.bbs.com;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.bbs.dao.SDao;
import com.jsplec.bbs.dto.SDto;

public interface SCommand {
	public void execute(HttpServletRequest request,HttpServletResponse response);
}

