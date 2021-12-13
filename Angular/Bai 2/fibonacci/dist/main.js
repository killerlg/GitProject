function isFibonacci(number) {
    let check = true;
    let a = 0;
    let b = 1;
    let temp;
    if (a == number || b == number) {
        return check;
    }
    while (a + b <= number) {
        if (number == a + b) {
            return check;
        }
        temp = a;
        a = b;
        b = temp + b;
    }
    check = false;
    return check;
}
let sum = 0;
for (let a = 0; a < 30; a++) {
    if (isFibonacci(a)) {
        sum += a;
    }
}
console.log(sum);
//# sourceMappingURL=main.js.map