package Board;
class AC1
{
    static int acNo;
    static String Name;
    static String pass;
    
    public static void Sumedh()
    {
        Name = "Sumedh";
        pass = "abcd";
        acNo = 123456789;
        
    }
    public static void Mickey()
    {
        AC1 obj2 = new AC1();
        obj2.Name = "Mickey";
        obj2.pass = "1234";
        obj2.acNo = 123456789;
    }
    public static void Minnie()
    {
        AC1 obj3 = new AC1();
        obj3.Name = "Minnie";
        obj3.pass = "1234";
        obj3.acNo = 123456789;
    }
    public static void Donald()
    {
        AC1 obj4 = new AC1();
        obj4.Name = "Donald";
        obj4.pass = "2345";
        obj4.acNo = 123456789;
    }
}