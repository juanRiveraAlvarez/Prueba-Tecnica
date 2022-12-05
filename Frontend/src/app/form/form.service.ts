import {Injectable} from "@angular/core";
import {Observable} from "rxjs";
import {HttpClient} from "@angular/common/http";

@Injectable({providedIn: 'root'})
export class FormService{
  private API_SERVER = "http://localhost:8080/api/"
  constructor(private httpCliet:HttpClient) {
  }
  public saveForm(registro:any){
    return this.httpCliet.post(this.API_SERVER,registro);
  }
}
