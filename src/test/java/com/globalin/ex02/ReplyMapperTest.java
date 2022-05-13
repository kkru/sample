package com.globalin.ex02;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.globalin.domain.Criteria;
import com.globalin.domain.ReplyVO;
import com.globalin.mapper.ReplyMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class ReplyMapperTest {
	
	// 테스트 전에 확인했던 실제 존재하는 게시물 번호 (bno)
	// 실제 존재하지 않는 bno로 삽입하려고 하면 제약조건 위배 발생!!
	private int[] bnoArr = { 2049, 2048, 2047, 2046, 2045 };
	
	// 테스트할 매퍼
	@Autowired
	private ReplyMapper mapper;
	
//	@Test
//	public void testCreate() {
//		
//		for(int i=0; i<5; i++) {
//			ReplyVO vo = new ReplyVO();
//			
//			vo.setBno(bnoArr[i]);
//			vo.setReply("댓글 테스트 " + i);
//			vo.setReplyer("댓글 단사람 " + i);
//			
//			mapper.insert(vo);
//		}
//	}
	
//	@Test
//	public void testRead() {
//		
//		ReplyVO vo = mapper.read(2);
//		
//		vo.setReply("수정된 답글");
//		mapper.update(vo);
//		
//	}
	
	@Test
	public void testList() {
		
		Criteria cri = new Criteria();
		
		List<ReplyVO> replies = mapper.getListWithPaging(cri, bnoArr[1]);
		
		System.out.println(replies.toString());	
	}
	
	
}
