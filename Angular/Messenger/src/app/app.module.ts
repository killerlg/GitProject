import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CurrentUserComponent } from './components/current-user/current-user.component';
import { CurrentGroupComponent } from './components/rightcolumn/current-group/current-group.component';
import { ListGroupComponent } from './components/list-group/list-group.component';
import { MessageComponent } from './components/rightcolumn/message/message.component';
import { SendMessageComponent } from './components/rightcolumn/send-message/send-message.component';
import { DisplayComponent } from './components/display/display.component';
import { RightcolumnComponent } from './components/rightcolumn/rightcolumn.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { AllGroupComponent } from './components/all-group/all-group.component';
import { AllJoinGroupComponent } from './components/all-group/all-join-group/all-join-group.component';
import { CustomPipePipe } from './pipe/custom-pipe.pipe';

@NgModule({
  declarations: [
    AppComponent,
    CurrentUserComponent,
    CurrentGroupComponent,
    ListGroupComponent,
    MessageComponent,
    SendMessageComponent,
    DisplayComponent,
    RightcolumnComponent,
    AllGroupComponent,
    AllJoinGroupComponent,
    CustomPipePipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
