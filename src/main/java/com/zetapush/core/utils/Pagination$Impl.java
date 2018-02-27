package com.zetapush.core.utils;



public class Pagination$Impl implements Pagination {
	private Number pageSize;
	private Number pageNumber;
	private String direction;

	/** Default constructor */
	public Pagination$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param pageSize
	 *        page size<br>Validation constraints : <ul>
<li>Constraint <b>@Min</b> : <br>minimum value for an integer<br><ul>
<li><b>min</b> (minimum value): 1
</ul>
<li>Constraint <b>@Max</b> : <br>maximum value for an integer<br><ul>
<li><b>max</b> (maximum value): 200
</ul>
</ul>
	 * @param pageNumber
	 *        page number<br>Validation constraints : <ul>
<li>Constraint <b>@Min</b> : <br>minimum value for an integer<br><ul>
<li><b>min</b> (minimum value): 0
</ul>
</ul>
	 * @param direction
	 *        page direction
	 */
	public Pagination$Impl(Number pageSize, Number pageNumber, String direction) {
		this.pageSize = pageSize;
		this.pageNumber = pageNumber;
		this.direction = direction;
	}

	public Number getPageSize() {
		return pageSize;
	}

	/** Field pageSize
	 * page size<br>Validation constraints : <ul>
<li>Constraint <b>@Min</b> : <br>minimum value for an integer<br><ul>
<li><b>min</b> (minimum value): 1
</ul>
<li>Constraint <b>@Max</b> : <br>maximum value for an integer<br><ul>
<li><b>max</b> (maximum value): 200
</ul>
</ul>
	*/
	public void setPageSize(Number pageSize) {
		this.pageSize = pageSize;
	}

	public Number getPageNumber() {
		return pageNumber;
	}

	/** Field pageNumber
	 * page number<br>Validation constraints : <ul>
<li>Constraint <b>@Min</b> : <br>minimum value for an integer<br><ul>
<li><b>min</b> (minimum value): 0
</ul>
</ul>
	*/
	public void setPageNumber(Number pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getDirection() {
		return direction;
	}

	/** Field direction
	 * page direction
	*/
	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String toString() { 
		return "Pagination$Impl[pageSize=" + pageSize + ", pageNumber=" + pageNumber + ", direction=" + direction + "]";
	}
}
