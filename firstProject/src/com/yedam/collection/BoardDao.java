package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	public List<Board> getBoardList() {
	List<Board> list = new ArrayList<>();
	list.add(new Board("자바","어려워요"));
	list.add(new Board("다희","귀여움"));
	list.add(new Board("고양이","돼지"));
	list.add(new Board("애기","찡찡이"));
	
	return list;
	
	}
}