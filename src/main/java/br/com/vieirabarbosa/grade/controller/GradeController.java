package br.com.vieirabarbosa.grade.controller;

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

import br.com.vieirabarbosa.grade.DTO.GradeDTO;
import br.com.vieirabarbosa.grade.business.object.RegisterGradeBO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/school")
@Api(value = "API REST Grade"
, tags = "School enrollment registration microservice API"
, description = "This microservice is responsible for registering, updating, deleting and listing student enrollments and their curriculum.")
public class GradeController {
	@Autowired
	private RegisterGradeBO registerGrade;
	@PostMapping(path = "/v1/grades")
	@ApiOperation(value = "This method is responsible for creating new curricular grid records.")
	public @ResponseBody Boolean createGrade(@RequestBody GradeDTO grade) {
		return registerGrade.createGradeDTO(grade);
	}
	@GetMapping(path = "/v1/grades")
	@ApiOperation(value = "This method is responsible for listing all curriculum register records.")
	public @ResponseBody Object[] getGradeList() {
		return registerGrade.getGradeDTOList();
	}
	@GetMapping(path = "/v1/grades/{id}")
	@ApiOperation(value = "This method is responsible for displaying a record of the curriculum by id.")
	public @ResponseBody GradeDTO getGradeDTObyId(@PathVariable("id") int id) {
		return registerGrade.getGradeDTObyId(id);
	}
	@PutMapping(path = "/v1/grades/{id}")
	@ApiOperation(value = "This method is responsible for updating a curriculum record by id.")
	public @ResponseBody GradeDTO updateGradeDTObyId(
			@PathVariable("id") int id
			, @RequestBody GradeDTO grade) {
		return registerGrade.updateGradeDTObyId(id, grade);
	}
	@DeleteMapping(path = "/v1/grades/{id}")
	@ApiOperation(value = "This method is responsible for deleting a record of curriculum by id.")
	public @ResponseBody GradeDTO deleteGradeDTObyId(@PathVariable("id") int id) {
		return registerGrade.deleteGradeDTObyId(id);
	}
}