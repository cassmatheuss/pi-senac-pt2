/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pi.cardapiofacil.controller;


import com.pi.cardapiofacil.data.entity.ItemEntity;
import com.pi.cardapiofacil.data.repository.ItemRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 *
 * @author matheus
 */
@RestController
@RequestMapping("/api/itens")
public class ItemController {
    @Autowired
    private ItemRepository itemRepository;

    @GetMapping
    public List<ItemEntity> listarTodos() {
        return itemRepository.findAll();
    }   

    @GetMapping("/{id}")
    public ItemEntity buscarPorId(@PathVariable Long id) {
        return itemRepository.findById(id).orElse(null);
    }

    @PostMapping
    public ItemEntity criar(@Valid @RequestBody ItemEntity item) {
        return itemRepository.save(item);
    }

    @PutMapping("/{id}")
    public ItemEntity atualizar(@PathVariable Long id, @Valid @RequestBody ItemEntity item) {
        item.setId(id);
        return itemRepository.save(item);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        itemRepository.deleteById(id);
    }
}
