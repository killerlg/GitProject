import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {DisplayComponent} from './components/display/display.component';
import {RightcolumnComponent} from './components/rightcolumn/rightcolumn.component';
import {AllGroupComponent} from './components/all-group/all-group.component';
import {AllJoinGroupComponent} from './components/all-group/all-join-group/all-join-group.component';



const routes: Routes = [{
  path: 'user/:id',
  component: DisplayComponent,
  children: [{
    path: 'group/:groupid',
    component: RightcolumnComponent
  }, {
    path: 'allgroup',
    component: AllGroupComponent,
    children: [{
      path: ':groupid',
      component: AllJoinGroupComponent
    }]
  }]
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
