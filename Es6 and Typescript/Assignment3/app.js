"use strict";
//Q2
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Account = /** @class */ (function () {
    function Account(id, name, balance) {
        this.accountId = id;
        this.accountName = name;
        this.balance = balance;
    }
    Account.prototype.getBalance = function () {
        return this.balance;
    };
    return Account;
}());
var SavingAccount = /** @class */ (function (_super) {
    __extends(SavingAccount, _super);
    function SavingAccount(id, name, balance, interest) {
        var _this = _super.call(this, id, name, balance) || this;
        _this.interest = interest;
        return _this;
    }
    return SavingAccount;
}(Account));
var CurrentAccount = /** @class */ (function (_super) {
    __extends(CurrentAccount, _super);
    function CurrentAccount(id, name, balance, cashCredit) {
        var _this = _super.call(this, id, name, balance) || this;
        _this.cash_credit = cashCredit;
        return _this;
    }
    return CurrentAccount;
}(Account));
var savingAccount1 = new SavingAccount(1, "xyz", 1000, 5);
var currentAccount1 = new CurrentAccount(2, "xyz", 10000, 1000);
console.log(savingAccount1.getBalance() + currentAccount1.getBalance());
function print(data) {
    console.log(data);
}
var circle = {
    print: print("This is circle")
};
var employee = {
    print: print("This is employee")
};
function printAll(arr) {
    arr.forEach(function (x) { return x.print; });
}
var a = new Array();
a.push(circle);
a.push(employee);
printAll(a);
