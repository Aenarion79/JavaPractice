import javax.swing.JOptionPane;

public class TempConv
{
	public void main(String [] args)
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

	public void fahrenheit()
	{
		double temp1;
		double result;

		temp1 = Double.parseDouble(JOptionPane.showInputDialog("Enter Fahrenheit Temperature"));

		result = ((temp1 -32.00) * (5.00/9.00));

		System.out.println(result);
	}
	public void celsius()
	{
		double temp1;
		double result;

		temp1 = Double.parseDouble(JOptionPane.showInputDialog("Enter Celsius Temperature"));

		result = ((temp1 * 5.00 / 9.00) + 32.00);

		System.out.println(result);
	}
}