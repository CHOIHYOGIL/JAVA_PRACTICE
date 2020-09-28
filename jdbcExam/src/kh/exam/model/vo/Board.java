package kh.exam.model.vo;

import java.util.Date;

public class Board {
	private int boardNo;
	private String boardTitle;
	private String boardContent;
	private String boardWriter;
	private int readCount;
	private Date write_Date;
	public Board() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Board(int boardNo, String boardTitle, String boardContent, String boardWriter, int readCount,
			Date write_Date) {
		super();
		this.boardNo = boardNo;
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.boardWriter = boardWriter;
		this.readCount = readCount;
		this.write_Date = write_Date;
	}
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public String getBoardWriter() {
		return boardWriter;
	}
	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}
	public int getReadCount() {
		return readCount;
	}
	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}
	public Date getWrite_Date() {
		return write_Date;
	}
	public void setWrite_Date(Date write_Date) {
		this.write_Date = write_Date;
	}


}
