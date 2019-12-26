package com.board.example.dao;

import java.util.List;
import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;  // mybaits 에 담겨있는 ibatis  pom.xml 에 들어와있다는 것을 의미 
import org.springframework.stereotype.Repository;

import com.board.example.dto.BoardDTO;

@Repository
public class BoardDAOImpl implements BoardDAO {// BoardDAO 를 implements 한  Class

	@Inject
	SqlSession sqlSession;
	
	@Override
	public List<BoardDTO> boardList() throws Exception {
		return sqlSession.selectList("board.boardList");
	}

	//2.게시물 상세내용 불러오기 
	@Override
	public BoardDTO boardRead(int bno) throws Exception {
		//selectOne :  많은 레코드 중에서 하나만 읽어 옴
		/*sqlSession 의 select 로 이동 */
		return sqlSession.selectOne("board.boardRead",bno);
	}

	// 3. 게시물 글쓰기  mapper(namespace).id
	@Override
	public void writerBoard(BoardDTO bdto) throws Exception {
		 sqlSession.insert("board.boardWriter", bdto);
	}

	//4. 게시물 수정   board.boardUpdate에  bdto 를 보내 쿼리 실행  
	@Override
	public void boardUpdate(BoardDTO bdto) throws Exception {
		sqlSession.update("board.boardUpdate", bdto);
	}

	//5. 게시물 삭제 
	@Override
	public void boardDelete(int bno) throws Exception {
		sqlSession.delete("board.boardDelete", bno);
	}

	//6. 게시물 조회수 업데이트
	@Override
	public void viewCount(int bno) throws Exception {
		sqlSession.update("board.viewUpdate",bno);
	} 
	

}
