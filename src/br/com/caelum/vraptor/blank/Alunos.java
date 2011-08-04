package br.com.caelum.vraptor.blank;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.vraptor.ioc.ApplicationScoped;
import br.com.caelum.vraptor.ioc.Component;

@Component
@ApplicationScoped
public class Alunos {
	private List<Aluno> alunos = new ArrayList<Aluno>();
	
	public void adiciona(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public List<Aluno> getLista() {
		return alunos;
	}
}
