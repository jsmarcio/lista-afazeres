package org.acme.model;

public class StatusResponse {

    private Integer status;
    private String descricao;

    public Integer getStatus() {
        return status;
    }

    public StatusResponse(Integer status, String descricao) {
        this.status = status;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "StatusResponse{" +
                "status=" + status +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
