package edu.ict.ex.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.ict.ex.vo.BoardVO;


@Service
public interface BoardService {
	List<BoardVO>getList();
	BoardVO get(int bno);//bno가 넘어오면 해당 번호를 select해서 BoardVO로 전달
	
	int remove(int bid);
	void write(String bname, String btitle, String bcontent);
	void modify(int bid, String bname, String btitle, String bcontent);

}
