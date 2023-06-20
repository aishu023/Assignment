import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BillComponent } from './bill/bill.component';
import { ReviewComponent } from './review/review.component';
import { RouterModule, Routes } from '@angular/router';
import { AddressComponent } from './address/address.component';


  const allLinks:Routes = [
    
  ]
  


@NgModule({
  declarations: [
    AppComponent,
    BillComponent,
    ReviewComponent,
    AddressComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,RouterModule.forRoot(allLinks)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
