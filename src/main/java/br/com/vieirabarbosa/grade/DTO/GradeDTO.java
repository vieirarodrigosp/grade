package br.com.vieirabarbosa.grade.DTO;

import br.com.vieirabarbosa.grade.enums.CicloEnum;
import br.com.vieirabarbosa.grade.enums.GradeEnum;
import br.com.vieirabarbosa.grade.enums.TermEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class GradeDTO {
	String year;
	TermEnum term;
	GradeEnum grade;
	CicloEnum ciclo;
}