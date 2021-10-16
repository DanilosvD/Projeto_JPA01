package com.algaworks.lojaveiculos.dominio.entidade;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

    @Entity
    @Table(name = "tabela_veiculo")
    public class Veiculo {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long codigo;

        @Column(length = 60, nullable = false)
        private String fabricante;

        @Column(length = 60, nullable = false)
        private String cor;

        @Column(length = 60, nullable = false)
        private String modelo;

        @Column(name = "ano_fabricacao", nullable = false)
        private Integer anoFabricacao;

        @Column(name = "ano_modelo", nullable = false)
        private Integer anoModelo;

        @Column(precision = 10,scale = 2, nullable = true)
        private BigDecimal valor;


        @Override
        public int hashCode() {
            return Objects.hash(codigo);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Veiculo veiculo = (Veiculo) o;
            return codigo.equals(veiculo.codigo);
        }

        public Long getCodigo(Long codigo){
            return codigo;
        }

        public void setCodigo(){
            this.codigo = codigo;
        }

        public String getFabricante() {
            return fabricante;
        }

        public void setFabricante(String fabricante) {
            this.fabricante = fabricante;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public Integer getAnoFabricacao() {
            return anoFabricacao;
        }

        public void setAnoFabricacao(Integer anoFabricacao) {
            this.anoFabricacao = anoFabricacao;
        }

        public Integer getAnoModelo() {
            return anoModelo;
        }

        public void setAnoModelo(Integer anoModelo) {
            this.anoModelo = anoModelo;
        }

        public BigDecimal getValor() {
            return valor;
        }

        public void setValor(BigDecimal valor) {
            this.valor = valor;
        }
        public String getCor() {
            return cor;
        }

        public void setCor(String cor) {
            this.cor = cor;
        }

}
