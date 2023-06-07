package unisinos.Onibus;

import java.util.Arrays;

public class onbus{
    private int linha;
    private String descricao;
    private String[] horarios;

    public onbus(){}

    public onbus(int linha, String descricao, String[] horarios){
        setLinha(linha);
        setDescricao(descricao);
        setHorarios(horarios);
    }

    public int getLinha(){
        return this.linha;
    }
    public void setLinha(int nome_linha){
        this.linha = nome_linha;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getHorarios(){
        return Arrays.toString(this.horarios);
    }
    public void setHorarios(String[] horarios){
        this.horarios = horarios;
    }
	@Override
	public String toString() {
		return "Onibus [linha=" + linha + ", descricao=" + descricao + ", horarios=" + Arrays.toString(horarios) + "]";
    }
}