package br.com.vieirabarbosa.grade.config;

import java.util.ArrayList;
import java.util.List;

import br.com.vieirabarbosa.grade.DTO.GradeDTO;
import br.com.vieirabarbosa.grade.enums.CicloEnum;
import br.com.vieirabarbosa.grade.enums.GradeEnum;
import br.com.vieirabarbosa.grade.enums.TermEnum;

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