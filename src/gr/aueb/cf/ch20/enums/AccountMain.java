package gr.aueb.cf.ch20.enums;

public class AccountMain {

    public static void main(String[] args) {
        AccountType accountType = AccountType.CURRENT;

        // enum -> string
        String strAccountType = accountType.name();
        System.out.println(strAccountType);

        // string -> enum
        AccountType accountType1 = AccountType.valueOf(strAccountType);

        for (AccountType value : AccountType.values()) {
            System.out.print(value.name() + " ");       // string
            System.out.println(value.ordinal());        // ordinal number
        }
    }
}
