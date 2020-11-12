package vieirabarbosa.com.br.grade.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import vieirabarbosa.com.br.grade.DTO.GradeDTO;
import vieirabarbosa.com.br.grade.business.object.RegisterGradeBO;

@RestController
@RequestMapping("/school")
public class GradeController {
	@Autowired
	private RegisterGradeBO registerGrade;
	@PostMapping(path = "/v1/grades")
	public @ResponseBody Boolean createGrade(@RequestBody GradeDTO grade) {
		return registerGrade.createGradeDTO(grade);
	}
	@GetMapping(path = "/v1/grades")
	public @ResponseBody Object[] getGradeList() {
		return registerGrade.getGradeDTOList();
	}
	@GetMapping(path = "/v1/grades/{id}")
	public @ResponseBody GradeDTO getGradeDTObyId(@PathVariable("id") int id) {
		return registerGrade.getGradeDTObyId(id);
	}
	@PutMapping(path = "/v1/grades/{id}")
	public @ResponseBody GradeDTO updateGradeDTObyId(
			@PathVariable("id") int id
			, @RequestBody GradeDTO grade) {
		return registerGrade.updateGradeDTObyId(id, grade);
	}
	@DeleteMapping(path = "/v1/grades/{id}")
	public @ResponseBody GradeDTO deleteGradeDTObyId(@PathVariable("id") int id) {
		return registerGrade.deleteGradeDTObyId(id);
	}
}