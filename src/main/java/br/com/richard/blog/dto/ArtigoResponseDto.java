package br.com.richard.blog.dto;

import br.com.richard.blog.model.Categoria;

public record ArtigoResponseDto(
    Long id,
    String codigo,
    String titulo,
    String conteudo,
    String autor,
    String dataPublicacao,
    Categoria categoria
) {}