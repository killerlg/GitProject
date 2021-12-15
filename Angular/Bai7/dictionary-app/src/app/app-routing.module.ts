import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {DisplayComponent} from './display/display.component';
import {LookUpComponent} from './look-up/look-up.component';


const routes: Routes = [
  {
    path: 'display',
    component: DisplayComponent,
    children: [{
      path: ':word',
      component: LookUpComponent
    }]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
