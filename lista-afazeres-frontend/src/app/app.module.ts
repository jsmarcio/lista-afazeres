import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from "@angular/forms";
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { RouterModule } from '@angular/router';
import { ButtonModule } from 'primeng/button';
import { CardModule } from 'primeng/card';
import { InputTextModule } from 'primeng/inputtext';
import { AppComponent } from './app.component';
import { CadastrarItemComponent } from './components/cadastrar-item/cadastrar-item.component';
import { HomeComponent } from './components/home/home.component';
import { CadastroItemService } from './services/cadastro-item.service';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    CadastrarItemComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    ReactiveFormsModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {
         path: '',
         component: HomeComponent
      },
      {
        path: 'home',
        component: HomeComponent,
      },
      {
        path: 'cadastrar-item',
        component: CadastrarItemComponent
      }
   ]),

    // Componentes PrimeNG
    ButtonModule,
    InputTextModule,
    CardModule

  ],
  providers: [CadastroItemService],
  bootstrap: [AppComponent]
})
export class AppModule { }
