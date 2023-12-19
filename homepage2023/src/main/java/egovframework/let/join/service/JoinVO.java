package egovframework.let.join.service;

import java.io.Serializable;

import egovframework.com.cmm.ComDefaultCodeVO;
import egovframework.com.cmm.ComDefaultVO;

public class JoinVO extends ComDefaultVO implements Serializable{

	//아이디
	private String emplyrId;
	
	//이름
	private String UserNm;
	
	//비밀번호
	private String password;
	
	//비밀번호 힌트
	private String passwordHint;
	
	//비밀번호 정답
	private String passwordCnsr;
	
	//사용자상태코드
	private String emplySttusCode;
	
	//회원고유ID
	private String esntlId;
	
	//이메일
	private String emailAdres;
	
	//이메일ID
	private String emailId;	
	
	//이메일 도메인
	private String emailDomain;
	
	//로그인타입
	private String loginType;
	
	//가입일자
	private java.util.Date sbscrbDe;

	public String getEmplyrId() {
		return emplyrId;
	}

	public void setEmplyrId(String emplyrId) {
		this.emplyrId = emplyrId;
	}

	public String getUserNm() {
		return UserNm;
	}

	public void setUserNm(String userNm) {
		UserNm = userNm;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordHint() {
		return passwordHint;
	}

	public void setPasswordHint(String passwordHint) {
		this.passwordHint = passwordHint;
	}

	public String getPasswordCnsr() {
		return passwordCnsr;
	}

	public void setPasswordCnsr(String passwordCnsr) {
		this.passwordCnsr = passwordCnsr;
	}

	public String getEmplySttusCode() {
		return emplySttusCode;
	}

	public void setEmplySttusCode(String emplySttusCode) {
		this.emplySttusCode = emplySttusCode;
	}

	public String getEsntlId() {
		return esntlId;
	}

	public void setEsntlId(String esntlId) {
		this.esntlId = esntlId;
	}

	public String getEmailAdres() {
		return emailAdres;
	}

	public void setEmailAdres(String emailAdres) {
		this.emailAdres = emailAdres;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getEmailDomain() {
		return emailDomain;
	}

	public void setEmailDomain(String emailDomain) {
		this.emailDomain = emailDomain;
	}

	public String getLoginType() {
		return loginType;
	}

	public void setLoginType(String loginType) {
		this.loginType = loginType;
	}

	public java.util.Date getSbscrbDe() {
		return sbscrbDe;
	}

	public void setSbscrbDe(java.util.Date sbscrbDe) {
		this.sbscrbDe = sbscrbDe;
	}
	
	
}
