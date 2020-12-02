package vieirabarbosa.com.br.grade.config;

import java.util.ArrayList;
import java.util.List;

import vieirabarbosa.com.br.grade.DTO.GradeDTO;
import vieirabarbosa.com.br.grade.enums.CicloEnum;
import vieirabarbosa.com.br.grade.enums.GradeEnum;
import vieirabarbosa.com.br.grade.enums.TermEnum;

public class VariablesMocked {
	public static GradeDTO getGrade() {
		return GradeDTO.builder().year("6").term(TermEnum.MANHA).grade(GradeEnum.QUINTA_SERIE).ciclo(CicloEnum.ENSINO_FUNDAMENTAL).build();
	}
	public static Object[] getGradeListObject(String scenario){
		List<GradeDTO> gradeListDTO = new ArrayList<GradeDTO>();
		switch (scenario) {
		case "withList":
			gradeListDTO.add(getGrade());
			break;
		default:
			break;
		}
		return gradeListDTO.toArray();
	}
}