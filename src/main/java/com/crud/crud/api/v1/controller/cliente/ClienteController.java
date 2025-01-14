package com.crud.crud.api.v1.controller.cliente;



import com.crud.crud.api.v1.requestDTO.CarteiroRequestDTO;
import com.crud.crud.api.v1.requestDTO.VendedorRequestDTO;
import com.crud.crud.service.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;

@RestController
@RequestMapping(path = "/v1/user", produces = "application/json")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    //sou bonita
    /*
     * public é o tipo de acesso do metodo
     * String é o tipo de retorno do metodo
     * cliente é o nome do metodo*/
    @GetMapping
    public String cliente() {

        return clienteService.retornaNome();
    }

    @GetMapping("/user")
    public String user() {
        String resultado = clienteService.retornaPedro();
        return resultado;
    }

    @GetMapping("/cicera")
    public int cicera() {
        int resultado = clienteService.retornaCicera();
        return resultado;
    }

    @GetMapping("/long")
    public Long log() {
        long resultado = clienteService.retornalong();
        return resultado;
    }

    @GetMapping("/nome")
    public String nome() {
        String resultado = clienteService.retornanome();
        return resultado;
    }

    @GetMapping("/idade")
    public int claudio() {
        int resultado = clienteService.retornaidade();
        return resultado;
    }

    @GetMapping("/nome2")
    public String nor() {
        String resultado = clienteService.retornanome2();
        return resultado;
    }

    @GetMapping("/idade2")
    public int manu() {
        int resultado = clienteService.resornaidade();
        return resultado;
    }

    @GetMapping("/nome3")
    public String clara() {
        String resultado = clienteService.retornanome3();
        return resultado;
    }

    @GetMapping("/mulher")
    public String Damiana() {
        String resultado = clienteService.retornamulher();
        return "damiana";
    }

    @GetMapping("/DataNascimento")
    public int Damian() {
        int resultado = clienteService.resornaDataNascimento();
        return resultado;

    }

    @GetMapping("/cidade")
    public String floriano () {
        String resultado = clienteService.retornacidade();
        return resultado;
    }

    @GetMapping("/homem")
    public String Geraldo() {
        String resultado = clienteService.retornahomem();
        return resultado;
    }

    @GetMapping("/faculdade")
    public String Faveni() {
        String resultado = clienteService.retornafaculdade();
        return resultado;
    }

    @GetMapping("/long2")
    public String Data() {
        // As data sempre são no formato em ingles padrão é AAAA-MM-DD
        String resultado = clienteService.retornalong2();
        return resultado;
    }

    @GetMapping("/estado")
    public String ceará () {
        String resultado = clienteService.retornaestado();
        return resultado;
    }

    @PostMapping("/novo")
    public String newClient(@RequestBody String nome) {

        System.out.println(nome);
        return null;
    }

    // o nome do é metodo é chamado de assinatura do metodo.
    @PostMapping("/vendedor")
    public String newVendedor(@RequestBody VendedorRequestDTO vendedor) {

        if(vendedor.getNome() == null) {
            System.out.println("Nome do vendedor não pode ser null");
            return null;
        }
        System.out.println(vendedor.getNome());
        System.out.println(vendedor.getEmail());
        System.out.println(vendedor.getTelefone());
        System.out.println(vendedor.getSalario());
        System.out.println(vendedor.getLocalDeTrabalho());
        return "Deu certo";
    }

    @PostMapping("/carteiro")
    public String newCarteiro(@RequestBody CarteiroRequestDTO carteiro) {

        if(carteiro.getNome() == null) {
            System.out.println("Nome do carteiro não pode ser null");
        }
        System.out.println(carteiro.getNome());
        System.out.println(carteiro.getRota());
        System.out.println(carteiro.getTelefone());
        System.out.println(carteiro.getEmail());

        return "Deu certo";

    }


}



