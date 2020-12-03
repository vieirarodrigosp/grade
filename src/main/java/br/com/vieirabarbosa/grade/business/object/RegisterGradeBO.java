package br.com.vieirabarbosa.grade.business.object;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import br.com.vieirabarbosa.grade.DTO.GradeDTO;

@Component
public class RegisterGradeBO {
	public List<GradeDTO> gradeListDTO = new ArrayList<GradeDTO>();
	public Boolean createGradeDTO(GradeDTO grade) {
		return gradeListDTO.add(grade);
	}
	public Object[] getGradeDTOList() {
		return gradeListDTO.toArray();
	}
	public GradeDTO getGradeDTObyId(int id) {
		return gradeListDTO.get(id);
	}
	public GradeDTO updateGradeDTObyId(int id, GradeDTO grade) {
		return gradeListDTO.set(id, grade);
	}
	public GradeDTO deleteGradeDTObyId(int id) {
		return gradeListDTO.remove(id);
	}
}
