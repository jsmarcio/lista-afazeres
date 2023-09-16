import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Item } from 'src/app/model/item';
import { CadastroItemService } from 'src/app/services/cadastro-item.service';

@Component({
  selector: 'app-cadastrar-item',
  templateUrl: './cadastrar-item.component.html',
  styleUrls: ['./cadastrar-item.component.css']
})
export class CadastrarItemComponent implements OnInit {

  formularioDeItem: FormGroup;

  constructor(private fb: FormBuilder, private router: Router, private cadastroItemService: CadastroItemService) {}

  ngOnInit(): void {
    this.criarFormularioDeItem();
  }

  enviarDados() {
    const itemFormulario = this.formularioDeItem.value;

    const item = new Item(itemFormulario.nome, itemFormulario.data, itemFormulario.descricao);

    this.cadastroItemService.cadastrar(item).subscribe(() => {
      alert(`O usuário ${itemFormulario.nome} foi cadastrado com sucesso. \n Dados: ${JSON.stringify(itemFormulario)}`);
      this.formularioDeItem.reset();
    });
  }

  criarFormularioDeItem() {
    this.formularioDeItem = this.fb.group({
      nome: ['',
        Validators.compose([
        Validators.required,
        Validators.minLength(3),
        Validators.maxLength(100)
      ])],
      data: ['', Validators.compose([Validators.required])],
      descricao: ['', Validators.compose([Validators.required])]
    });
  }

  get nome() {
    return this.formularioDeItem.get('nome');
  }

  get data() {
    return this.formularioDeItem.get('data');
  }

  get descricao() {
    return this.formularioDeItem.get('descricao');
  }

  voltar() {
    this.router.navigateByUrl('/home');
  }

}
