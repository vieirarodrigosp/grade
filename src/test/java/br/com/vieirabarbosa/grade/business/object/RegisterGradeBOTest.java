package br.com.vieirabarbosa.grade.business.object;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.util.ReflectionTestUtils;

import br.com.vieirabarbosa.grade.DTO.GradeDTO;
import br.com.vieirabarbosa.grade.config.VariablesMocked;
import br.com.vieirabarbosa.grade.enums.CicloEnum;
import br.com.vieirabarbosa.grade.enums.GradeEnum;
import br.com.vieirabarbosa.grade.enums.TermEnum;

@RunWith(SpringRunner.class)
public class RegisterGradeBOTest {
	@InjectMocks
	private RegisterGradeBO registerGradeBO;
	@Before
	public void init() {
		ReflectionTestUtils.setField(registerGradeBO, "gradeListDTO", new ArrayList<GradeDTO>());
		registerGradeBO.gradeListDTO.add(VariablesMocked.getGrade());
	}
	@Test
	public void createGradeSucess() {
		assertEquals(true, registerGradeBO.createGradeDTO(VariablesMocked.getGrade()));
	}
	@Test
	public void gradeListSucess() {
		assertEquals(1, registerGradeBO.getGradeDTOList().length);
	}
	@Test
	public void getgradeDTObyIdSucess() {
		assertEquals(CicloEnum.ENSINO_FUNDAMENTAL, registerGradeBO.getGradeDTObyId(0).getCiclo());
	}
	@Test
	public void updategradeDTObyIdSucess() {
		assertEquals(GradeEnum.QUINTA_SERIE, registerGradeBO.updateGradeDTObyId(0, VariablesMocked.getGrade()).getGrade());
	}
	@Test
	public void deletegradeDTObyIdSucess() {
		assertEquals(TermEnum.MANHA, registerGradeBO.deleteGradeDTObyId(0).getTerm());
	}
}