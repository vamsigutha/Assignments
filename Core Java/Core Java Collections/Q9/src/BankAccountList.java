import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class BankAccountList {
    private TreeSet<SavingAccount> savingAccounts = new TreeSet<>();

    public boolean addSavingAccount(SavingAccount savingAccount) {
        return savingAccounts.add(savingAccount);
    }

    public List<Integer> displaySavingAccountIds() {
        List<Integer> ids = new ArrayList<>();
        for(SavingAccount account:savingAccounts){
            ids.add(account.getAcc_ID());
        }
        return ids;
    }
}
