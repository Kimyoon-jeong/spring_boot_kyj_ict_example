package edu.ict.ex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import edu.ict.ex.service.EmpService;
import edu.ict.ex.vo.EmpVO;
import lombok.extern.slf4j.Slf4j;

//https://luckyguystory.tistory.com/96
//ResponseEntity<String> 객체
//@RestController : Controller가 REST 방식을 처리하기 위한 것임을 명시
//@ResponseBody : 일반적인 JSP와 같은 뷰로 전달되는 게 아니라 데이터 자체를 전달하기 위한 용도
//@PathVariable : URL 경로에 있는 값을 파라미터로 추출할 때 사용
//@CrossOrigin : Ajax의 크로스 도메인 문제를 해결해주는 어노테이션
//@RequestBody : JSON 데이터를 원하는 타입으로 바인딩 처리


//RestController 란 기존의 controller의 속성하고는 다름

@RestController
@RequestMapping("/emps")
public class RestEmpController {
	
	@Autowired
	private EmpService empService;
	
	//자바객체를 json으로 바꿔서 서비스 하고있음
	@GetMapping("/list")
	public List<EmpVO>list(){

		return empService.getList();
	}


	@DeleteMapping("/{empno}") 
	public ResponseEntity<String> delete(EmpVO emp){

		
		ResponseEntity<String>entity=null;
		
		try {
			int rn=empService.remove(emp.getEmpno());
			

			entity=new ResponseEntity<String>(String.valueOf(rn),HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			//삭제가 실패하면 실패 상태메시지 저장
			entity = new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}

		return entity;
	}
	
}
