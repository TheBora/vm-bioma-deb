package br.com.deb.vm_bioma;

public class Model {
	String titulo;
	String subtitulo;
	String descricao;
	String tipo;
	String classificacao;
	String imagem;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getSubtitulo() {
		return subtitulo;
	}
	public void setSubtitulo(String subtitulo) {
		this.subtitulo = subtitulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	} 
	
	@Override
	public String toString() {
		return "Model [titulo=" + titulo + ", subtitulo=" + subtitulo + ", descricao=" + descricao + ", tipo=" + tipo
				+ ", classificacao=" + classificacao + ", imagem=" + imagem + "]";
	}
}
