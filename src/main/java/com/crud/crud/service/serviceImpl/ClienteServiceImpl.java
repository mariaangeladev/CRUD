package com.crud.crud.service.serviceImpl;

import com.crud.crud.service.ClienteService;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Override
    public String retornaNome() {
        return "Angela Marques Souza";
    }

    @Override
    public String retornaPedro() {
        return "Pedro";
    }

    @Override
    public int retornaCicera() {
        return 10;
    }

    @Override
    public Long retornaLong() {
        return 4l;
    }

    @Override
    public long retornalong() {
        return 2;
    }

    @Override
    public String retornanome() {
        return "claudio";
    }

    @Override
    public int retornaidade() {
        return 39;
    }

    @Override
    public String retornanome2() {
        return "Emanuela";
    }

    @Override
    public int resornaidade() {
        return 18;
    }

    @Override
    public String retornanome3() {
        return "clara";
    }

    @Override
    public int retornaidade3() {
        return 7;
    }

    @Override
    public int retornaGarota10() {
        return 6;
    }

    @Override
    public int resornaidade3() {
        return 7;
    }

    @Override
    public String retornamenina() {
        return "";
    }

    @Override
    public String retornamulher() {
        return "Damiana";
    }

    @Override
    public int resornadatanascimento() {
        return 28;
    }

    @Override
    public int resornaDataNascimento() {
        return 28;
    }

    @Override
    public String retornacidade() {
        return "floriano";
    }

    @Override
    public String retornahomem() {
        return "Geraldo de souza";
    }

    @Override
    public String retornafaculdade() {
        return "Faveni";
    }

    @Override
    public String retornalong2() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.of(1999, 6, 16);
        return date.format(formato);
    }

    @Override
    public String retornaestado() {
        return "ceará";
    }


}
