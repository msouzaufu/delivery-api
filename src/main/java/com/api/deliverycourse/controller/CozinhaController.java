package com.api.deliverycourse.controller;

import com.api.deliverycourse.domain.model.Cozinha;
import com.api.deliverycourse.domain.repository.CozinhaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/cozinhas")
public class CozinhaController {

	@Autowired
	private CozinhaRepository cozinhaRepository;
	
	@GetMapping
	public List<Cozinha> listar() {
		return cozinhaRepository.listar();
	}

	@GetMapping("/{cozinhaId}")
	public ResponseEntity<Cozinha> buscar(@PathVariable Long cozinhaId) {
		Cozinha cozinha = cozinhaRepository.buscar(cozinhaId);

		if (cozinha != null) {
			return ResponseEntity.ok(cozinha);
		}

		return ResponseEntity.notFound().build();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Cozinha adicionar(@RequestBody Cozinha cozinha){
		return cozinhaRepository.salvar(cozinha);
	}


	@PutMapping("/{cozinhaId}")
	public ResponseEntity<Cozinha> atualizar(@PathVariable Long idCozinha,
											 @RequestBody Cozinha cozinha){
		Cozinha cozinhaEntity = cozinhaRepository.buscar(idCozinha);

		BeanUtils.copyProperties(cozinha, cozinhaEntity, "id");

		cozinhaRepository.salvar(cozinhaEntity);

		return ResponseEntity.ok(cozinhaEntity);
	}

	
}
