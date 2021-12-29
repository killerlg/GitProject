import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'customPipe'
})
export class CustomPipePipe implements PipeTransform {

  transform(value: any, filterName: string, propName: string): any {
    if (value.length === 0 || filterName === '') {
      return  value;
    }
    const newArray = [];
    for (const item of value) {
      if (item[propName].indexOf(filterName) !== -1) {
        newArray.push(item);
      }
    }
    return newArray;
  }

}
