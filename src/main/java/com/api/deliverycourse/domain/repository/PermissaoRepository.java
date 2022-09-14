package com.api.deliverycourse.domain.repository;

import com.api.deliverycourse.domain.model.Permissao;

import java.util.List;

public interface PermissaoRepository {

	List<Permissao> listar();
	Permissao buscar(Long id);
	Permissao salvar(Permissao permissao);
	void remover(Permissao permissao);
	
}
