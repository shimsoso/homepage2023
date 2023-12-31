package egovframework.let.board.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.let.board.service.BoardService;
import egovframework.let.board.service.BoardVO;
import egovframework.let.crud.service.CrudService;
import egovframework.let.crud.service.CrudVO;
import egovframework.let.crud.service.impl.CrudMapper;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import egovframework.rte.fdl.property.EgovPropertyService;
import egovframework.rte.psl.dataaccess.util.EgovMap;


@Service("boardService")
public class BoardServiceImpl extends EgovAbstractServiceImpl implements BoardService {
	
	@Resource(name="boardMapper")
	private BoardMapper boardMapper;
	
	@Resource(name= "egovBoardIdGnrService")
	private EgovIdGnrService idgenService;
	
	//게시물 목록 가져오기
	public List<EgovMap> selectBoardList(BoardVO vo) throws Exception {
		return boardMapper.selectBoardList(vo);
	}
	
	//게시물 목록 수
	public int selectBoardListCnt(BoardVO vo) throws Exception {
		return boardMapper.selectBoardListCnt(vo);
	}
	
	//게시물 등록하기
	public String insertBoard(BoardVO vo) throws Exception {
		String id = idgenService.getNextStringId();
		vo.setBoardId(id);
		boardMapper.insertBoard(vo);
		
		return id;
	}
	
	//게시물 상세정보
	public BoardVO selectBoard(BoardVO vo) throws Exception {
		//조회수 업
		boardMapper.updateViewCnt(vo);
		/*
		 String a = null;
		 if(a.equals("aa")) a = "";
		 */
		
		return boardMapper.selectBoard(vo);
	}
	
//	//조회수 업데이트 (테스트용)
//	public void updateViewCnt(BoardVO vo) throws Exception {
//		boardMapper.updateViewCnt(vo);
//	}
	
	//게시물 수정하기
	public void updateBoard(BoardVO vo) throws Exception {
		boardMapper.updateBoard(vo);
	}
	
	//게시물 삭제하기
	public void deleteBoard(BoardVO vo) throws Exception {
		boardMapper.deleteBoard(vo);
	}
}
