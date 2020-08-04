package br.com.testagibank.testeAgibank.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CreateModelsTest {

    @Test
    void createModel() {

        List<String> lines = new ArrayList<>();
        lines.add( "003ç1234ç[1-10-7,2-30-2.50,3-55-3.10]çPedro" );
        lines.add( "003ç1232ç[1-10-15,2-30-2.50,3-55-3.10]çJoao" );
        lines.add( "002ç2345675433444345çEduardo PereiraçUrbano" );
        lines.add( "002ç2445675434544345çJose da SilvaçRural" );
        lines.add( "001ç1234567891202çPedroç58" );

        Assertions.assertEquals( 1, CreateModels.createModel( lines ).getSellers().size() );
        Assertions.assertEquals( 2, CreateModels.createModel( lines ).getClients().size() );
        Assertions.assertEquals( 1232, CreateModels.createModel( lines ).getSales().get( 1 ).getId() );
    }
}