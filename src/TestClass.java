enum AccountType
{
    SAVING, FIXED, CURRENT,EWDER;
    private AccountType()
    {
        System.out.println("It is a ++ type");
    }
}
class EnumOne
{
    public static void main(String[]args)
    {
        System.out.println(AccountType.FIXED);
    }
}