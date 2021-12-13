function isFibonacci(number:number): boolean {
    let check = true;
    let a:number =0;
    let b:number =1;
    let temp:number;
    if (a == number || b == number) {
        return check;
    }
    while (a+b <= number) {
        if (number == a+b) {
            return check;
        }
        temp = a;
        a = b;
        b = temp + b;
    }
    check = false;
    return check;
}
let sum:number =0;
for (let a = 0; a< 30; a++) {
    if(isFibonacci(a)) {
        sum += a;
    }
}
console.log(sum)