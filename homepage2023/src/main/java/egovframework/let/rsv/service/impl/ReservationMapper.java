package egovframework.let.rsv.service.impl;

import java.util.List;

import egovframework.let.member.service.MemberVO;
import egovframework.let.rsv.service.ReservationVO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Mapper("reservationMapper")
public interface ReservationMapper {
	
	//예약목록가져오기
	List<EgovMap> selectReservationList(ReservationVO vo) throws Exception;
	
	//예약목록수
	int selectReservationListCnt(ReservationVO vo) throws Exception;
	
	//예약상세정보
	 ReservationVO selectReservation(ReservationVO vo) throws Exception;

	//예약등록하기
	void insertReservation(ReservationVO vo)throws Exception;
	
	//예약수정하기
	 void updateReservation(ReservationVO vo)throws Exception;
	
	//예약삭제하기
	 void deleteReservation(ReservationVO vo)throws Exception;
}
