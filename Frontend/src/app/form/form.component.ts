import { Component } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {FormService} from "./form.service";


@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent {

  constructor(public formService:FormService) {
  }
  cilindrajeVehiculo:number
  tipoVehiculo:string

  blidado:number

  avaluo:number

  valorComercial:number

  impuesto:number;

  CalcularImpuesto(){

    if(this.tipoVehiculo == "moto"){
      if(this.cilindrajeVehiculo >= 125){
        this.impuesto = this.valorComercial*0.015
      }
    }else if(this.tipoVehiculo == "carro"){
      if(!this.blidado){
        if(this.valorComercial < 20000000){
          this.impuesto = this.valorComercial*0.015
        }else if(this.valorComercial <= 45000000 && this.valorComercial >= 20000000){
          this.impuesto = this.valorComercial * 0.025
        }else{
          this.impuesto = this.valorComercial * 0.035
        }
      }else{
        if(this.valorComercial < 20000000){
          this.impuesto = ((this.valorComercial*0.015)*0.1) + this.valorComercial*0.015
        }else if(this.valorComercial <= 45000000 && this.valorComercial >= 20000000){
          this.impuesto = ((this.valorComercial*0.025)*0.1) + this.valorComercial*0.025
        }else{
          this.impuesto = ((this.valorComercial*0.035)*0.1) + this.valorComercial*0.035
        }
      }
    }
  }

  guardar(){
    this.formService.saveForm(
      {"cilindrajeVehiculo":this.cilindrajeVehiculo,
      "tipoVehiculo":this.tipoVehiculo,
      "blidado":this.blidado,
      "valorComercial":this.valorComercial,
      "avaluo":this.avaluo,
      "impuesto":this.impuesto
      }).subscribe(resp => {
        console.log(resp)
    })
  }
}
