class CAR
{
void run()
{
System.out.println("CAR IS RUNNING");
}
}
class BIKE extends CAR
{
void run()
{
System.out.println("BIKE IS RUNNING FAST");
}
public static void main(String args[])
{
BIKE obj=new BIKE();
obj.run();
}
}
