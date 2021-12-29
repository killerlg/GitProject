import {Component, ComponentFactoryResolver, OnInit, ViewChild, ViewContainerRef} from '@angular/core';
import {DynamicContentOneComponent} from '../dynamic-content-one/dynamic-content-one.component';
import {DynamicContentTwoComponent} from '../dynamic-content-two/dynamic-content-two.component';

@Component({
  selector: 'app-example-container',
  templateUrl: './example-container.component.html',
  styleUrls: ['./example-container.component.css']
})
export class ExampleContainerComponent implements OnInit {
  @ViewChild('dynamicComponent', {read: ViewContainerRef, static: true})
  containerRef: ViewContainerRef;

  constructor(private cfr: ComponentFactoryResolver) {
  }

  ngOnInit() {
  }

  addDynamicCompOne() {
    const componentFactory = this.cfr.resolveComponentFactory(
      DynamicContentOneComponent
    );
    this.containerRef.clear();
    const componentRef = this.containerRef.createComponent(componentFactory);

    componentRef.instance.data = 'INPUT DATA 1';
  }

  addDynamicCompTwo() {
    const componentFactory = this.cfr.resolveComponentFactory(
      DynamicContentTwoComponent
    );
    this.containerRef.clear();
    const componentRef = this.containerRef.createComponent(componentFactory);

    componentRef.instance.data = 'INPUT DATA 2';
  }

  clearDynamicComp() {
    this.containerRef.clear();
  }

}
