package vieirabarbosa.com.br.grade.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import vieirabarbosa.com.br.grade.enums.CicloEnum;
import vieirabarbosa.com.br.grade.enums.GradeEnum;
import vieirabarbosa.com.br.grade.enums.TermEnum;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class GradeDTO {
	String year;
	TermEnum term;
	GradeEnum grade;
	CicloEnum ciclo;
//	String year;
//	String term;
//	String grade;
//	String ciclo;
	
//	String name;
//	String matricula;
}