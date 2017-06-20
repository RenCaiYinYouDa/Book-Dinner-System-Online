package com.rcyyd.bookdinner.domain;

import java.util.List;

/**
 * ·ÖÒ³Æ÷
 * @author Âæê»
 *
 * @param <T>
 */
public class PageModel<T> {
	private List<T> dataList;
	private int currentPage;
	private int pageSize;
	private int totalPage;
	
	public PageModel() {
	}
	
	public PageModel(List<T> dataList, int currentPage, int pageSize, int totalPage) {
		this.dataList = dataList;
		this.currentPage = currentPage;
		this.pageSize = pageSize;
		this.totalPage = totalPage;
	}

	public List<T> getDataList() {
		return dataList;
	}

	public void setDataList(List<T> dataList) {
		this.dataList = dataList;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

}
