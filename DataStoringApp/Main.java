import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.DataOutputStream;

public class Main {
    
    // Add a static method named textFileWrite() that returns no value. 
    //Inside the method, declare a Person object and use its toString() method to get the string representation.
    static void textFileWrite(){
        Person myPerson=new Person(null, 0, 0);
        String person_Content=myPerson.toString();    
    //Place the file writing code inside a try block, and catch any IOException that may occur.
    //Create an object of the FileWriter class, pointing to the file1.txt file, 
    //and use the write() method to save the Person object's data to the file.
        try{
            FileWriter myFileWriter=new FileWriter("file1.txt");

        }catch(IOException ioException){
            System.err.println(ioException.getMessage());
        }
        // In the Main.java file, declare a byte array to store a list of numbers.
        
        try{
            byte[] listOfNumbers={10,20,30,40};
            //Open a FileOutputStream object, pointing towards file3.txt file.
            FileOutputStream myFileOutputStream=new FileOutputStream("file3.txt");
            // Use a for loop to iterate over the array and call the write() method of the FileOutputStream object to print each element.
            for(int i=0;i<listOfNumbers.length;i++){
                myFileOutputStream.write(listOfNumbers[i]);
            }
            myFileOutputStream.close();
            System.out.println("File Written with Print writer");

        }catch(IOException ioException){
            System.err.println(ioException.getMessage());
        }
    }

    // Define printWrite() method, a static method that doesn’t return any data.
    static void printWrite(){
        //Take inputs from the user with Scanner class for name, age and weight and create an instance of a Person object with the inputs.
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter Person's name: ");
        String person_name=input.nextLine();
        System.out.println("Please enter Person's age: ");
        int person_age=input.nextInt();
        System.out.println("Please enter Person's weigth: ");
        double person_weigth=input.nextDouble();
        input.close();
        Person myPerson2=new Person(person_name, person_age, person_weigth);
        //Declare an object of the PrintWriter class, pointing to the file2.txt file in the current folder.
        // Then, use its println() method to write the String returned by the toString() method of the object.
        try{
            PrintWriter myPrintWriter=new PrintWriter("file2.txt");
            myPrintWriter.println(myPerson2.toString());
            myPrintWriter.close();
        }catch(IOException ioException){
            System.err.println(ioException.getMessage());
        }

    }
    public static void streamWrite() {
        try {
            FileOutputStream file = new FileOutputStream("file4.dat");
            DataOutputStream fileObj = new DataOutputStream(file);
            Person person = new Person("Nick", 25, 75);
            fileObj.writeUTF(person.name);
            fileObj.writeInt(person.age);
            fileObj.writeDouble(person.weight);
            fileObj.flush();
            fileObj.close();
            System.out.println("File written with DataOutputStream...");
        }
        catch(IOException e) {
            e.getStackTrace();
        }
    }
    public static void main(String[] args){
        textFileWrite();
        printWrite();
        streamWrite();
    }
}
