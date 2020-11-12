package vieirabarbosa.com.br.grade.DTO;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class GradeTestDTO {
		String year;
		String term;
		String grade;
		String ciclo;
}
