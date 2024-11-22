class AA
{
    AA()
      {
        System.out.println("AA Const");
    }
static{
    System.out.println("SIB-Main");
}
public static void main(String[] args)
{
    System.out.println("mamin Start");
    AA a = new AA();
    AA a1 = new AA();
}
}