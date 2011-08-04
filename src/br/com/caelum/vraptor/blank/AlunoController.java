/***
 * Copyright (c) 2009 Caelum - www.caelum.com.br/opensource
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package br.com.caelum.vraptor.blank;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.validator.Validations;

@Resource
public class AlunoController {

	private final Result result;
	private Alunos alunos;
	private final Validator validator;

	public AlunoController(Result result, Validator validator, Alunos alunos) {
		this.result = result;
		this.validator = validator;
		this.alunos = alunos;
	}

	@Path("/")
	public void index() {
		result.include("alunos", alunos);
	}
	
	@Path("/novo")
	public void form() {
	}
	
	@Path("/salvar")
	public void salva(final Aluno felipe) {
		validator.checking(new Validations() {{
			that(!felipe.getNome().isEmpty(), "nome_nao_vazio");
		}});
		validator.onErrorForwardTo(AlunoController.class).form();
		alunos.adiciona(felipe);
		result.redirectTo(AlunoController.class).index();
	}

}
