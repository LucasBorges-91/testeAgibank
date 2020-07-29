package br.com.testagibank.testeAgibank.service;

import br.com.testagibank.testeAgibank.model.FileDat;
import br.com.testagibank.testeAgibank.model.Item;
import br.com.testagibank.testeAgibank.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ItemService {

    @Autowired
    private ItemRepository repository;

    public Boolean save( FileDat fileDat ) {
        List<Item> itens = fileDat.getItens();

        itens.stream()
                .filter( item -> item.getId() != null && item.getQuantity() > 0 && item.getPrice() > 0 )
                .filter( item -> !itemIdCheck( item.getId() ) )
                .map( item ->  new Item( item.getId(), item.getPrice() ) )
                .forEach( item -> repository.save( item ) );

        return true;
    }

    public Boolean itemIdCheck( Integer id ) {
        Optional<Item> item = repository.findById( id );

        return item.isEmpty() ? false : true;
    }
}
