package LAB3.Problem2;
import java.util.ArrayList;
import java.util.Scanner;
public class Menu 
{
    private ArrayList<String> phoneNumbers = new ArrayList<String>();
    private ArrayList<String> names = new ArrayList<String>();
    
    public Menu()
    {

    }

    public String getPhoneNumber(int pos)
    {
        return phoneNumbers.get(pos);
    }
    public void setPhoneNumber(String phoneNumber)
    {
        phoneNumbers.add(phoneNumber);
    }

    public String getName(int pos)
    {
        return names.get(pos);
    }
    public void setName(String name)
    {
        names.add(name);
    }

    public int lookUpFunction(String name)
    {   
        for (int i = 0; i < names.size(); i ++)
        {
            if(names.get(i).equals(name))
            {
                return i;
            }
        }
        return -1;
    }

    public void menuFunction()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("");
        System.out.println("___WELCOME___");
        System.out.println("_PHONE  BOOK_");
        System.out.println("");
        boolean isRunning = true;
        while(isRunning)
        {
            System.out.println("OPTION 1: ADD NEW ENTRY");
            System.out.println("OPTION 2: LIST ALL ENTRIES");
            System.out.println("OPTION 3: LOOKUP ENTRY");
            System.out.println("OPTION 4: QUIT");
            System.out.println("");
            System.out.print("ENTER OPTION #: ");
            int tempVar = in.nextInt();
            if(tempVar == 1)
            {
                System.out.println("");
                System.out.print("ENTER PHONE NUMBER: ");
                in.nextLine();
                setPhoneNumber(in.nextLine().trim()); 
                System.out.print("ENTER NAME: ");   
                setName(in.nextLine().trim());  
                System.out.println("");   
                System.out.print("ENTRY ADDED "); 
                System.out.println("");       
            }
            else if (tempVar == 2)
            {
                System.out.println("");
                System.out.println("PHONE NUMBERS:");
                System.out.println("");
                for(int i = 0; i < phoneNumbers.size(); i++)
                {
                    if(i == phoneNumbers.size() - 1)
                    {
                        System.out.print(phoneNumbers.get(i));
                    }
                    else
                    {
                        System.out.print(phoneNumbers.get(i) + ", ");
                    }
                }
                System.out.println("");
                System.out.println("NAMES:");
                System.out.println("");
                for(int i = 0; i < names.size(); i++)
                {
                    if(i == phoneNumbers.size() - 1)
                    {
                        System.out.print(names.get(i));
                    }
                    else
                    {
                        System.out.print(names.get(i) + ", ");
                    }
                }
                System.out.println("");
                in.nextLine();
            }
            else if (tempVar == 3)
            {
                System.out.println("");
                System.out.print("ENTER LOOKUP NAME: ");
                in.nextLine();
                int index = lookUpFunction(in.nextLine().trim());
                if(index != -1)
                {
                    System.out.println("FOUND " + names.get(index)+ " AT INDEX " + index);
                }
                else
                {
                    System.out.println("ENTRY NOT FOUND");
                }
                System.out.println("");
            }
            else
            {
                isRunning = false;
                break;
            }

        }
    }



}
