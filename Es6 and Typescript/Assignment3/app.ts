//Q2

class Account {
    accountId: number;
    balance:number;
    accountName:string;
    

    constructor(id: number, name:string, balance:number){
        this.accountId = id;
        this.accountName = name;
        this.balance = balance;
    }

    getBalance(){
        return this.balance;
    }
}

class SavingAccount extends Account{
    interest:number;
    constructor(id: number, name:string, balance:number,interest:number){
        super(id,name,balance);
        this.interest = interest;
    }
}

class CurrentAccount extends Account{
    cash_credit:number;
    constructor(id: number, name:string, balance:number,cashCredit:number){
        super(id,name,balance);
        this.cash_credit = cashCredit;
    }
}

let savingAccount1:SavingAccount = new SavingAccount(1,"xyz",1000,5);
let currentAccount1:CurrentAccount = new CurrentAccount(2,"xyz",10000,1000);

console.log(savingAccount1.getBalance()+currentAccount1.getBalance());

//Q3

interface Printable{
    print(data:string):any;
}

function print(data:string):any{
    console.log(data);
}

let circle:Printable={
    print:print("This is circle")
}

let employee:Printable={
    print:print("This is employee")
}

function printAll(arr:Array<Printable>){
    arr.forEach(x=>x.print);
}
let a = new Array<Printable>();
a.push(circle);
a.push(employee);
printAll(a);