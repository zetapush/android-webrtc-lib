package com.zetapush.core.utils;



public class ResponsePagination$Impl implements ResponsePagination {
	private Number pageSize;
	private Number pageNumber;
	private String direction;
	private Boolean hasNext;

	/** Default constructor */
	public ResponsePagination$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param pageSize
	 *        The number of elements by page (minimum 1)<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
<li>Constraint <b>@Min</b> : <br>minimum value for an integer<br><ul>
<li><b>min</b> (minimum value): 1
</ul>
</ul>
	 * @param pageNumber
	 *        The page number (zero-based)<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
<li>Constraint <b>@Min</b> : <br>minimum value for an integer<br><ul>
<li><b>min</b> (minimum value): 0
</ul>
</ul>
	 * @param direction
	 *        Optional sort direction ('ASC'/'DESC'). Default is ASC when not specified.<br>Validation constraints : <ul>
<li>Constraint <b>@Enum</b> : <br>value must be part of the list<br><ul>
<li><b>list</b> (the list of authorized values): [ASC, DESC]
</ul>
</ul>
	 * @param hasNext
	 *        true to indicate if there is one more page available, false otherwise
	 */
	public ResponsePagination$Impl(Number pageSize, Number pageNumber, String direction, Boolean hasNext) {
		this.pageSize = pageSize;
		this.pageNumber = pageNumber;
		this.direction = direction;
		this.hasNext = hasNext;
	}

	public Number getPageSize() {
		return pageSize;
	}

	/** Field pageSize
	 * The number of elements by page (minimum 1)<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
<li>Constraint <b>@Min</b> : <br>minimum value for an integer<br><ul>
<li><b>min</b> (minimum value): 1
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
	 * The page number (zero-based)<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
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
	 * Optional sort direction ('ASC'/'DESC'). Default is ASC when not specified.<br>Validation constraints : <ul>
<li>Constraint <b>@Enum</b> : <br>value must be part of the list<br><ul>
<li><b>list</b> (the list of authorized values): [ASC, DESC]
</ul>
</ul>
	*/
	public void setDirection(String direction) {
		this.direction = direction;
	}

	public Boolean isHasNext() {
		return hasNext;
	}

	/** Field hasNext
	 * true to indicate if there is one more page available, false otherwise
	*/
	public void setHasNext(Boolean hasNext) {
		this.hasNext = hasNext;
	}

	public String toString() { 
		return "ResponsePagination$Impl[pageSize=" + pageSize + ", pageNumber=" + pageNumber + ", direction=" + direction + ", hasNext=" + hasNext + "]";
	}
}
