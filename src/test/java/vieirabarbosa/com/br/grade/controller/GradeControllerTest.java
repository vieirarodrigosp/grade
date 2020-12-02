package vieirabarbosa.com.br.grade.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;

import vieirabarbosa.com.br.grade.DTO.GradeDTO;
import vieirabarbosa.com.br.grade.business.object.RegisterGradeBO;
import vieirabarbosa.com.br.grade.config.VariablesMocked;
import vieirabarbosa.com.br.grade.enums.CicloEnum;
import vieirabarbosa.com.br.grade.enums.GradeEnum;
import vieirabarbosa.com.br.grade.enums.TermEnum;

@RunWith(SpringRunner.class)
public class GradeControllerTest {
	@InjectMocks
	private GradeController gradeController;
	@Mock
	private RegisterGradeBO registerGrade;
	@Test
	public void createGradeSucess() {
		when(registerGrade.createGradeDTO(Mockito.any())).thenReturn(true);
		assertEquals(true, gradeController.createGrade(VariablesMocked.getGrade()));
	}
	@Test
	public void createGradeFalse() {
		when(gradeController.createGrade(Mockito.any())).thenReturn(false);
		assertEquals(false, gradeController.createGrade(null));
	}
	@Test
	public void getStudentListWithList() {
		when(gradeController.getGradeList()).thenReturn(VariablesMocked.getGradeListObject("withList"));
		assertEquals(1, gradeController.getGradeList().length);
	}
	@Test
	public void getStudentListNoList() {
		when(gradeController.getGradeList()).thenReturn(VariablesMocked.getGradeListObject("withList"));
		assertNotEquals(3, gradeController.getGradeList().length);
	}
	@Test
	public void getStudentDTObyIdSucess() {
		when(gradeController.getGradeDTObyId(Mockito.anyInt())).thenReturn(VariablesMocked.getGrade());
		assertEquals(CicloEnum.ENSINO_FUNDAMENTAL, gradeController.getGradeDTObyId(0).getCiclo());
	}
	@Test
	public void getStudentDTObyIdFalse() {
		when(gradeController.getGradeDTObyId(Mockito.anyInt())).thenReturn(VariablesMocked.getGrade());
		assertNotEquals(GradeEnum.NOVA_SERIE, gradeController.getGradeDTObyId(0).getGrade());
	}
	@Test
	public void updateStudentDTObyIdSucess() {
		when(gradeController.updateGradeDTObyId(Mockito.anyInt(), Mockito.any())).thenReturn(VariablesMocked.getGrade());
		assertEquals(TermEnum.MANHA, gradeController.updateGradeDTObyId(0, VariablesMocked.getGrade()).getTerm());
	}
	@Test
	public void deleteStudentDTObyIdSucess() {
		when(gradeController.deleteGradeDTObyId(Mockito.anyInt())).thenReturn(VariablesMocked.getGrade());
		assertEquals("6", gradeController.deleteGradeDTObyId(0).getYear());
	}
	@Test
	public void setStudentDTOSucess() {
		when(gradeController.getGradeDTObyId(Mockito.anyInt())).thenReturn(VariablesMocked.getGrade());
		GradeDTO grade = GradeDTO.builder().build();
		grade.setCiclo(CicloEnum.ENSINO_TECNICO);
		grade.setGrade(GradeEnum.SEGUNDO_COLEGIAL_TEC);
		grade.setTerm(TermEnum.NOITE);
		grade.setYear("3");
		assertEquals(CicloEnum.ENSINO_TECNICO, grade.getCiclo());
	}
}