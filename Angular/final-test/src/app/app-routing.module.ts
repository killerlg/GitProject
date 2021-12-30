import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {ListComponent} from './components/list/list.component';
import {EditComponent} from './components/edit/edit.component';


const routes: Routes = [{
  path: 'listallrecords',
  component: ListComponent
}, {
  path: 'edit/:id',
  component: EditComponent
}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
