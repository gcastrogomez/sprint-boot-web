package com.bolsadeideas.springboot.web.app.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.springboot.web.app.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {
	
	@Value("${texto.indexcontroller.index.titulo}")
	private String textoIndex;
	
	@Value("${texto.indexcontroller.perfil.titulo}")
	private String textoPerfil;
	
	@Value("${texto.indexcontroller.listar.titulo}")
	private String textoListar;	
	
	@GetMapping({ "/index", "/", "/home", "" })
	public String index(Model model) {
		model.addAttribute("titulo", textoIndex);
		return "index";
	}

	@RequestMapping("/perfil")
	public String perfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setName("Gonzalo");
		usuario.setLastname("Castro Gómez");
		usuario.setEmail("gonzalocg@gmail.com");
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", textoPerfil + usuario.getName());
		return "perfil";
	}

	@RequestMapping("/listar")
	public String listar(Model model) {

		model.addAttribute("titulo", textoListar);
		return "listar";
	}

	@ModelAttribute("usuarios")
	public List<Usuario> dameUsuarios() {

		List<Usuario> usuarios = Arrays.asList(new Usuario("Gonzalo", "Castro Gómez", "gonzalocg@gmail.com"),
				new Usuario("Martina", "Lobato Pérez", "martinalobato@gmail.com"),
				new Usuario("Máximo", "Décimo Meridio", "maxi@gmail.com"),
				new Usuario("Belén", "Rueda Martos", "brm@gmail.com"));
		return usuarios;
	}

}
