package cn.com.hs.test.common;

import java.io.Serializable;
import java.util.List;

public class PageData implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<?> pageList;
	private Long totalCount;
	private Integer pageSize;
	private Integer pageNo;
	private Integer totalPage;


	public List<?> getPageList() {
		return pageList;
	}

	public void setPageList(List<?> pageList) {
		this.pageList = pageList;
	}

	public Long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	@Override
	public String toString() {
		return "PageData{" +
				"pageList=" + pageList +
				", totalCount=" + totalCount +
				", pageSize=" + pageSize +
				", pageNo=" + pageNo +
				", totalPage=" + totalPage +
				'}';
	}
}
