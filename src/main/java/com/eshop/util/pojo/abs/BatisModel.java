package com.eshop.util.pojo.abs;

import com.eshop.util.PageUtil;

public abstract class BatisModel {

	private PageUtil pageUtil;

	public PageUtil getPageUtil() {
		if (pageUtil == null)
			pageUtil = new PageUtil();
		return pageUtil;
	}

	public void setPageUtil(PageUtil pageUtil) {
		this.pageUtil = pageUtil;
	}

}
