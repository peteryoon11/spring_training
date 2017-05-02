package com.controller;

import static org.hamcrest.CoreMatchers.instanceOf;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.entity.LoginDTO;
import com.entity.MemberDTO;

public class GlobalValidator implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		// loginDTO 가 넘어옴 logindto 가 맞는지 확인하는 메소드
		// TODO Auto-generated method stub
		boolean result = false;

		
	//	return LoginDTO.class.isAssignableFrom(arg0);
	return true;
	}

	@Override
	public void validate(Object arg0, Errors error) {
		
		if(arg0 instanceof LoginDTO)
		{
			LoginDTO dto = (LoginDTO) arg0;
			String userid=dto.getUserid();
			String passwd=dto.getPasswd();
			if(userid==null||userid.trim().isEmpty())
			{
				// 필드명  에러코드 에러를 보여줄 메시지
				System.out.println("isEmpty");
				error.rejectValue("userid","xxx");
				
			     //             null 자리는 리소스 번들 사용 할때 사용함	
			}
			
			ValidationUtils.rejectIfEmptyOrWhitespace(error, "passwd","yyy");
					
		}
		else 	if(arg0 instanceof MemberDTO)
			
		{
			MemberDTO dto = (MemberDTO) arg0;
			
	System.out.println("memberdTO validate");		
		/*	ValidationUtils.rejectIfEmptyOrWhitespace(error, "email","zzz");
			ValidationUtils.rejectIfEmptyOrWhitespace(error, "address","kkk");
		*/	
	String address=dto.getAddress();
	
	if(address==null||address.trim().isEmpty())
			{
				// 필드명  에러코드 에러를 보여줄 메시지
				System.out.println("isEmpty");
				error.rejectValue("address","kkk");
				
			     //             null 자리는 리소스 번들 사용 할때 사용함	
			}
			
			ValidationUtils.rejectIfEmptyOrWhitespace(error, "email","zzz");
		
			
			
		}
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
