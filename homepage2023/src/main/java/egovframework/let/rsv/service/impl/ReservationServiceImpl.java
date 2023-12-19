package egovframework.let.rsv.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.com.cmm.LoginVO;
import egovframework.let.login.service.LoginService;
import egovframework.let.member.service.MemberService;
import egovframework.let.member.service.MemberVO;
import egovframework.let.rsv.service.ReservationService;
import egovframework.let.rsv.service.ReservationVO;
import egovframework.let.utl.sim.service.EgovFileScrty;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import egovframework.rte.fdl.property.EgovPropertyService;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Service("reservationService")
public class ReservationServiceImpl extends EgovAbstractServiceImpl implements ReservationService {
   
   @Resource(name = "propertiesService")
   private EgovPropertyService propertyService;
	
   @Resource(name = "reservationMapper")
   private ReservationMapper reservationMapper;
   
   @Resource(name="egovRsvIdGnrService")
	private EgovIdGnrService idgenService;
   
	//예약목록가져오기
	public List<EgovMap> selectReservationList(ReservationVO vo) throws Exception{
		return reservationMapper.selectReservationList(vo);
	}
	
	//예약목록수
	public int selectReservationListCnt(ReservationVO vo) throws Exception{
		return reservationMapper.selectReservationListCnt(vo);
	}
	
	//예약상세정보
	public ReservationVO selectReservation(ReservationVO vo) throws Exception{
		return reservationMapper.selectReservation(vo);
	}

	//예약등록하기
	public String insertReservation(ReservationVO vo)throws Exception{
		String id =idgenService.getNextStringId();
		vo.setResveId(id);
		reservationMapper.insertReservation(vo);
		
		return id;
	}
	
	//예약수정하기
	public void updateReservation(ReservationVO vo)throws Exception{
		reservationMapper.updateReservation(vo);
	}
	
	//예약삭제하기
	public void deleteReservation(ReservationVO vo)throws Exception{
		reservationMapper.deleteReservation(vo);
	}
	
	
	
   
}
