package br.com.alura.forum.Dto;

import br.com.alura.forum.modelo.Topico;
import org.springframework.data.domain.Page;


import java.time.LocalDateTime;


public class TopicoDto {

    private Long id;
    private String titulo;
    private String mensagem;
    private LocalDateTime dataCriacao;

    public TopicoDto(Topico topico){
        this.id = topico.getId();
        this.titulo = topico.getTitulo();
        this.mensagem = topico.getMensagem();
        this.dataCriacao = topico.getDataCriacao();
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public static Page<TopicoDto> converter(Page<Topico> topico){
        return  topico.map(TopicoDto::new);//Esta convertendo o topico em topico dto, map esta fazendo mapeamento;

    }
}