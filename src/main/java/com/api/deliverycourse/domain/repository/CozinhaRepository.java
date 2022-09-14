package com.api.deliverycourse.domain.repository;


import com.api.deliverycourse.domain.model.Cozinha;

import java.util.List;

public interface CozinhaRepository {

	List<Cozinha> listar();
	Cozinha buscar(Long id);
	Cozinha salvar(Cozinha cozinha);
	void remover(Cozinha cozinha);
	
}
