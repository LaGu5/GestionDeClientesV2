package com.example.GestionDeClientesV2.controller;

import com.example.GestionDeClientesV2.model.Cliente;
import com.example.GestionDeClientesV2.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class GestionDeClientesController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> listarClientes() {
        return clienteService.obtenerClientes();
    }

    @PostMapping
    public String crearCliente(@RequestBody Cliente cliente) {
        clienteService.agregarCliente(cliente);
        return "Cliente registrado con éxito.";
    }

    @GetMapping("/navegar")
    public String navegarProductos() {
        return clienteService.navegarProductos();
    }

    @GetMapping("/carrito")
    public String agregarAlCarrito() {
        return clienteService.agregarAlCarrito();
    }

    @GetMapping("/pedido")
    public String realizarPedido() {
        return clienteService.realizarPedido();
    }

    @GetMapping("/soporte")
    public String solicitarSoporte() {
        return clienteService.solicitarSoporte();
    }

    @GetMapping("/resena")
    public String dejarReseña() {
        return clienteService.dejarReseña();
    }
}
