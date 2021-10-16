package com.algaworks.lojaveiculos.dominio.persistencia;

import com.algaworks.lojaveiculos.dominio.jpautil.JpaUtil;
import com.algaworks.lojaveiculos.dominio.entidade.Veiculo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.math.BigDecimal;

public class PersistindoVeiculos {
    public static void main(String[] args) {

        EntityManager manager = JpaUtil.getEntityManager();
        EntityTransaction tx = manager.getTransaction();
        tx.begin();


        Veiculo veiculo = new Veiculo();
        veiculo.setFabricante("Toyota");
        veiculo.setCor("Preto_Metalico");
        veiculo.setModelo("Hillux");
        veiculo.setAnoFabricacao(2021);
        veiculo.setAnoModelo(2021);
        veiculo.setValor(new BigDecimal(200000));

        manager.persist(veiculo);

        tx.commit();
        manager.close();
        JpaUtil.close();



    }
}
