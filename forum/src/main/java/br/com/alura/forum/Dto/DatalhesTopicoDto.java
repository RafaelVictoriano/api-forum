package br.com.alura.forum.Dto;

import br.com.alura.forum.modelo.StatusTopico;
import br.com.alura.forum.modelo.Topico;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

import java.time.LocalDateTime;
import java.util.stream.Collectors;

@Getter
public class DatalhesTopicoDto {

    private Long id;
    private String titulo;
    private String mensagem;
    private LocalDateTime dataCriacao;
    private String nomeAutor;
    private StatusTopico statusTopico;
    private List<RespotaDto> resposta;

    public DatalhesTopicoDto(Topico topico){
        this.id = topico.getId();
        this.titulo = topico.getTitulo();
        this.mensagem = topico.getMensagem();
        this.dataCriacao = topico.getDataCriacao();
        this.nomeAutor = topico.getAutor().getNome();
        this.statusTopico = topico.getStatus();
        this.resposta = new ArrayList<>();
        this.resposta.addAll(topico.getRespostas().stream().map(RespotaDto::new).collect(Collectors.toList()));
    }
}
