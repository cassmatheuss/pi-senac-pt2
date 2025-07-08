/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pi.cardapiofacil.data.repository;
import com.pi.cardapiofacil.data.entity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author matheus
 */

public interface ItemRepository extends JpaRepository<ItemEntity, Long> {
}

