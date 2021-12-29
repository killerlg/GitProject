import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {ExampleContainerComponent} from './example-container/example-container.component';
import {DynamicContentOneComponent} from './dynamic-content-one/dynamic-content-one.component';
import {DynamicContentTwoComponent} from './dynamic-content-two/dynamic-content-two.component';

@NgModule({
  declarations: [
    AppComponent,
    ExampleContainerComponent,
    DynamicContentOneComponent,
    DynamicContentTwoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent],
  entryComponents: [DynamicContentOneComponent, DynamicContentTwoComponent],
})

export class AppModule {
}
