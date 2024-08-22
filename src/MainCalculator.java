import java.util.Scanner;

public class MainCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Iphone calculation = new Iphone();
        Nokia calculation2 = new Nokia();
        Samsung calculation3 = new Samsung();
        Pixel calculation4 = new Pixel();
        System.out.println("1. Iphone");
        System.out.println("2. Nokia");
        System.out.println("3. Samsung");
        System.out.println("4. Pixel");
        System.out.print("Enter given number of what Phone brand calculator you want to use: ");
        int choiceOfPhoneBrand = sc.nextInt();
        try {
            switch (choiceOfPhoneBrand){
                case 1:
                    System.out.println("1.Addition");
                    System.out.println("2.Subtract");
                    System.out.println("3.Multiply");
                    System.out.println("4.Division");
                    System.out.println("5.Logarithm");
                    System.out.print("Enter which operator you want to use: ");
                    int mathOperatorsIphone = sc.nextInt();
                    // put try catch here in future
                    switch (mathOperatorsIphone){
                        case 1:
                            System.out.print("Please enter first number: ");
                            double iphoneAdd1 = sc.nextInt();
                            System.out.print("Please enter second number: ");
                            double iphoneAdd2 = sc.nextInt();
                            System.out.println("Addition of "+iphoneAdd1+" and "+ iphoneAdd2+" is "+ calculation.addition(iphoneAdd1,iphoneAdd2));
                            break;
                        case 2:
                            System.out.print("Please enter first number: ");
                            double iphoneSub1 = sc.nextInt();
                            System.out.print("Please enter second number: ");
                            double iphoneSub2 = sc.nextInt();
                            System.out.println("Subtraction of "+iphoneSub1+" and "+ iphoneSub2+" is "+ calculation.subtract(iphoneSub1,iphoneSub2));
                            break;
                        case 3:
                            System.out.print("Please enter first number: ");
                            double iphoneMul1 = sc.nextInt();
                            System.out.print("Please enter second number: ");
                            double iphoneMul2 = sc.nextInt();
                            System.out.println("Multiplication of "+iphoneMul1+" and "+ iphoneMul2+" is "+ calculation.multiply(iphoneMul1,iphoneMul2));
                            break;
                        case 4:
                            System.out.print("Please enter first number: ");
                            double iphoneDiv1 = sc.nextInt();
                            System.out.print("Please enter second number: ");
                            double iphoneDiv2 = sc.nextInt();
                            System.out.println("Division of "+iphoneDiv1+" to "+ iphoneDiv2+" is "+ calculation.division(iphoneDiv1,iphoneDiv2));
                            break;
                        case 5:
                            System.out.print("Please enter Argument: ");
                            double iphoneLog1 = sc.nextInt();
                            System.out.print("Please enter base: ");
                            double iphoneLog2 = sc.nextInt();
                            System.out.println("Logarithm base of "+iphoneLog2+" to "+ iphoneLog1+" is "+ calculation.logarithm(iphoneLog1,iphoneLog2));
                            break;
                            // it repeats 2 times, fix that
                    }
                case 2:
                    System.out.println("1.Addition");
                    System.out.println("2.Subtract");
                    System.out.println("3.Multiply");
                    System.out.println("4.Division");
                    System.out.println("5.Exponential");
                    System.out.print("Please enter which operator you want to use:");
                    int mathOperatorsNokia = sc.nextInt();
                    // put try catch here in future
                    switch (mathOperatorsNokia){
                        case 1:
                            System.out.print("Please enter first number: ");
                            double nokiaAdd1 = sc.nextInt();
                            System.out.print("Please enter second number: ");
                            double nokiaAdd2 = sc.nextInt();
                            System.out.println("Addition of "+nokiaAdd1+" and "+ nokiaAdd2+" is "+ calculation2.addition(nokiaAdd1,nokiaAdd2));
                            break;
                        case 2:
                            System.out.print("Please enter first number: ");
                            double nokiaSub1 = sc.nextInt();
                            System.out.print("Please enter second number: ");
                            double nokiaSub2 = sc.nextInt();
                            System.out.println("Subtraction of "+nokiaSub1+" and "+ nokiaSub2+" is "+ calculation2.subtract(nokiaSub1,nokiaSub2));
                            break;
                        case 3:
                            System.out.print("Please enter first number: ");
                            double nokiaMul1 = sc.nextInt();
                            System.out.print("Please enter second number: ");
                            double nokiaMul2 = sc.nextInt();
                            System.out.println("Multiplication of "+nokiaMul1+" and "+ nokiaMul2+" is "+ calculation2.multiply(nokiaMul1,nokiaMul2));
                            break;
                        case 4:
                            System.out.print("Please enter first number: ");
                            double nokiaDiv1 = sc.nextInt();
                            System.out.print("Please enter second number: ");
                            double nokiaDiv2 = sc.nextInt();
                            System.out.println("Division of "+nokiaDiv1+" to "+ nokiaDiv2+" is "+ calculation2.division(nokiaDiv1,nokiaDiv2));
                            break;
                        case 5:
                            System.out.print("Please enter number: ");
                            double nokiaExp1 = sc.nextInt();
                            System.out.println("Exponential of "+nokiaExp1+" is "+ calculation2.exponential(nokiaExp1));
                            break;
                    }
            }
        }catch (NumberFormatException ex){
            System.err.println("Input Error: Pleas write given numbers");
            ex.printStackTrace();
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            sc.close();
        }
    }
}
