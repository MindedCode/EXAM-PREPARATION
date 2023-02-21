
public class Main
{
   
	public static void main(String[] args) {
	    
    
		Table t = new Table();
		t.printTable();
	}
	
}



// 2nd file Table.java====================
import java.util.Scanner;
public class Table extends Main{

    
   
    
    public void printTable(){
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        for(int i = 1; i<11; i++){
            System.out.println(num  + " * " + i + " = " + num*i );
        }
    }
}

// Output is

// 23
// 23 * 1 = 23
// 23 * 2 = 46
// 23 * 3 = 69
// 23 * 4 = 92
// 23 * 5 = 115
// 23 * 6 = 138
// 23 * 7 = 161
// 23 * 8 = 184
// 23 * 9 = 207
// 23 * 10 = 230
