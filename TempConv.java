import javax.swing.JOptionPane;

public class TempConv
{
	public void main(String [] args)// I am trying to lets the user choose between the 2 measuring systems he/she wants to convert to
	{
		String choice;
		String a;
		String b;

		choice = String.parseString(JOptionPane.showInputDialog("Choose Measuring System, A = Fahrenheit B = Celsius"));

		if(choice = "a" || choice = "A")
		{
			fahrenheit();
		}

		else if(choice = "b" || choice = "B")
		{
			celsius();
		}

		else
		{
			System.out.println("Invalid Command, Choose Between A Or B");
			System.exit(0);
		}


	}

	public void fahrenheit()//method for fahrenheit
	{
		double temp1;
		double result;

		temp1 = Double.parseDouble(JOptionPane.showInputDialog("Enter Fahrenheit Temperature"));

		result = ((temp1 -32.00) * (5.00/9.00));

		System.out.println(result);
	}
	public void celsius()//method for celsius
	{
		double temp1;
		double result;

		temp1 = Double.parseDouble(JOptionPane.showInputDialog("Enter Celsius Temperature"));

		result = ((temp1 * 5.00 / 9.00) + 32.00);

		System.out.println(result);
	}
}
